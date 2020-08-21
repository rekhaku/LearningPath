package com.tech.pandemic.model;


import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PERSON")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	
	@NotBlank(message = "{person.gender.notBlank}")
	String gender;
	
	@Digits(integer = 2,fraction = 0)
	int age;	
	String comments;
	String docId;
	
	@NotNull
	@NotBlank(message = "{person.firstName.notBlank}")
	String firstName;
	
	@NotNull
	@NotBlank(message = "{person.lastName.notBlank}")
	String lastName;
	
	@ManyToOne(optional = false,cascade= CascadeType.ALL)
    @JoinColumn(name="houseNo")
	Address address;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person() {
		super();
	}
	public Person(String email) {
		super();
		this.email = email;
	}
	
	
	

}
