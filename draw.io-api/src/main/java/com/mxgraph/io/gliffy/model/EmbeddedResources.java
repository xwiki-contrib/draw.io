/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.mxgraph.io.gliffy.model;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;

public class EmbeddedResources
{

	public static class Resource
	{
		public Integer id;

		public String mimeType;

		public String data;

		public Resource() {
		}

		public String getBase64EncodedData()
		{
			try
			{
				return Base64.encodeBase64String(data.getBytes("UTF-8"));
			}
			catch (UnsupportedEncodingException e)
			{
				throw new RuntimeException(e);
			}
		}
	}

	public List<Resource> resources;

	public Map<Integer, Resource> resourceMap;

	public void setResources(List<Resource> resources)
	{
		this.resources = resources;
	}

	public Resource get(Integer id)
	{
		if (resourceMap == null)
		{
			resourceMap = new HashMap<Integer, Resource>();
			for (Resource r : resources)
			{
				resourceMap.put(r.id, r);
			}
		}

		return resourceMap.get(id);
	}

}
