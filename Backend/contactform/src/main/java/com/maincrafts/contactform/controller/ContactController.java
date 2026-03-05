package com.maincrafts.contactform.controller;

import com.maincrafts.contactform.model.Contact;
import com.maincrafts.contactform.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    // SAVE FORM DATA
    @PostMapping("/contact")
    public String saveContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message
    ) {
        Contact contact = new Contact();
        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        contactRepository.save(contact);

        return "Contact saved successfully!";
    }
    @GetMapping("/contacts")
    public java.util.List<Contact> getAllContacts() {
        return contactRepository.findAll();
}
}


