package com.june25;
/*Hiding internal details to showing unnecesary information
 * showing only essential information
 * */


abstract class Capgemini{
	String address="Airoli";
	void disp() {
		System.out.println("This is disp method");
	}
	
	abstract void show() ;
}
class Cg extends Capgemini{

	@Override
	void show() {
		System.out.println("show method");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
	
		Cg c1=new Cg();
		System.out.println(c1.address);
	  c1.disp();
	  c1.show();
	}

}
