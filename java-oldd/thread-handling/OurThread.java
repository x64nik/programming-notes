class Cloud {
	void server() {
		System.out.println("server running...");
	}
}

class Laptop extends Thread{

	Cloud cloud;
	public String status;

	public Laptop(Cloud cloud) {
		this.cloud = cloud;
	}

	public void run() {
		youtube(status);
		cloud.server();
	}

	void youtube(String uname) {
		for (int i=0; i<5; i++) {
			// cloud.server();
			System.out.println(uname + " YOUTUBE ");
		} 
	}
}


class Elliot extends Thread {
	Laptop lap;
	String user;

	public Elliot(Laptop lap, String user) {
		this.lap = lap;
		this.user = user;
	}

	public void run() {
		lap.youtube(user);
	}
}


class Cisco extends Thread {
	Laptop lap;
	String user;

	public Cisco(Laptop lap, String user) {
		this.lap = lap;
		this.user = user;
	}

	public void run() {
		try {
			lap.youtube(user);
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}		
	}
}

public class OurThread {

	public static void main(String[] anything) {

	Cloud c1 = new Cloud();
	Laptop youtube = new Laptop(c1);	
	Elliot eli = new Elliot(youtube, "usr1");
	Cisco cis = new Cisco(youtube, "usr2");

	youtube.start();
	eli.start(); // thread 1
	cis.start(); // thread 2


	// try {
	// 	eli.join();
	// }

	// catch (InterruptedException error) {
	// 	System.out.println(error);
	// }



	System.out.println("\nworking");


	//System.out.println(new Integer(1)/ new Double(0));
	
	}
}