package com.company;


public class Author {
    private String authorName;
    private String authorSurname;

    public <authorName, authorSurname> Author (authorName, authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorSurname() {
        return this.authorSurname;
    }
}
