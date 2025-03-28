package com.mxgraph.io.gliffy.model;

public class ShapeStyles
{
    private GlobalTextStyles global;

    public ShapeStyles(GlobalTextStyles global)
    {
        this.global = global;
    }

    public GlobalTextStyles getGlobal()
    {
        return global;
    }

    public void setGlobal(GlobalTextStyles global)
    {
        this.global = global;
    }
}
