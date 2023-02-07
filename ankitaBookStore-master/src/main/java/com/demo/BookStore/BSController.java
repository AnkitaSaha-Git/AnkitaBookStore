package com.demo.BookStore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BSController {

    @Autowired
    BSService bsService;

    @PostMapping("add-book/")
    public ResponseEntity addBook(@RequestBody Book book){
        String res = bsService.addBook(book);

        if(res.equals("Book Added")){
            //ADDED
            return new ResponseEntity<>(res,HttpStatus.CREATED);
        }
        else{
            //NOT ADDED
            return new ResponseEntity<>(res,HttpStatus.FOUND);
        }
    }
    @GetMapping("bookWithMaxPages/")
    public ResponseEntity bookWithMaxPages(){
        return new ResponseEntity<>(bsService.bookWithMaxPages(),HttpStatus.FOUND);
    }

    @GetMapping("authorWithMaxPages/")
    public ResponseEntity authorWithMaxPages(){
        return new ResponseEntity<>(bsService.authorWithMaxPages(),HttpStatus.FOUND);
    }
}
