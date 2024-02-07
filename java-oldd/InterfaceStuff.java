interface Intra{
	int num = 20;
	public static final int num2 = 100;

	void show();

	default void disp(){
		System.out.println("default method");
	}
}



class Child implements Intra{
	void show(){
		System.out.println("inplemented method");
	}
}

public class InterfaceStuff{
	public static void main(String[] args){
		System.out.println("\n\n");

		Child obj1 = new Child();
		System.out.println(obj1);



		System.out.println("\n\nend");
	}
}