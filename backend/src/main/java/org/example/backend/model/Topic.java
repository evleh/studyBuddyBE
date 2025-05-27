package org.example.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Topic {

    @Id
    private String id;
    private String ownerID;
    private String name;
    private String description;
    private boolean publicAccess;


    public Topic() {
        this.id = UUID.randomUUID().toString();
    }

    public Topic(String name, String description, boolean publicAccess, String ownerID) {
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
