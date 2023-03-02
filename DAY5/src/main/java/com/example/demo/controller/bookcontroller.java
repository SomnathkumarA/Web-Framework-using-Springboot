package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Book;
import com.example.demo.bookservice.service;

@RestController
public class bookcontroller {	
	
    @Autowired
    private service stuservice;
    
    @GetMapping("/getbook")
    public List<Book> getDetails()
    {
    	return stuservice.getAllDetails();
    }
   
    
    @PostMapping("/addbook")
    public Book addDetails(@RequestBody Book s)
    {
    	return stuservice.savedetails(s);
    	
    }
    @DeleteMapping("/del/{bookid}")
    public String delStudent(@PathVariable int bookid) {
    	stuservice.deleteDepartmentById(bookid);
    	return "Deleted Successfully!!!";
    }
    
    @PutMapping("/update/{bookid}")
    public Book update(@PathVariable int bookid,@RequestBody Book s) {
    	return stuservice.update(bookid, s);
    	
    }
   
    
    
}