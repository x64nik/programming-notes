// -->

// this is a class
// default
class C1 {

	static String name = "Elliot";
	static int speed;

	// method inside class :)
	// datatype = String 
	static String car() {
		return "incomming car.....";
	}



	// datatype = int
	static int speed() {
		return speed;	
	}
}


class Test {
	static String color = "Red";
	static int code = 7777;

	private static String cat = "combined :) --> " + color + code;

	String getCat() {
		return cat;
	}
}



public class Basic {


	// void gives no return ;)
	// method without params (void)
	static void m1() {
		System.out.println("here in m1 ");
	}

	// method with params (void)
	static void m2(int num1, String name){
		System.out.println("this is a number " + num1);
		System.out.println("this is a string " + name  + "\n");
	}

	// int gives return ;)
	// method without params (int)
	static int m3() {
		int num0 = 123456789;

		return num0;
	}

	// metho with params (int)
	static int m4(int num1, int num2) {
		int sum0 = num1 + num2;

		return sum0;
	}

	int yolo = 1980;

	// ----here--> 
	public static void main(String[] anything) {
		System.out.println("here ");
		m1();
		m2(100, "yolo");

		System.out.println("we are in m3 ;) , " + m3());
		System.out.println("we are in m4 ;) , " + m4(20,20) + "\n");

		Basic obj1 = new Basic();

		System.out.println(obj1.yolo);

		C1 obj2 = new C1();
		
		String come_here = C1.name;
		System.out.println("My name is " + come_here + " :) ");

		System.out.println("RUN there is a " + C1.car() + " :(");


		C1.speed = 56789;
		System.out.println("Car speed: " + C1.speed());




		Test obj3 = new Test();

		System.out.println(obj3.cat);

		System.out.println("\ndone! :)");

	}
}