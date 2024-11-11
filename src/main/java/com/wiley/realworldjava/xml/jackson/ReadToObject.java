package com.wiley.realworldjava.xml.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ReadToObject {

    public static void main(String[] args) throws IOException {
        File file = Path.of("src/main/resources/book.xml").toFile();
        ObjectMapper mapper = new XmlMapper();
        Book book = mapper.readValue(file, Book.class);
        System.out.println(book.getTitle());
        System.out.println(book.getEdition());
        System.out.println(book.isPaperbackBook());
        System.out.println(book.getAuthors());

    }
}
