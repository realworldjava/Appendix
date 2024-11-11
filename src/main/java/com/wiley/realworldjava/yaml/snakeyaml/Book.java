package com.wiley.realworldjava.yaml.snakeyaml;

import java.util.List;

public class Book {
    private String title;
    private int edition;

    private boolean paperback;
    private List<String> authors;

    public boolean isPaperback() {
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

    public void setPaperback(boolean paperback) {
        this.paperback = paperback;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
