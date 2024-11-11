package com.wiley.realworldjava.xml.jaxp;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ReadDom {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = Path.of("src/main/resources/book.xml").toFile();

        // To start parsing, DOM requires a DocumentBuilder. Steps to get that:
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);

        Node root = doc.getElementsByTagName("book").item(0);

        System.out.println(root.getAttributes().getNamedItem("title").getNodeValue());
        System.out.println(doc.getElementsByTagName("edition").item(0).getTextContent());

        System.out.println("Paperback? " + (doc.getElementsByTagName("paperback").getLength() != 0));

        NodeList authors = doc.getElementsByTagName("author");

        for (int i = 0; i < authors.getLength(); i++) {
            System.out.println(authors.item(i).getTextContent());
        }


    }
}
