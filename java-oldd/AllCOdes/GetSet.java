class Class1 {
	private int num1;
	private String name;

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

	String getName(){
		return name;
	}

	String setName(String new_name){
		this.name = new_name;
		return name;
	}
}


public class GetSet {
	public static void main(String[] args) {
		
		Class1 obj1 = new Class1();

		obj1.setNum1(100);
		System.out.println(obj1.getNum1());
		
		obj1.setName("dante");
		System.out.println(obj1.getName());

		System.out.println("\n\nend");
	}
}