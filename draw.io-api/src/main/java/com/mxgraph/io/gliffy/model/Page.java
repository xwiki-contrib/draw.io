package com.mxgraph.io.gliffy.model;

public class Page
{
    private String type;
    private String id;
    private String title;
    private int index;
    private boolean external;
    private Scene scene;

    public Page(String type, String id, String title, int index, boolean external,
        Scene scene)
    {
        this.type = type;
        this.id = id;
        this.title = title;
        this.index = index;
        this.external = external;
        this.scene = scene;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public boolean isExternal()
    {
        return external;
    }

    public void setExternal(boolean external)
    {
        this.external = external;
    }

    public Scene getScene()
    {
        return scene;
    }

    public void setScene(Scene scene)
    {
        this.scene = scene;
    }
}
