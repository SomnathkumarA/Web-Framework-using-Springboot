package com.example.demo.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {	
	
    @Autowired
    private StudentService stuservice;
    
    @GetMapping("/getStudent")
    public List<Student> getDetails()
    {
    	return stuservice.getAllDetails();
    }
    
    @PostMapping("/addStudent")
    public Student addDetails(@RequestBody Student s)
    {
    	return stuservice.savedetails(s);
    	
    }
    
    
    
}