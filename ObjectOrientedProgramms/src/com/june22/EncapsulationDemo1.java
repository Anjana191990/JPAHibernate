package com.june22;
/*variables and their methods wrap under single unit*/
class Menu{
	private String menuName;
	private int prise;
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	
}
public class EncapsulationDemo1 {

	
	public static void main(String[] args) {
		Menu m1=new Menu();
		m1.setMenuName("veg pulav");
		m1.setPrise(200);
		System.out.println(m1.getMenuName()+" "+m1.getPrise());
		
	}

}
