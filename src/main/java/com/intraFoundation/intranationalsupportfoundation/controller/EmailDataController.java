package com.intraFoundation.intranationalsupportfoundation.controller;

import com.intraFoundation.intranationalsupportfoundation.repository.model.EmailDataEntity;
import com.intraFoundation.intranationalsupportfoundation.repository.EmailDataRepository;
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
    public EmailDataEntity saveEmailData(@RequestBody EmailDataEntity emailData){
        return emailDataRepository.save(emailData);
    }
    @GetMapping("/{id}")
    public Optional<EmailDataEntity> getEmailById(@PathVariable Long id){
      return emailDataRepository.findById(id);
    }
}
