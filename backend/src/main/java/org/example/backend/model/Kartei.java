package org.example.backend.model;

import java.util.UUID;

public class Kartei {
    private String id;
    private String name;
    private String description;
    private boolean publicAccess;
    private String ownerID;

    public Kartei() {
        this.id = UUID.randomUUID().toString();
    }

    public Kartei(String name, String description, boolean publicAccess, String ownerID) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.publicAccess = publicAccess;
        this.ownerID = ownerID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(boolean publicAccess) {
        this.publicAccess = publicAccess;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }
}
