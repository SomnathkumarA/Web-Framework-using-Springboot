package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Student;

@Repository
public interface Repos extends JpaRepository<Student,Integer>
{	
@Query("FROM Student where id=1")
List<Student> findAll();
}
