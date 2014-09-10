package oo_demo_pkg;

public class Girl extends Human{

	public Girl() {
		// TODO Auto-generated constructor stub
	}
	public void speak(){
		System.out.println("I am a girl, whose name is " + name);
	}
	public void move(){
		System.out.println(name + " skips");
	}
	protected void think(){
		System.out.println(name + " thinks girlish thoughts");
	}
}
