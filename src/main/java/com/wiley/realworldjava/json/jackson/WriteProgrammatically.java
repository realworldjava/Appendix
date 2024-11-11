package com.wiley.realworldjava.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class WriteProgrammatically {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new JsonMapper();

        ObjectNode root = mapper.createObjectNode();
        root.put("edition", "1");

        String json = mapper
                .writer()
                .withRootName("book")
                .writeValueAsString(root);
        System.out.println(json);


    }
}
