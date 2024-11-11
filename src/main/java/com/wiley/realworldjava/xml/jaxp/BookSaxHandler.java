package com.wiley.realworldjava.xml.jaxp;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class BookSaxHandler extends DefaultHandler {

    private boolean inTagWithText = false;
    private boolean paperback;

    @Override
    public void startElement(String uri, String localName,
                             String qualifiedName, Attributes attributes) {

        switch (qualifiedName) {
            case "edition", "author" -> inTagWithText = true;
            case "paperback" -> paperback = true;
            case "authors" -> System.out.println("Paperback? " + paperback);
            case "book" -> System.out.println(attributes.getValue("title"));
        }
    }


    @Override
    public void endElement(String uri, String localName, String qualifiedName) {
        inTagWithText = false;
    }

    @Override
    public void characters(char[] chars, int start, int length) {
        if (inTagWithText) {
            String text = new String(chars, start, length);
            System.out.println(text);
        }
    }
}