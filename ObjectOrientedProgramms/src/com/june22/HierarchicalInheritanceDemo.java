package com.june22;

class Mother{
	String name="Nandini";
}
class Daughter1 extends Mother{
	String d1name="Archana";
	String d1education="MBA(HR)";
	
}
class Daughter2 extends Mother{
	String d2name="Anjana";
	String e2ducation="BE(IT)";
	
	
}
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		Daughter1 d=new Daughter1();
		Daughter2  d1=new Daughter2();
		
		System.out.println("Mother name:"+d.name+" \n"+d.d1name+" "+d.d1education);
		System.out.println(d1.d2name+" "+d1.e2ducation);
 	}

}
