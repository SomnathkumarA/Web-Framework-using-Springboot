package com.example.demo.bookservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
//import com.example.demo.Entity.Student;
import com.example.demo.repo.repository;

@Service
public class service {
     @Autowired     
     private repository stu;
     
     public Book savedetails(Book s)
     {
    	 return stu.save(s);
     }
     

    	 public List<Book> getAllDetails()
         {
        	 List<Book> arr = new ArrayList<>();
        	 arr=stu.findAll();
        	 return arr;   
        	 }
         

     
     public void deleteDepartmentById(int id)
     {
    	 stu.deleteById(id);
     }
    public Book update(int bookid,Book s){
    	return stu.saveAndFlush(s);
     }
    
    

}