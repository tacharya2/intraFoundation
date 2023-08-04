package com.intraFoundation.intranationalsupportfoundation.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

//@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "IntraFoundation Contact Form",
                description = "This API is used to post and retrieve correspondence via web",
                version = "v1",
                contact = @Contact(name = "Tek Acharya", email = "sarmakash430@gmail.com")
        )
)
public class SwaggerConfig {
}
