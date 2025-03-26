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

public class Diagram
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

    public Diagram(String version, EmbeddedResources embeddedResources, String title, String contentType, int revision,
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
