package com.intraFoundation.intranationalsupportfoundation.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/*****************************************************************
Lesson Learned:
 1. Swagger won't work if you use jakarta.persistence.* using parent <version>2.5.4</version> and javax persistence works.
 2. We can Make dto and entity class the same. In this project, the Swagger wasn't detecting schema from dto, so I moved it to entity and it showed up in Swagger

 ******************************************************************/
@Data
@Entity
@Table(name="email_data")
public class EmailDataEntity {
    @NotNull
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

//    @JsonIgnore // or @ApiModelProperty(hidden = true) to exclude from being seen in the swagger payload. Doing this conflicted to the front-end for retrieval of GET
    private Long id;

    @Schema(description = "Name of the user", example = "John Doe", required = true)
    private String name;

    @Schema(description = "Email-id of the user", example = "john_doe@gmail.com", required = true)
    private String email;

    @Schema(description = "Phone number of the user", example = "111-222-3333", required = true)
    private String phone;

    @Schema(description = "Message of the user", example = "Please contact me by today", required = true)
    private String message;
}
