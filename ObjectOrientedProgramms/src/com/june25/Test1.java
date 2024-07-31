package com.june25;

public class Test1 {

	public static void main(String[] args) {
		PrivateDemoImpl pp=new PrivateDemoImpl();
		
		//System.out.println(pp.id+" "+pp.name);
pp.setNo1(10);
pp.setNo2(20);
System.out.println(pp.getNo1()+" "+pp.getNo2());
	
	}

}
