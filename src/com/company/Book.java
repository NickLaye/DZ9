package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String nameOfBook;
    private int yearOfPublication;
    private Author fullName;

    public Book(String nameOfBook, int yearOfPublication, Author fullName) {
        this.nameOfBook = nameOfBook;
        this.yearOfPublication = yearOfPublication;
        this.fullName = fullName;
    }

    public Author getFullName() {
        return this.fullName;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название книги: " + this.nameOfBook + " Автор книги: " + this.fullName + " Год публикации: " + this.yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
         if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
           return false;
        }
        Book book = (Book) o;
        return book.nameOfBook.equals(this.nameOfBook) && book.yearOfPublication == yearOfPublication && book.fullName.equals(this.fullName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, fullName, yearOfPublication);
    }

}
