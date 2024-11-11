package com.wiley.realworldjava.xml.jaxp;

import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ReadSax {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File file = Path.of("src/main/resources/book.xml").toFile();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        BookSaxHandler handler = new BookSaxHandler();

        parser.parse(file, handler);
    }
}

