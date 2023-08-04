package com.intraFoundation.intranationalsupportfoundation.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class EmailDto {

    @Schema(description = "Name of the user", example = "Jake Dray", required = true)
    private String name;

    @Schema(description = "Email-id of the user", example = "jack_dray@gmail.com", required = true)
    private String email;

    @Schema(description = "Phone number of the user", example = "111-222-3333", required = true)
    private String phone;

    @Schema(description = "Message of the user", example = "I need you contact me", required = true)
    private String message;
}
