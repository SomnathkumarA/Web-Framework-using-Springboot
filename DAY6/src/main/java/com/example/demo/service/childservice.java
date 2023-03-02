package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Child;
import com.example.demo.repo.repository;

@Service
public class childservice {
     @Autowired     
     private repository stu;
     
     public Child savedetails(Child s)
     {
    	 return stu.save(s);
     }
     
     public List<Child> getAllDetails()
     {

 		Pageable p = PageRequest.of(0, 3);
 		Page<Child> e =stu.findAll(p);
 		
 		return e.toList();
    	 }
     public List<Child> getBooks()
     {
  		List<Child> pass = stu.findAll(Sort.by(Sort.Direction.ASC,"address"));
        return pass;
     }
     public void deleteDepartmentById(int id)
     {
    	 stu.deleteById(id);
     }
    public Child update(int bookid,Child s){
    	return stu.saveAndFlush(s);
     }
    
    

}