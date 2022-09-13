package com.example.StudentSystem.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String courses;
    private int age;
    private String email;
    private String pass;
    public Student() {

	}
	public Student(Long id, String name, String courses, int age, String email, String pass) {
	
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.age = age;
		this.email = email;
		this.pass = pass;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void name(String name) {
		this.name = name;
	}
	public String getCourse() {
		return courses;
	}
	public void setCourse(String courses) {
		this.courses = courses;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	
	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getpass() {
		return pass;
	}
	public void setpass(String pass) {
		this.pass = pass;
	}


}




