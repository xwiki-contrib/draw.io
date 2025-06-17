package com.mxgraph.io.gliffy.model;

import java.util.List;

public class Stage {
    private String background;

    public String color;

    private float width;

    private float height;

    public float maxWidth;

    public float maxHeight;

    public int nodeIndex;

    private boolean autoFit;

    public boolean exportBorder;

    private boolean gridOn;

    public boolean snapToGrid;

    private boolean drawingGuidesOn;

    public boolean diagramEditable;

    public boolean pageBreaksOn;

    public boolean printGridOn;

    public boolean printPaper;

    public boolean printShrinkToFit;

    public boolean printPortrait;

    public ThemeData themeData;

    public String viewportType;

    public ShapeStyles shapeStyles;

    public LineStyles lineStyles;

    public ImageCache imageCache;

    private List<GliffyObject> objects;

    private List<GliffyLayer> layers;

    private TextStyles textStyles;

    public FitBB fitBB;

    public PrintModel printModel;

    public Stage()
    {
    }

    public String getBackgroundColor()
    {
        return background;
    }

    public void setBackground(String background)
    {
        this.background = background;
    }

    public float getWidth()
    {
        return width;
    }

    public void setWidth(float width)
    {
        this.width = width;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }

    public boolean isAutoFit()
    {
        return autoFit;
    }

    public void setAutoFit(boolean autofit)
    {
        this.autoFit = autofit;
    }

    public boolean isGridOn()
    {
        return gridOn;
    }

    public void setGridOn(boolean gridOn)
    {
        this.gridOn = gridOn;
    }

    public boolean isDrawingGuidesOn()
    {
        return drawingGuidesOn;
    }

    public void setDrawingGuidesOn(boolean drawingGuidesOn)
    {
        this.drawingGuidesOn = drawingGuidesOn;
    }

    public List<GliffyObject> getObjects()
    {
        return objects;
    }

    public void setObjects(List<GliffyObject> objects)
    {
        this.objects = objects;
    }

    public List<GliffyLayer> getLayers() {
        return layers;
    }

    public void setLayers(List<GliffyLayer> layers) {
        this.layers = layers;
    }

    public TextStyles getTextStyles()
    {
        return textStyles;
    }

    public void setTextStyles(TextStyles textStyles)
    {
        this.textStyles = textStyles;
    }
}
