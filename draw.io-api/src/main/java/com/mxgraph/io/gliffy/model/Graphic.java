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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Graphic
{

	public static enum Type
	{
		@SerializedName("Svg") SVG,
		@SerializedName("Line") LINE,
		@SerializedName("Shape") SHAPE,
		@SerializedName("Text") TEXT,
		@SerializedName("Image") IMAGE,
		@SerializedName("Link") LINK,
		@SerializedName("Mindmap") MINDMAP,
		@SerializedName("PopupNote") POPUPNOTE,
		@SerializedName("Unwknown") UNKNOWN;
		

		public String toString()
		{
			return this.name();
		}
	}

	public static abstract class GliffyAbstractShape
	{
		private float strokeWidth;

		public String strokeColor;

		public String fillColor;

		public String dashStyle;
		
		public int getStrokeWidth() {
			return Math.round(strokeWidth);
		}
	}

	public static class GliffyLine extends GliffyAbstractShape
	{
		public Integer startArrow;

		public Integer endArrow;

		public String interpolationType;
		
		public Integer cornerRadius;

		public List<float[]> controlPath = new ArrayList<float[]>();
	}

	public static class GliffyShape extends GliffyAbstractShape
	{
		public String tid;

		public boolean gradient;

		public boolean dropShadow;

		public int state;

		public float shadowX;

		public float shadowY;

		public float opacity;

		/**
		 * @return true if there is no_fill string found in this element
		 */
		public boolean isNoFill()
		{
			if (tid != null)
			{
				return tid.contains("no_fill");
			}
			return false;
		}

	}

	public static class GliffyImage extends GliffyShape
	{
		private String url;

		public String getUrl()
		{
			return url.replace(";base64", "");
		}
	}

	public static class GliffySvg extends GliffyShape
	{
		public Integer embeddedResourceId;
	}
	
	public static class GliffyMindmap extends GliffyShape
	{
	}
	
	public static class GliffyPopupNote extends GliffyShape 
	{
		public String text;
	}
	
	public static class GliffyLink
	{
		String href;
		boolean renderIcon;
	}

	public Type type;

	public GliffyText Text;

	public GliffyLine Line;
	
	public GliffyLink Link;

	public GliffyShape Shape;

	public GliffyImage Image;

	public GliffySvg Svg;
	
	public GliffyMindmap Mindmap;
	
	public GliffyPopupNote PopupNote;
	
	public Graphic()
	{
		super();
	}

	public Type getType()
	{
		return type != null ? type : Type.UNKNOWN;
	}

	public GliffyText getText()
	{
		return Text;
	}

	public GliffyLine getLine()
	{
		return Line;
	}
	
	public GliffyLink getLink()
	{
		return Link;
	}

	public GliffyShape getShape()
	{
		return Shape;
	}

	public GliffyImage getImage()
	{
		return Image;
	}
	
	public GliffyMindmap getMindmap() 
	{
		return Mindmap;
	}

	public GliffyPopupNote getPopupNote() {
		return PopupNote;
	}


}
