package com.june27;

class Student{
	int sid;
	String name;
	public Student(){
		System.out.println("This is default constructor");
	}
	public Student(int sid,String name) {
		System.out.println(sid+" "+name);
	}
}
public class Test1 {

	public static void main(String[] args) {
		Student s1=new Student();
Student s2=new Student(101,"jhon");
	}

}
