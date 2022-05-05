package com.company;


public class Author {
    private String authorName;
    private String authorSurname;
    private String fullName;


    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.fullName = authorName + " " + authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String getFullName() {
        return this.authorName + this.authorSurname;
    }

}
