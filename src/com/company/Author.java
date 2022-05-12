package com.company;


import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;



    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;

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
        return "Имя автора: " + this.authorName + "Фамилия автора: " + this.authorSurname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Author author = null;
        if (o == null || getClass() != o.getClass()) {
            author = (Author) o;
        }
        return author.authorName.equals(this.authorName) && author.authorSurname.equals(this.authorSurname);
    }

}
