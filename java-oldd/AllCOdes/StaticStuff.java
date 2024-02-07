

class Child{
	static int num = 500;

	static void show(){
		System.out.println("Static Method");
	}

	static {
		System.out.println("Static Block");	
	}
}


public class StaticStuff{
	public static void main(String[] args){

		Child kid = new Child();
		kid.show();

		System.out.println("\n\nend...");
	}
}