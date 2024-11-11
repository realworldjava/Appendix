package com.wiley.realworldjava.xml.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ReadWithJsonNode {

    public static void main(String[] args) throws IOException {
        File file = Path.of("src/main/resources/book.xml").toFile();
        ObjectMapper mapper = new XmlMapper();
        JsonNode root = mapper.readTree(file);

        System.out.println("Title: " + root.get("title").asText());
        System.out.println("Edition: " + root.get("edition").asInt());
        System.out.println("Paperback? " + (root.get("paperback") != null));

        JsonNode authors = root.findValue("author");
        for (JsonNode chars : authors) {
            System.out.println(chars.asText());
        }

    }
}
