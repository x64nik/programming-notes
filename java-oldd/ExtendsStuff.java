class GrandParent {
	int money = 65000;

	void grandpa(){
		System.out.println("i am old :/");
	}
}

class Parent extends GrandParent{
	void papi() {
		System.out.println("i am gettiing old :(");
	}
}

class Child extends Parent {
	String name = "elliot";	
	void kid() {
		System.out.println("i am young and stupid ``<3 ");
	}
}


class Family extends Child{
	// Child fam = new Child();

	// Family() {
	// 	fam.grandpa();
	// 	fam.papi();
	// 	fam.kid();
	// }

	//haha no need to create obj here XD
	void test(){
		System.out.print("kid: ");
		super.kid();

		System.out.print("papi: ");
		super.papi();

		System.out.print("grandpa: ");
		super.grandpa();
	}


}




public class ExtendsStuff {
	public static void main(String[] args) {
		System.out.println();


		Family fam = new Family();
		fam.test();

		System.out.println("\n\n\nyolo");
	}
}