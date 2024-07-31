package com.june22;

class BOI{
	void getRoi(double rate) {
		System.out.println("Rate of intrest Bank of india is "+(rate)+"%");
	}
}
class BOB extends BOI{
	void getRoi(double rate) {
		super.getRoi(5.7);
		System.out.println("Rate of intrest Bank of Badoda is "+(rate)+"%");
	}
}
class HDFC extends  BOB {
	void getRoi(double rate) {
		super.getRoi(10.11);
		System.out.println("Rate of intrest HDFC is"+(rate)+"%");
	}
}
public class Overriding2 {

	public static void main(String[] args) {
	
		HDFC h1=new HDFC();
		h1.getRoi(15.14);
	}

}
