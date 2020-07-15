package com.promobility.io.androidrecyclerview.model;

public class DataModel {

    String name;
    String versions;

    public DataModel(String name, String version) {
        this.name = name;
        this.versions = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }
}
