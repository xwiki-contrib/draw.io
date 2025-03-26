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

import java.util.List;

public class Scene
{
    public List<GliffyObject> objects;
    public ImageCache imageCache;
    public String background;
    public int width;
    public int height;
    public int maxWidth;
    public int maxHeight;
    public int nodeIndex;
    public boolean autoFit;
    public boolean exportBorder;
    public boolean gridOn;
    public boolean snapToGrid;
    public boolean drawingGuidesOn;
    public boolean diagramEditable;
    public ShapeStyles shapeStyles;
    public LineStyles lineStyles;
    public TextStyles textStyles;
    public String themeData;
    public String viewportType;
    public List<GliffyLayer> layers;
    public FitBB fitBB;

    public Scene(List<GliffyObject> objects, ImageCache imageCache, String background, int width, int height, int maxWidth,
        int maxHeight, int nodeIndex, boolean autoFit, boolean exportBorder, boolean gridOn, boolean snapToGrid,
        boolean drawingGuidesOn, boolean diagramEditable, ShapeStyles shapeStyles,
        LineStyles lineStyles, TextStyles textStyles, String themeData, String viewportType,
        List<GliffyLayer> layers, FitBB fitBB)
    {
        this.objects = objects;
        this.imageCache = imageCache;
        this.background = background;
        this.width = width;
        this.height = height;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.nodeIndex = nodeIndex;
        this.autoFit = autoFit;
        this.exportBorder = exportBorder;
        this.gridOn = gridOn;
        this.snapToGrid = snapToGrid;
        this.drawingGuidesOn = drawingGuidesOn;
        this.diagramEditable = diagramEditable;
        this.shapeStyles = shapeStyles;
        this.lineStyles = lineStyles;
        this.textStyles = textStyles;
        this.themeData = themeData;
        this.viewportType = viewportType;
        this.layers = layers;
        this.fitBB = fitBB;
    }
}
