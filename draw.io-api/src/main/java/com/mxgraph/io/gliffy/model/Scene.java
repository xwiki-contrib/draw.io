package com.mxgraph.io.gliffy.model;

import java.util.List;

public class Scene
{
    public List<GliffyObject> objects;

    public ImageCache imageCache;

    public String background;

    public String backgroundColor;

    public float width;

    public float height;

    public float maxWidth;

    public float maxHeight;

    public int nodeIndex;

    public boolean printPortrait;

    public boolean autoFit;

    public boolean exportBorder;

    public boolean gridOn;

    public boolean snapToGrid;

    public boolean drawingGuidesOn;

    public boolean diagramEditable;

    public boolean pageBreaksOn;

    public boolean printGridOn;

    public boolean printPaper;

    public boolean printShrinkToFit;

    public ShapeStyles shapeStyles;

    public LineStyles lineStyles;

    public TextStyles textStyles;

    public String themeData;

    public String viewportType;

    public List<GliffyLayer> layers;

    public FitBB fitBB;

    public Scene(List<GliffyObject> objects, ImageCache imageCache, String background, int width, int height,
        int maxWidth, int maxHeight, int nodeIndex, boolean autoFit, boolean exportBorder, boolean gridOn,
        boolean snapToGrid, boolean drawingGuidesOn, boolean diagramEditable, ShapeStyles shapeStyles,
        LineStyles lineStyles, TextStyles textStyles, String themeData, String viewportType, List<GliffyLayer> layers,
        FitBB fitBB)
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
