package com.eb;
interface Student{
	void doSomething();
	
}
class S1 implements Student{

	@Override
	public void doSomething() {
		System.out.println("This is dosomething method");
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		
		/*S1 s=new S1();
		s.doSomething();*/
		Student s=new S1();
		s.doSomething();

	}

}
