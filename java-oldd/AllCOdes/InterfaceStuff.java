interface Parent{
	String name = "Alderson";
	public static final int age = 25;

	void show();

	default void display(){
		System.out.println("Default Method");
	}
}

class Child implements Parent{
	public void show(){
		// System.out.println(age);	
		System.out.println("Method Implemented from Parent");
	}
}

public class InterfaceStuff{
	public static void main(String[] args){

		Child kid = new Child();
		kid.display();
		kid.show();

		System.out.println(kid.name);
		System.out.println(kid.age);



		System.out.println("\n\nend...");
	}
}