package com.intraFoundation.intranationalsupportfoundation.controller;

import com.intraFoundation.intranationalsupportfoundation.repository.model.EmailDataEntity;
import com.intraFoundation.intranationalsupportfoundation.repository.EmailDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<EmailDataEntity> saveEmailData(@RequestBody EmailDataEntity emailData){
        System.out.println("Received data from frontend: " + emailData);
        return new ResponseEntity<>(emailDataRepository.save(emailData), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public Optional<EmailDataEntity> getEmailById(@PathVariable Long id){
      return emailDataRepository.findById(id);
    }
}