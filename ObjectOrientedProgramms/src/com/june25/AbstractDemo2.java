package com.june25;
abstract class VehicleApp{
	
	String color="black";
	
	abstract void speed(int s);
    
	void warenty() {
		System.out.println("5 year warrenty");
}
}
	class CarApp extends VehicleApp{

	@Override
	void speed(int s) 
		 {
			System.out.println("Speed is:"+s);
		}
		
	}
	

public class AbstractDemo2 {

	public static void main(String[] args) {
		CarApp c=new CarApp();
		System.out.println("Vehicle color:"+c.color);
		
		c.speed(80);
		c.warenty();
	}

}
