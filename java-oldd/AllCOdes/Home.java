class Home2 {

	// default instance method (without params)
	void PoorMoney() {
		System.out.println("no money in pockey i am poor :(");
	}

	// instance method with params 
	void RichMoney(int amount) {
		System.out.println("I currently have " + amount + " in bank :D ");	
	}

	int SavedMoney() {
		int balance = 250000;
		return balance;
	}

}



public class Home{

	int garden = 1;
	String color = "Red";
	int rooms = 10;
	int pool = 1;

	// function oh sry method (no function in java ;)
	// instance method
	void Computer() {
		System.out.println("Computer inside home...");
	}

	String WifiRouter() {
		return "WifiRouter inside home is always on";
	}


	public static void main(String[] args) {
		
		//  we can create multi objects for one class

		// create object h1 of class Home
		Home h1 = new Home();

		System.out.println(h1.garden);
		System.out.println(h1.color);
		System.out.println(h1.rooms);
		System.out.println(h1.pool);

		h1.color = "Orange";
		System.out.println(h1.color);
		System.out.println(h1.WifiRouter());


		Home h2 = new Home();

		System.out.println(h2.garden);
		System.out.println(h2.color);
		System.out.println(h2.rooms);
		System.out.println(h2.pool);

		// color will chnage for only h2 
		h2.color = "Pink";
		System.out.println(h2.color);
		h2.Computer();

		System.out.println();
		System.out.println();
		System.out.println();

		// --------------------------------------------------------------------

		Home2 newHome = new Home2();
		newHome.PoorMoney();
		newHome.RichMoney(5000);
		int x = newHome.SavedMoney();
		System.out.println(x);

		System.out.println("\n\nend");
	}

}