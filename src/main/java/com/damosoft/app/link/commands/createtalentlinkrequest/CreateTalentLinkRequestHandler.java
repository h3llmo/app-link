package com.damosoft.app.link.commands.createtalentlinkrequest;

import com.damosoft.app.link.entities.LinkRequestEntity;
import com.damosoft.app.link.entities.ResourceTypeEnum;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreateTalentLinkRequestHandler {
    public Uni<LinkRequestEntity> create(CreateTalentLinkRequestCommand command) {
        return Uni
                .createFrom()
                .item(() -> {
                    final LinkRequestEntity linkRequestEntity = new LinkRequestEntity();
                    linkRequestEntity.requestedResourceUuid = command.getTalentUuid();
                    linkRequestEntity.resourceType = ResourceTypeEnum.TALENT;
                    linkRequestEntity.proposedTime = command.getProposedTime();
                    linkRequestEntity.requesterIdentityUuid = command.getRequesterIdentityUuid();

                    return linkRequestEntity;
                })
                .onItem()
                .call(i -> i.persist());
    }
}
