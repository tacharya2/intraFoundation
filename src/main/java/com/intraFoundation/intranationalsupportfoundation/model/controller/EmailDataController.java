package com.intraFoundation.intranationalsupportfoundation.model.controller;

import com.intraFoundation.intranationalsupportfoundation.model.repository.model.EmailData;
import com.intraFoundation.intranationalsupportfoundation.model.repository.EmailDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/intraNationalApi/email")
public class EmailDataController {
    private final EmailDataRepository emailDataRepository;

    @Autowired
    public EmailDataController(EmailDataRepository emailDataRepository) {
        this.emailDataRepository = emailDataRepository;
    }
    @PostMapping
    public EmailData saveEmailData(@RequestBody EmailData emailData){
        return emailDataRepository.save(emailData);
    }
    @GetMapping("/{id}")
    public Optional<EmailData> getEmailById(@PathVariable Long id){
      return emailDataRepository.findById(id);
    }
}
