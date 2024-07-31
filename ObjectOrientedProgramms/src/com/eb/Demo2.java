package com.eb;

import com.june25.ProtectedDemoImpl;

public class Demo2  extends ProtectedDemoImpl{

	public static void main(String[] args) {
		
		Demo2 d=new Demo2();
		System.out.println(d.msg);
		d.add(10, 20);
	}

}
