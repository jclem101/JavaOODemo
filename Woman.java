package oo_demo_pkg;

public class Woman extends Girl{

	public Woman(String pname){
		super();
		name = pname;
	}

	public void speak(){
		System.out.println("I am a woman, whose name is " + name);
	}
	public void move(){
		System.out.println(name + " casually saunters");
	}
	protected void think(){
		System.out.println(name + " thinks feminine thoughts");
		
	}
	protected void think(String thoughts){
		System.out.println(name + " is thinking out loud. She says \"" + thoughts+"\"");
	}
	
	//polymorphic methods
	public static void getName(Woman obj){
		System.out.println(obj.name + "");
	}
}
