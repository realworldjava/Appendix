package com.wiley.realworldjava.xml.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.List;

public class WriteFromObject {

    public static void main(String[] args) throws IOException {

        Book book = new Book();
        book.setAuthors(List.of("Victor & Jeanne"));

        ObjectMapper mapper = new XmlMapper();

        String xml = mapper
                .writer()
                .withDefaultPrettyPrinter()
                .writeValueAsString(book);
        System.out.println(xml);


    }
}
