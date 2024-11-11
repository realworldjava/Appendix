package com.wiley.realworldjava.yaml.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ReadWithJsonNode {

    public static void main(String[] args) throws IOException {
        File file = Path.of("src/main/resources/book.yaml").toFile();
        ObjectMapper mapper = new YAMLMapper();
        JsonNode root = mapper.readTree(file);

        System.out.println(root.get("title").asText());
        System.out.println(root.get("edition").asInt());
        System.out.println("Paperback? " + root.get("paperback"));

        JsonNode authors = root.findValue("authors");
        for (JsonNode chars : authors) {
            System.out.println(chars.asText());
        }

    }
}
