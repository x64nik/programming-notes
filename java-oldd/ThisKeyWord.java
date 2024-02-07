class School {
	String name;
	int fees;

	void show() {
		System.out.println("This is instance method");
	}

	void callEverything() {
		System.out.println(this.name);
		System.out.println(this.fees);
		this.show();
	}

	School(String name, int fees) {
		this.name = name;
		this.fees = fees;
	}
}

class Test {

	/*
	after creating object of class, 
	instance block will call before Constructor
	if their is no instance block, then Constructor 
	will get called.
	*/

	{
		System.out.println("Instance Block");
	}
	
	Test() {
		System.out.println("Default Constructor");	
	}
}



public class ThisKeyWord {
	public static void main(String[] args) {

		School student1 = new School("Dante", 5000);
		student1.callEverything();

		Test obj1 = new Test();


		System.out.println("\n\nend");
	}
}