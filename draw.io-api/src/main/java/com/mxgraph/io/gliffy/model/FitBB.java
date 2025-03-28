package com.mxgraph.io.gliffy.model;

public class FitBB
{
    private Fit min;
    private Fit max;

    public FitBB(Fit min, Fit max)
    {
        this.min = min;
        this.max = max;
    }

    public Fit getMin()
    {
        return min;
    }

    public void setMin(Fit min)
    {
        this.min = min;
    }

    public Fit getMax()
    {
        return max;
    }

    public void setMax(Fit max)
    {
        this.max = max;
    }
}
