package com.bootlabs.springbootdocker.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final Logger log = LoggerFactory.getLogger(BookController.class);
	



    @GetMapping(value = "/{id}")
    public String getOneBook(@PathVariable String id) {
        log.debug("REST request to get Book : {}", id);
        return "WOWOW=" + id;
    }



}
