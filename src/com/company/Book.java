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
    public Author getFullName() {return this.fullName;}
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public String  getNameOfBook() { return this.nameOfBook; }
    public void setYearOfPublication (int yearOfPublication) {this.yearOfPublication = yearOfPublication;}


}
