package com.june22;
/*write a java program take class student 

to display 2 objects with sname,sroll.*/

class StudentApp{
	String sname;
	int sroll;
	void disp(String n,int r) {
		sname=n;
		sroll=r;
		System.out.println(sname+" "+sroll);
	}
}
public class Task1 {

	public static void main(String[] args) {
		StudentApp ss=new StudentApp();
		ss.disp("Monu", 20);
		StudentApp ss1=new StudentApp();
		ss1.disp("Goldi", 22);

	}

}
