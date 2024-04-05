package org.example;


import model.Contact;
import model.Email;
import model.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Create sample contacts
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Arun", "Mandal", "Cedargate", "Software Engineer",
                List.of(new PhoneNumber("641-133-0051", "Home"), new PhoneNumber("641-102-0783", "Mobile")),
                List.of(new Email("arun@gmail.com", "Home"), new Email("arun@cedargate.com", "Work"))));
        contacts.add(new Contact("Bret", "lee", "Hollywood", "Actor",
                Collections.emptyList(), Collections.emptyList()));
        contacts.add(new Contact("The", "Rock", "The Gym Club", "Trainer",
                Collections.singletonList(new PhoneNumber("431-145-7658", "Work")),
                Collections.singletonList(new Email("rock@gmail.com", "Work"))));


        Collections.sort(contacts, (c1, c2) -> c1.getLastName().compareTo(c2.getLastName()));

        // Convert contacts to JSON and print to console
        for (Contact contact : contacts) {
            System.out.println(contact.toJSON());
        }
    }
}