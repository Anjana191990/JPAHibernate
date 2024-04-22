package com.eb.entity;

public class Student {

	private int studentId;
	
	private String name;
	
	private Course course;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void disp() {
		System.out.println("Student Id:"+studentId+
				"\nStudent Name:"+name);
		System.out.println(course);
		System.out.println(address);
	}
	
}
