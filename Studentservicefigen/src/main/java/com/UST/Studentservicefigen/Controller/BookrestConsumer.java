package com.UST.Studentservicefigen.Controller;

import com.UST.Studentservicefigen.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "BOOK-SERVICE")
public interface BookrestConsumer
{
   @GetMapping("/book/data")
   public String getBookData();
   @GetMapping("/book/{id}")
    public Book getbookId(@PathVariable Integer id);
   @GetMapping("/book/all")
    public List<Book> getallbooks();
   @GetMapping("/book/entity")
    public ResponseEntity<String> getEnitityData();
}
