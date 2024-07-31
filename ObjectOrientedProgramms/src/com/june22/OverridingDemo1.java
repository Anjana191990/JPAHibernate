package com.june22;
/*Overriding-Runtime polymorphism/Dynamic
 * Method have same name with same parameter
 * */
class Developer{
	void disp(String name) {
		System.out.println("Developer Name:"+name);
	}
}
class Tester  extends Developer{
	void disp(String name) {
		super.disp("Sam");
		System.out.println("Tester Name:"+name);
	}
}

class Designer extends Tester {
	void disp(String name) {
		super.disp("Jhon");
		System.out.println("Ui Developer Name:"+name);
	}
}
public class OverridingDemo1 {

	public static void main(String[] args) {
		/*Developer d=new Developer();
			d.disp("Ajay");*/
			
		Designer d1=new Designer();
		d1.disp("Ankita");
		
	/*	Tester t1=new Tester();
		t1.disp("Ajay");*/
	}

}
