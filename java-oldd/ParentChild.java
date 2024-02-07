class Parent{
	String surname;

	Parent(){
	}

	Parent(String surname){
		this.surname = surname;
	}
}

class Child extends Parent{
	String name = "elliot ";

	Child(){
		super("alderson");
	}

}


public class ParentChild {
	public static void main(String[] args) {
		System.out.println("\n\n");	


		Child fam = new Child();
		String name = fam.name;
		String surname = fam.surname;
		System.out.println(name + surname);

		Parent papi = new Parent("nope");
		System.out.println(papi.surname);
		

		System.out.println("\n\nlol");
	}
}