abstract class Astarct1{
	String name = "test name";  
	
	void show(){
		System.out.println("method inside class astarct");
	}

	abstract Void absMethod();

	Astarct1(){
		System.out.println("abstract class constructor");
	}	

	{
		System.out.println("instance block");
	}
}


class Test extends Astarct1{
	void absMethod(){
		System.out.println("impplemented abstract method");
	}
}

public class AbstractStuff{
	public static void main(String[] args) {
		System.out.println("\n\n");

		Test obj1 = new Test();

		obj1.absMethod();



		System.out.println("\n\nend");
	}
}