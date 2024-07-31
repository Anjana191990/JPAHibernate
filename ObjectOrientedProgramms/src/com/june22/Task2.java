package com.june22;
class Doctor{
	String name="Dr.Patil";
	String hName="Hinduja";
}
class Patient extends Doctor{
	String pname="Ajay";
	String dignosis="Cold";
	void show() {
		System.out.println("Doctor Name:"+name+" \nHospital Name:"+hName+" \nPatient Name:"+pname+"\nPatient history: "+dignosis);
	}
}
public class Task2 {

	public static void main(String[] args) {
		Patient p1=new Patient();
		
		p1.show();

	}

}
