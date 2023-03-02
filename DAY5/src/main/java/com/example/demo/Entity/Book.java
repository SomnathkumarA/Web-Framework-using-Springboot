package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Book {
	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="BOOKID")
	private int bookid;
	
	@Column(name="BOOKNAME")
	private String bookname;
	
	@Column(name="GENRE")
	private String genre;
	
	@Column(name="AUTHOR")
	private String author;
	
	public Book() {}

	public Book(int bookid, String bookname,String genre,String author) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.genre = genre;
		this.author=author;
		
	}
	public int getbookid() {
		return bookid;
	}

	public void setbookid(int bookid) {
		this.bookid = bookid;
	}

	public String getbookname() {
		return bookname;
	}

	public void setbookame(String bookname) {
		this.bookname = bookname;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	    
	
}