abstract class Abs{
	String className = "Abstract Class";
	int fees;

	{
		System.out.println("Fees = " + fees);
	}

	void show(){
		System.out.println("Defined Method...");
	}

	abstract void absMethod();
	abstract void absMethod2(int num1, int num2, int num3);

	Abs(int fees){
		this.fees = fees;
		System.out.println("Abstract class Constructor");	
	}

	{
		System.out.println("Abstract class Instance Block");
	}

}


class Calling extends Abs{
	Calling(){
		super(5000);
	}

	void absMethod(){
		System.out.println("Using absMethod of abstract class Abs");		
	}

	void absMethod2(int num1, int num2, int num3){
		System.out.println(num1 + num2 + num3);	
	}
}


public class AbstractStuff{
	public static void main(String[] args){

		Calling obj1 = new Calling();
		obj1.show();
		obj1.absMethod();
		obj1.absMethod2(10, 10, 10);



		System.out.println("\n\nend");
	}
}