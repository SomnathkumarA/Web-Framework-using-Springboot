package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Child;

@Repository
public interface repository extends JpaRepository<Child,Integer> {
    
	
}