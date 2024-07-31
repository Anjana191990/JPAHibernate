package com.june22;
class Animal{
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking...");
	}
}
class Cat extends Dog{
	void meow() {
		System.out.println("meow meow...");
	}
}
class BabyCat extends Cat{
	void weep() {
		System.out.println("weeping..");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		BabyCat b1=new BabyCat();
		
		b1.eat();
		b1.weep();
		b1.meow();
		b1.bark();
		
	}

}
