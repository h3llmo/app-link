package com.damosoft.app.link.resources;

import com.damosoft.app.link.commands.createtalentlinkrequest.CreateTalentLinkRequestCommand;
import com.damosoft.app.link.commands.createtalentlinkrequest.CreateTalentLinkRequestHandler;
import io.smallrye.mutiny.Uni;
import lombok.AllArgsConstructor;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("link-requests")
@AllArgsConstructor
public class LinkRequestEntityResource {
    private final CreateTalentLinkRequestHandler createTalentLinkRequestHandler;
    @POST
    public Uni<Response> create(CreateTalentLinkRequestCommand body) {
        return createTalentLinkRequestHandler
                .create(body)
                .onItem()
                .transform(Response::ok)
                .onItem()
                .transform(Response.ResponseBuilder::build);
    }
}
