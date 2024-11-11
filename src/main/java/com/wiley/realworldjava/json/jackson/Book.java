package com.wiley.realworldjava.json.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Book {
    private String title;
    private int edition;

    @JsonProperty("paperback")
    private boolean paperbackBook;
    private List<String> authors;

    public boolean isPaperbackBook() {
        return paperbackBook;
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

    public void setPaperbackBook(boolean paperback) {
        this.paperbackBook = paperbackBook;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
