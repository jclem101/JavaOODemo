package oo_demo_pkg;


public abstract class Human<T> implements HumanInterface{
	
	public int height;
	protected int age;//accessible to subclass, not world.
	protected String name;//ditto
	
	
	public Human(){
		name = "human";
	}
	
	public void emote(){
		System.out.println( name + " expresses a range of human emotions");
	}
	public void speak(){
		System.out.println("I am a human, whose Name is " + name);
	}
	public void move(){
		System.out.println(name + " shuffles their feet");
	}
	protected void think(){
		System.out.println(name + " thinks human thoughts");
	}
	protected void feel(){
		System.out.println(name + " feels human emotions");
	}
	//subtype polymorphic methods
	public static void getName(Human obj){
		System.out.println(obj.name + "");
	}
	//generics
	public static <T> void getNameGeneric(Human<T> genobj){
		System.out.println(genobj.name);
	}
	
}
