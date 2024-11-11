package com.wiley.realworldjava.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wiley.realworldjava.xml.jackson.Book;

import java.io.IOException;
import java.util.List;

public class WriteFromObject {

    public static void main(String[] args) throws IOException {

        Book book = new Book();
        book.setAuthors(List.of("Victor & Jeanne"));

        Gson gson = new Gson();
        //Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        System.out.println(gson.toJson(book));
    }
}
