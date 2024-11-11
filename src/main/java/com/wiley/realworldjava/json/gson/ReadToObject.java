package com.wiley.realworldjava.json.gson;

import com.google.gson.Gson;
import com.wiley.realworldjava.json.jackson.Book;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class ReadToObject {

    public static void main(String[] args) throws IOException {
        File file = Path.of("src/main/resources/book.json").toFile();

        Gson gson = new Gson();
        Book book = gson.fromJson(new FileReader(file), Book.class);
        System.out.println(book.getTitle());
        System.out.println(book.getEdition());
        System.out.println(book.isPaperbackBook());
        System.out.println(book.getAuthors());

    }
}
