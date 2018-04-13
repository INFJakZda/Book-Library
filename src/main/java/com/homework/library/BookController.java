package com.homework.library;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book/{isbn}")
public class BookController {

    @RequestMapping(method = RequestMethod.GET)
    Book book(@PathVariable String isbn) {

        return new Book(isbn);
    }

}
