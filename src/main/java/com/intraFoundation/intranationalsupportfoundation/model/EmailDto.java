package com.intraFoundation.intranationalsupportfoundation.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

//This class is nt being used anywhere
@Data
@Component
public class EmailDto {

    @Schema(description = "Name of the user", example = "John Doy", required = true)
    private String name;

    @Schema(description = "Email-id of the user", example = "john_doe@gmail.com", required = true)
    private String email;

    @Schema(description = "Phone number of the user", example = "111-222-3333", required = true)
    private String phone;

    @Schema(description = "Message of the user", example = "Please contact me by today", required = true)
    private String message;
}
