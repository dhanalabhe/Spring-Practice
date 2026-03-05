package com.maincrafts.contactform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ContactformApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactformApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("admin123"));
	}

}
