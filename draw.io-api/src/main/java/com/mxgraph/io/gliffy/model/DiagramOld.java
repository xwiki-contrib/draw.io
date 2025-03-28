package com.mxgraph.io.gliffy.model;

/**
 * Class corresponding to the old gliffy diagram structure.
 */
public class DiagramOld
{
    private String version;

    public String contentType;

    public Stage stage;

    public Metadata metadata;

    public EmbeddedResources embeddedResources;

    public DiagramOld()
    {
        super();
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }
}
