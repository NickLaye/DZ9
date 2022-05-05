package com.company;

import java.lang.constant.Constable;

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

    public String toString() {
        return "Название книги: " + this.nameOfBook + " Автор книги: " + this.fullName + " Год публикации: " + this.yearOfPublication;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            Book book = (Book) o;
            return yearOfPublication == book.yearOfPublication;
        }
    }

    public int hashCode() {
        return Book.hashCode(nameOfBook, fullName, yearOfPublication);
    }

}
