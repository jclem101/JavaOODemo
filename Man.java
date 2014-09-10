package oo_demo_pkg;

public class Man extends Boy{

	public Man(String pname){
		super();
		name = pname;
	}
	
	public void speak(){
		System.out.println("I am a man, whose name is " + name);
	}
	public void move(){
		System.out.println(name + " makes confident strides");
	}
	protected void think(){
		System.out.println(name + " thinks manly thoughts");
	}
	protected void think(String thoughts){
		System.out.println(name + " is thinking out loud. He says \"" + thoughts+"\"");
	}
	
	//polymorphic methods
	public static void getName(Man obj){
		System.out.println(obj.name + "");
	}

}
