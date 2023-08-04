package com.intraFoundation.intranationalsupportfoundation.model.repository.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class EmailData {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @NotNull
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String message;
}
