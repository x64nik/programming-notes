final class Parent{
	final void bike(){
		System.out.println("Bike is RED");
	}
}

public class Child extends Parent{
	void bike(){
		System.out.println("Bike is BLUE");	
	}
}



public class FinalStuff{
	public static void main(String[] args){

		Child kid = new Child();
		kid.bike();


		System.out.println("\n\nend");
	}
}