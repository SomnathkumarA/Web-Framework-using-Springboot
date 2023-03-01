package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class Controller {
	
	@Autowired
	public StudentService tserv;
	
	@PostMapping("/add")
	public Student getstud(@RequestBody Student s)
	{
		return tserv.addStudent(s);
	}
	
	@GetMapping("/show")
	public List<Student> showstud()
	{
		List<Student> arr = new ArrayList<>();
		return arr=tserv.getStudent();
	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable("id") int id,@RequestBody Student s)
	{
		return tserv.updateCollege(id,s);
	}
}
