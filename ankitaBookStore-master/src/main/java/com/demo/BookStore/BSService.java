package com.demo.BookStore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BSService {

    @Autowired
    BSRepository bsRepository;
    public String addBook(Book book) {
       return bsRepository.addBook(book);
    }

    public String bookWithMaxPages() {
        return bsRepository.bookWithMaxPages();
    }

    public Object authorWithMaxPages() {
        return bsRepository.authorWithMaxPages();
    }
}
