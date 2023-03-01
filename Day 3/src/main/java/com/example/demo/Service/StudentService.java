package com.example.demo.Service;


import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.Repos;

@Service
public class StudentService
{
	
	@Autowired
	private Repos repo;
	
	public Student addStudent(Student o)
	{
		return repo.save(o);
		repo.
	}
	
	public List<Student> getStudent()
	{
		Pageable sortPD = PageRequest.of(0, 3, Sort.by("price").descending()); 

	Pageable p=PageRequest.of(0, 2);
	Page<Student> c=repo.findAll(p);
	return c.toList();
	}
	
	public Student updateCollege(int id, Student b) {
		Student up=repo.findById(id).get();
		
		if(Objects.nonNull(up) && (!(Objects.isNull(b.getName()))))
		{
			up.setName(b.getName());
		}
		
		if(Objects.nonNull(up) && (!(Objects.isNull(b.getId()))))
		{
			up.setId(b.getId());
		}
		
		if(Objects.nonNull(up) && (!(Objects.isNull(b.getAge()))))
		{
			up.setAge(b.getAge());
		}
		
		
		
		
		return repo.save(up);
		
	}
	
}
