/*

Outer->class{
	Outer->method(){
	}
	Inner->class{
		Inner->method(){
		}
	}
}

*/


class OuterClass{
	void OuterMethod(){
		System.out.println("Outer Method here");
	}
	class InnerClass{
		void InnerMethod(){
			System.out.println("Inner Method here");
		}
	}
}

public class WrapperClassStuff{
	public static void main(String[] args){

		OuterClass outobj = new OuterClass();
		InnerClass inobj = outobj.new InnerClass();
		
		inobj.InnerMethod();


		System.out.println("\n\nend...");
	}
}