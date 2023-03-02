package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Child {
	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="BABYID")
	private int babyid;
	
	@Column(name="BABYFIRRSTNAME")
	private String babyfirstname;
	
	@Column(name="BABYLASTNAME")
	private String babylastname;
	
	@Column(name="FATHERNAME")
	private String fathername;
	
	@Column(name="MOTHERNAME")
	private String mothername;
	
	@Column(name="ADDRESS")
	private String address;
	
	public Child() {}

	public Child(int babyid, String babyfirstname,String babylastname,String fathername,String mothername,String address  ) {
		
		super();
		this.babyid = babyid;
		this.babyfirstname = babyfirstname;
		this.babylastname = babylastname;
		this.fathername=fathername;
		this.mothername=mothername;
		this.address=address;
		
	}
	public int getbabyid() {
		return babyid;
	}

	public void setbabyid(int babyid) {
		this.babyid = babyid;
	}

	public String getbabyfirstname() {
		return babyfirstname;
	}

	public void setbabyfirstname(String babyfirstname) {
		this.babyfirstname = babyfirstname;
	}

	public String getbabylastname() {
		return babylastname;
	}

	public void setbabylastname(String babylastname) {
		this.babylastname = babylastname;
	}
	public String getfathername() {
		return fathername;
	}

	public void setfathername(String fathername) {
		this.fathername = fathername;
	}
	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}
	


	    
	
}