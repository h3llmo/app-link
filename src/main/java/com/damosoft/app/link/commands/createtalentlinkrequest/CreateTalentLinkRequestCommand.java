package com.damosoft.app.link.commands.createtalentlinkrequest;

import lombok.Data;

import javax.json.bind.annotation.JsonbDateFormat;
import java.time.LocalDateTime;

@Data
public class CreateTalentLinkRequestCommand {
    @JsonbDateFormat("dd-MM-yyyy'T'HH:mm:ss")
    private LocalDateTime proposedTime;
    private String talentUuid;
    private String requesterIdentityUuid;
}
