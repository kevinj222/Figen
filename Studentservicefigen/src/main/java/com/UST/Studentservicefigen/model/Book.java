package com.UST.Studentservicefigen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book
{
    private Integer bookid;
    private String bookname;
    private Double bookcost;
}
