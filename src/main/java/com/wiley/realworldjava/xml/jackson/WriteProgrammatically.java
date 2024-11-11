package com.wiley.realworldjava.xml.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class WriteProgrammatically {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new XmlMapper();

        ObjectNode root = mapper.createObjectNode();
        root.put("edition", "1");

        String xml = mapper
                .writer()
                .writeValueAsString(root);
        System.out.println(xml);


    }
}
