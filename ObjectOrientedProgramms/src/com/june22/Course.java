package com.june22;

public class Course {

	public static void main(String[] args) {
		EncapsulationDemo2 d=new EncapsulationDemo2();
		
		d.setId(101);
		d.setName("Java Full Stack");
		
		System.out.println("Course Id:"+d.getId()+"\nCourse Name:"+d.getName());

	}

}
