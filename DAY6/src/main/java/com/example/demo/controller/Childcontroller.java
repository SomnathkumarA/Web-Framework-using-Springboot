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

import com.example.demo.Entity.Child;
import com.example.demo.service.childservice;

@RestController
public class Childcontroller {	
	
    @Autowired
    private childservice stuservice;
    
    @GetMapping("/getchild")
    public List<Child> getDetails()
    {
    	return stuservice.getAllDetails();
    }
    @GetMapping("/")
    public List<Child> getDetails1()
    {
    	return stuservice.getBooks();
    }
    
    
    @PostMapping("/addchild")
    public Child addDetails(@RequestBody Child s)
    {
    	return stuservice.savedetails(s);
    	
    }
    @DeleteMapping("/del/{babyid}")
    public String delChild(@PathVariable int babyid) {
    	stuservice.deleteDepartmentById(babyid);
    	return "Deleted Successfully!!!";
    }
    
    @PutMapping("/update/{babyid}")
    public Child update(@PathVariable int babyid,@RequestBody Child s) {
    	return stuservice.update(babyid, s);
    	
    }
   
    
    
}