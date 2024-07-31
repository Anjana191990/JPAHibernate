package com.june27;
class Person{
	String pname;
	int age;
	Person(){
		System.out.println("This is default");
	}
	Person(String pname,int age){
		this.pname=pname;
		this.age=age;	
	}
	void show() {
		System.out.println(pname+" "+age);
	}
}
public class Test2 {

	public static void main(String[] args) {
	Person p=new Person("jhon",45);
	p.show();
	Person pp=new Person();
	}

}
