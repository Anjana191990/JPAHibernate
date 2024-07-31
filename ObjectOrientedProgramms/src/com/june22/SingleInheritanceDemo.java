package com.june22;
class Employee{
	String ename="Ajay";
	String designation="Jr.Java Developer";
	
}
class Company extends Employee {
	String compName="Capgemini";
	
	void disp() {
		System.out.println(ename+" "+designation+" "+compName);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Company c1=new Company();

		c1.disp();
	}

}
