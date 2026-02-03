package com.maincrafts.contactform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maincrafts.contactform.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
