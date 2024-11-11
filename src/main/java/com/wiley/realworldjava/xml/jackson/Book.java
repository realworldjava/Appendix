package com.wiley.realworldjava.xml.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "book")
public class Book {
    private String title;
    private int edition;
    private Object paperback;

    @JacksonXmlElementWrapper(localName = "authors")
    @JacksonXmlProperty(localName = "author")
    private List<String> authors;
    @JsonIgnore
    public boolean isPaperbackBook() {
        return paperback != null;
    }

    public Object getPaperback() {
        return paperback;
    }

    public String getTitle() {
        return title;
    }

    public int getEdition() {
        return edition;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setPaperback(Object paperback) {
        this.paperback = paperback;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
