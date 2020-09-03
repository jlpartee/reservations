package com.familyvideo.empcontacts.controller;

import com.familyvideo.empcontacts.model.Contact;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ContactResource.EMPLOYEE_V_1_CONTACT)
@CrossOrigin
public class ContactResource {

    public static final String EMPLOYEE_V_1_CONTACT = "/employee/v1/contact/";

    @GetMapping(path="{contactId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Mono<String> getContactById(@PathVariable String contactId) {

        // reservationService.getContact(contactId)

        return Mono.just("{}");
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Mono<String> createContact(@RequestBody Mono<Contact> contact) {
        return Mono.just("{}");
    }

    @DeleteMapping(path = "{contactId}")
    public Mono<Boolean> deleteContact(@PathVariable String contactId) {
        return Mono.just(true);
    }
}
