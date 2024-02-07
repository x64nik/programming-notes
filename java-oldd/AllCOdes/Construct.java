class Computer {
	int price;

	// creating constructor
	// when we create object of class constructor will get called by default 

	Computer() {
		System.out.print(price);
	}

}


class Bank {
	int amount;

	// constructor with param
	Bank(int money) {
		amount = money;
	}
}


public class Construct {


	public static void main(String[] args) {
		

		// by default will get called price = 0;
		Computer comp1 = new Computer();
		comp1.price = 50;
		System.out.println(comp1.price + "\n");

		// calling with param
		Bank bank1 = new Bank(25000);
		System.out.println(bank1.amount);




		System.out.println("\n\nend");
	}
}