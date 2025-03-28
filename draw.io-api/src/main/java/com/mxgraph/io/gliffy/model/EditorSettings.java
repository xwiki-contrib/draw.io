package com.mxgraph.io.gliffy.model;

public class EditorSettings
{
    private boolean exportBorder;
    private String loadPosition;
    private boolean autosaveDisabled;

    public EditorSettings(boolean exportBorder, String loadPosition, boolean autosaveDisabled)
    {
        this.exportBorder = exportBorder;
        this.loadPosition = loadPosition;
        this.autosaveDisabled = autosaveDisabled;
    }

    public boolean isExportBorder()
    {
        return exportBorder;
    }

    public void setExportBorder(boolean exportBorder)
    {
        this.exportBorder = exportBorder;
    }

    public String getLoadPosition()
    {
        return loadPosition;
    }

    public void setLoadPosition(String loadPosition)
    {
        this.loadPosition = loadPosition;
    }

    public boolean isAutosaveDisabled()
    {
        return autosaveDisabled;
    }

    public void setAutosaveDisabled(boolean autosaveDisabled)
    {
        this.autosaveDisabled = autosaveDisabled;
    }
}
