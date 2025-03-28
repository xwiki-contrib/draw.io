/**
 * $Id: OpenServlet.java,v 1.12 2013/10/16 12:31:25 david Exp $ Copyright (c) 2011-2012, JGraph Ltd
 */
package com.mxgraph.online.gliffy;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class OpenServlet
 */
public class OpenServletUtils extends HttpServlet
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public static final int PNG_CHUNK_ZTXT = 2052348020;

    /**
     *
     */
    public static final int PNG_CHUNK_IEND = 1229278788;


    // NOTE: Key length must not be longer than 79 bytes (not checked)
    protected String extractXmlFromPng(byte[] data)
    {
        Map<String, String> textChunks = decodeCompressedText(new ByteArrayInputStream(data));

        return (textChunks != null) ? textChunks.get("mxGraphModel") : null;
    }

    /**
     * Decodes the zTXt chunk of the given PNG image stream.
     */
    public static Map<String, String> decodeCompressedText(InputStream stream)
    {
        Map<String, String> result = new Hashtable<String, String>();

        if (!stream.markSupported()) {
            stream = new BufferedInputStream(stream);
        }
        DataInputStream distream = new DataInputStream(stream);

        try {
            long magic = distream.readLong();

            if (magic != 0x89504e470d0a1a0aL) {
                throw new RuntimeException("PNGImageDecoder0");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("PNGImageDecoder1");
        }

        try {
            while (distream.available() > 0) {
                int length = distream.readInt();
                int type = distream.readInt();
                byte[] data = new byte[length];
                distream.readFully(data);
                distream.readInt(); // Move past the crc

                if (type == PNG_CHUNK_IEND) {
                    return null;
                } else if (type == PNG_CHUNK_ZTXT) {
                    int currentIndex = 0;
                    while ((data[currentIndex++]) != 0) {
                    }

                    String key = new String(data, 0, currentIndex - 1);

                    try {
                        byte[] bytes = Arrays.copyOfRange(data, currentIndex + 1, data.length);
                        String value = URLDecoder.decode(Utils.inflate(bytes), Utils.CHARSET_FOR_URL_ENCODING);
                        result.put(key, value);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    // No need to parse the rest of the PNG
                    return result;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
