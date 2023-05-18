package com.UST.Bookservice.Controller;

import com.UST.Bookservice.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController
{
    @Autowired
    Environment environment;
    @GetMapping("/data")
    public String getBookData()
    {
        return "data of BOOK-SERVICE ,running on port: "+environment.getProperty("local.server.port");
    }
    @GetMapping("/{id}")
    public List<Book>getall()
    {
        return List.of(new Book(501,"head java first",439.75),
                new Book(502,"Bring in Action",340.75),
                new Book(503,"Hibernate in Action",355.75));
    }
    @GetMapping("/entity")
    public ResponseEntity<String>getEntityData()
    {
        return new ResponseEntity<String>("Hello from BookRestController",HttpStatus.OK);
    }
}
