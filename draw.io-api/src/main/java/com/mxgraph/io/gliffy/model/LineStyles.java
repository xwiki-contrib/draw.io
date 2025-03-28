package com.mxgraph.io.gliffy.model;

public class LineStyles
{
    private GlobalTextStyles global;

    public LineStyles(com.mxgraph.io.gliffy.model.GlobalTextStyles global)
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
