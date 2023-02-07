package com.demo.BookStore;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BSRepository {
    HashMap<String,Book> bookHashMap;
    HashMap<String,Author> authorHashMap;
    HashMap<String,Integer> authorPages;
    String bookMax;
    String authMax;

    BSRepository(){
        bookHashMap=new HashMap<>();
        authorHashMap=new HashMap<>();
        bookMax=null;
        authorPages=new HashMap<>();
        authMax=null;
    }
    public String addBook(Book book) {
        if (bookHashMap.containsKey(book.getName())) {
            return "Book already exists";
        }
            bookHashMap.put(book.getName(),book);
            if(bookMax == null || bookHashMap.get(bookMax).getPages()<book.getPages()){
                bookMax=book.getName();
                System.out.println("Max Updated");///
            }
            authorPages.put(book.getAuthor(),authorPages.getOrDefault(book.getAuthor(),0)+book.getPages());
            if(authMax==null || authorPages.get(book.getAuthor())>authorPages.get(authMax)){
                authMax=book.getAuthor();
            }

            return "Book Added";
    }
    public String bookWithMaxPages(){
        return this.bookMax;
    }
    public String authorWithMaxPages(){
        return authMax;
    }
}
