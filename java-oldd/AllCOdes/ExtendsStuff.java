
class Parent {
	void display() {
		System.out.println("1st parent propertie");
	}

	void display2(){
		System.out.println("2nd parent propertie");	
	}
}


class Child extends Parent {
	String name = "elliot";	
}


public class ExtendsStuff {
	public static void main(String[] args) {


		Child ch = new Child();

		ch.display();
		ch.display2();


		System.out.println("\n\n\nyolo");
	}
}