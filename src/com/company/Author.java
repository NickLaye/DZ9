package com.company;


import java.util.Objects;

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

    @Override
    public String toString() {
        return "ФИ автора: " + this.fullName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Author author = null;
        if (o == null || getClass() != o.getClass()) {
            author = (Author) o;
        }
        return authorName == author.authorName && authorSurname == author.authorSurname;
    }

}
