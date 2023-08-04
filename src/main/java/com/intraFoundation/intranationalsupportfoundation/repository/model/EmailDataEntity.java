package com.intraFoundation.intranationalsupportfoundation.repository.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="email_data")
public class EmailDataEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @NotNull
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String message;
}
