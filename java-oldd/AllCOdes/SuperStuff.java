class Parent {
	String surname;
	
	// Parent(){
	// 	System.out.println("called by super()");
	// }	

	Parent(String surname){
		this.surname = surname;
	}
}

class Child extends Parent{
	String name = "Elliot";

	Child(){
		super("Alderson");
	}

}


public class SuperStuff{
	public static void main(String[] args){

		Child kid = new Child();
		System.out.println(kid.name);
		System.out.println(kid.surname);

		System.out.println("\n\nend");
	}
}