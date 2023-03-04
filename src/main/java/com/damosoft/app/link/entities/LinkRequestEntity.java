package com.damosoft.app.link.entities;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;

import java.time.LocalDateTime;

public class LinkRequestEntity extends ReactivePanacheMongoEntity {
    public String requestedResourceUuid;
    public ResourceTypeEnum resourceType;
    public String requesterIdentityUuid;
    public LocalDateTime requestCreationDate;
    public LocalDateTime proposedTime;
}
