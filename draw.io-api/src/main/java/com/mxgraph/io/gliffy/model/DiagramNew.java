package com.mxgraph.io.gliffy.model;

import java.util.List;

/**
 * Class corresponding with the new gliffy diagram structure, that can contain multiple pages and has several nodes
 * name changes.
 */
public class DiagramNew
{
    public String version;

    public EmbeddedResources embeddedResources;

    public String title;

    public String contentType;

    public int revision;

    public String defaultPage;

    public long lastSerialized;

    public List<String> libraries;

    public EditorSettings editorSettings;

    public PrintModel printModel;

    public List<String> resources;

    public List<Page> pages;

    public DiagramNew(String version, EmbeddedResources embeddedResources, String title, String contentType, int revision,
        String defaultPage, long lastSerialized, List<String> libraries, EditorSettings editorSettings,
        PrintModel printModel, List<String> resources, List<Page> pages)
    {
        this.version = version;
        this.embeddedResources = embeddedResources;
        this.title = title;
        this.contentType = contentType;
        this.revision = revision;
        this.defaultPage = defaultPage;
        this.lastSerialized = lastSerialized;
        this.libraries = libraries;
        this.editorSettings = editorSettings;
        this.printModel = printModel;
        this.resources = resources;
        this.pages = pages;
    }
}
