package com.june22;
/*overloading(compile time polymorphism/static)
 * method name same parameter different
 * 
 * 
 * */
public class OverloadingDemo1 {

	void add(int a, int b) {
		System.out.println("add:"+(a+b));
	}
	void add(int a, int b,int c) {
		System.out.println("add:"+(a+b+c));
	}
	void add(String a,String b) {
		System.out.println("string concat:"+(a+b));
	}
	public static void main(String[] args) {
		
		OverloadingDemo1 o=new OverloadingDemo1();
		o.add(10, 20);
		o.add(10, 20,30);
		o.add("Hello", "world");
	}

}
