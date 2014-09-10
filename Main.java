package oo_demo_pkg;
import java.util.*;

/**
 * @author John Clem
 *
 */
public class Main{

	
	private static Scanner s = new Scanner(System.in);

	public Main(){
	}

	public static void main(String[] args){
		
		Man someguy = new Man("jack");

		Woman somegal = new Woman("jill");

		Boy somekid = new Boy("Billy");
		System.out.println("subtyping polymorphism");
		Human.getName(someguy);
		Human.getName(somekid);
		System.out.println("ad hoc polymorphism/overloading");
		someguy.think();
		someguy.think("DRAW!");
		System.out.println("generics or parametric polymorphism");
		Human.getNameGeneric(someguy);
		Human.getNameGeneric(somegal);
	}

}
