package com.UST.Studentservicefigen.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Studentrestcontoller
{
    @Autowired
    private BookrestConsumer comsumer;
    @GetMapping("/data")
    public String getStudentInfo()
    {
        System.out.println(comsumer.getClass().getName());
        return "Accesing from STUDENT-SERVICE==>" +comsumer.getBookData();
    }
    @GetMapping("/allBooks")
    public String getBooksInfo()
    {
        return "Accesing from STUDENT-SERVICE==>" +comsumer.getallbooks();
    }
    @GetMapping("/getonebook/{id}")
    public String getBooksInfo(@PathVariable Integer id)
    {
        return "Accesing from STUDENT-SERVICE==>" +comsumer.getbookId(id);
    }
    @GetMapping("/entitydata")
    public String printEntitydata()
    {
        ResponseEntity<String>resp=comsumer.getEnitityData();
        return "Accesing from STUDENT-SERVICE==>" +resp.getBody() +" ,Status is:" +resp.getStatusCode();
    }

}
