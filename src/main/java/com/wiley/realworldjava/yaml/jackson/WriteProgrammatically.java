package com.wiley.realworldjava.yaml.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.IOException;

public class WriteProgrammatically {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new YAMLMapper();

        ObjectNode root = mapper.createObjectNode();
        root.put("edition", 1);

        String yaml = mapper
                .writer()
                .writeValueAsString(root);
        System.out.println(yaml);


    }
}
