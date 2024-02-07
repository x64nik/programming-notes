class Workers {
	String name;
	int age;

	public Workers(String name, int age) {
		this.name = name;
		this.age = age;		
	}

	void disp() {
		System.out.println(this.name + " " + this.age);
	}
}


public class Except {



	// ----here--> 
	public static void main(String[] anything) {


		// Workers[] obj1 = new Workers[2];

		// obj1[0]  =  new Workers("a", 1);
		// obj1[1]  =  new Workers("b", 2);
		// // obj1[2]  =  new Workers("c");

		// for (int i=0; i<2; i++) {
		// 	obj1[i].disp();
		// }

		int arr1[] = {1,1,1,1,};

		try {
			System.out.println("try here ");
			System.out.println(arr1[10]);

		}
		catch(Exception err) {
			System.out.println(err);
			// err.printStacktrace();
			System.out.println("excption here");
		}
		finally {
			System.out.println("excption here");	
		}
























		System.out.println("done! :)");


		// try {
		// 	int x[] = {1,2};
		// 	System.out.println(x[1]/0);
		// }
		// catch(IndexOutOfBoundsException zxzx) {
		// 	System.out.println(":)");
		// }
		// catch(Exception errrr) {
		// 	System.out.println(":)mmm");
		// }
		// System.out.println("done! :)");
		// System.out.println("done! :)");
		// System.out.println("done! :)");

	}
}