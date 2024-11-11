package com.wiley.realworldjava.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.util.List;

public class WriteFromObject {

    public static void main(String[] args) throws IOException {

        Book book = new Book();
        book.setAuthors(List.of("Victor & Jeanne"));

        ObjectMapper mapper = new JsonMapper();

        String json = mapper
                .writer()
                .withDefaultPrettyPrinter()
                .writeValueAsString(book);
        System.out.println(json);


    }
}
