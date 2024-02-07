import java.util.Scanner;

class less18AgeNotAllowd extends RuntimeException {
	public less18AgeNotAllowd(String err_msg) {
		// super(err_msg);
		System.out.println(err_msg);
	} 
}


class greater28AgeNotAllowd extends RuntimeException {
	public greater28AgeNotAllowd(String err_msg) {
		// super(err_msg);
		System.out.println(err_msg);
	} 
}


class testException extends RuntimeException {
	public testException(String err_msg) {
		// super(err_msg);
		System.out.println(err_msg);
	} 
}

public class Except {



	// static int age = 7;

	// ----here--> 
	public static void main(String[] anything) {

	Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Age: ");

    int age = myObj.nextInt();



	if (age < 18) {
		throw new less18AgeNotAllowd("less than 18 age is Not Allowd");

	}
	else if (age > 28) {
		throw new greater28AgeNotAllowd("above 28 not allowd");
	}

	else {
		System.out.println("Allowd");
	}



	System.out.println("\nworking");

	throw new testException("Exception in main");

	}
}