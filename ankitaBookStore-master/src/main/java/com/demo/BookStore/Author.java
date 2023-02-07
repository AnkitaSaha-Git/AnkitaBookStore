package com.demo.BookStore;

public class Author {

    private String name;
    private String address;
    private int books;


    public Author() {
    }

    public Author(String name, String address, int books) {

        this.name = name;
        this.address = address;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }
}
