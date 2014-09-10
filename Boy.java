package oo_demo_pkg;

public class Boy extends Human{

	public Boy(){}
	public Boy(String pname) {
		name = pname;
	}

	public void speak(){
		System.out.println("I am a boy, whose name is " + name);
	}
	public void move(){
		System.out.println(name + " quickly runs");
	}
	protected void think(){
		System.out.println(name + " thinks boyish thoughts");
	}
}
