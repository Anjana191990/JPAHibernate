package com.june25;

abstract class Shapes{
	
	abstract void show();
}

abstract class Triangle {
	abstract void show();
}
class Square extends Shapes{

	@Override
	void show() {
	System.out.println("This is show method for square shape");
	}
	
}
class Rectangle extends Triangle{

	@Override
	void show() {
		System.out.println("This is show method for triangle shape");
		
	}
	
}
public class AbstractDemo3 {

	public static void main(String[] args) {
		Square s1=new Square();
		Rectangle r1=new Rectangle();
		s1.show();
		r1.show();
	}

}
