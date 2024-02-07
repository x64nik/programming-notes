class Parent {
	String surname = "Alderson";

	void show(){
		System.out.println("Parent");
	}
}


class Child extends Parent{
	String surname = "Alderson";
	void show(){
		System.out.println("Parent");
	}
}

public class Basic {
	public static void main(String[] args) {

		Child kid = new Child();
		kid.show();

		System.out.println(kid.surname);

		System.out.println("\n\nend...");
	}
}