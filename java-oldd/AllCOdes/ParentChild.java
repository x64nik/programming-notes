class Matrix{
	{
		System.out.println("---- YOU ALL ARE LIVING IN MATRIX XD ----\n");	
	}
}



class GrandParent extends Matrix{
	{
		System.out.println("papa of papa: without me you all are nothing hehe");
	}
}


class Parent extends GrandParent{

	{
		System.out.println("Papa: and without me you are nothing");
	}

	void papi(){
		System.out.println("i am his parent");
	}
}

class Child extends Parent{
	// will get some properties from parent class 

	{
		System.out.println("child of papa: yes and i am young and stupid :D");
	}

	void kid(){
		System.out.println("yes and i am his child");	
	}

}



public class ParentChild{
	public static void main(String[] args) {


		Child obj1 = new Child();
		obj1.papi();
		obj1.kid();

		System.out.println("\n\nend");
	}
}