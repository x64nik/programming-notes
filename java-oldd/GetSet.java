class Class1 {
	private int num1;

	// getter (get) method
	// to read privet stuff
	int getNum1() {
		return num1;
	}

	// int setNum1
	int setNum1(int new_val) {
		this.num1 = new_val;
		return num1;
	}
}


class Class2 {

	private int num1;

	int getNum1(){
		return num1;
	}

	int setNum1(int new_val){
		if (new_val == 900){
			this.num1 = new_val;
		}
		return 0;
	}

	Class2() {
		System.out.println("yoloooo --> "+ num1);
	}
}


public class GetSet {
	public static void main(String[] args) {
		System.out.println();
		
		Class1 obj1 = new Class1();
		Class2 obj2 = new Class2();

		obj1.setNum1(100);
		System.out.println(obj1.getNum1());
		System.out.println();

		obj2.setNum1(500);	
		System.out.println(obj2	.getNum1());
		System.out.println();



		System.out.println("\n\nend");
	}
}