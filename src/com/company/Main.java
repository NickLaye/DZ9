package com.company;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Сергей", "Тармашев");
        Book book1 = new Book("Древний", 2016, author1);
        Author author2 = new Author("Сергей", "Тармашев");
        Book book2 = new Book("Древний. Противостояние", 2017, author2);

        System.out.println(book1.getFullName());

        book2.setYearOfPublication(2020);
        System.out.println(book2.getYearOfPublication());

    }
}
