package com.mxgraph.io.gliffy.importer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.google.gson.GsonBuilder;
import com.mxgraph.io.gliffy.model.DiagramNew;
import com.mxgraph.io.gliffy.model.Page;

/**
 * Convert gliffy diagrams with multiple pages.
 */
public class GliffyDiagramConverterMultiplePages
{
    Logger logger = Logger.getLogger("GliffyDiagramConverter");

    DiagramNew gliffyDiagram;

    /**
     * Constructs a new converter and starts a conversion.
     *
     * @param gliffyDiagramString JSON string of a gliffy diagram
     */
    public GliffyDiagramConverterMultiplePages(String gliffyDiagramString)
    {
        // creates a diagram object from the JSON string
        this.gliffyDiagram = new GsonBuilder().registerTypeAdapterFactory(new PostDeserializer()).create()
            .fromJson(gliffyDiagramString, DiagramNew.class);
    }

    public String getGraphXml()
    {
        String resultXML = null;
        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = factory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element mxfile = doc.createElement("mxfile");

            Element diagramElement;
            String xml;
            for (Page diagramPage : this.gliffyDiagram.pages) {
                NewGliffyDiagramConverter converter =
                    new NewGliffyDiagramConverter(diagramPage, this.gliffyDiagram.embeddedResources);
                xml = converter.getGraphXml();
                diagramElement = doc.createElement("diagram");
                diagramElement.setAttribute("id", diagramPage.getId());
                diagramElement.setAttribute("name", diagramPage.getTitle());

                ByteArrayInputStream input = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
                Document gliffyDoc = docBuilder.parse(input);

                Node importedNode = doc.importNode(gliffyDoc.getDocumentElement(), true);
                diagramElement.appendChild(importedNode);
                mxfile.appendChild(diagramElement);
            }

            doc.appendChild(mxfile);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StringWriter writer = new StringWriter();

            transformer.transform(source, new StreamResult(writer));
            resultXML = writer.getBuffer().toString();
        } catch (TransformerException | ParserConfigurationException | IOException | SAXException e) {
            logger.severe("Error while transforming gliffy diagram into xml.");
        }
        return resultXML;
    }
}
