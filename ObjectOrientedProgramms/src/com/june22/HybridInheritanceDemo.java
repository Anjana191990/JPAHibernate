package com.june22;

class GrandFather{
	void show() {
		System.out.println("This is grandfather class");
	}
}

class Father extends GrandFather{
	void disp() {
		System.out.println("This is father class");
	}
}
class Daughter extends Father{
	void d() {
		System.out.println("This is daughter class");
	}
}
class Son extends Father{
	void s() {
		System.out.println("This is son class");
	}
}
class s1 extends Son{
	void ss() {
		System.out.println("This is s1 class");
	}
}
class S2 extends s1{
	void ss1() {
		System.out.println("This is s2 class");
	}
}
public class HybridInheritanceDemo {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		
		d.d();
		d.show();
		d.disp();
		S2 s=new S2();
		s.s();
		s.ss1();
		s.ss();
		

	}

}
