

// simple try|catch
class Child{
	Child(){	
		System.out.println("ok");
		System.out.println("ok");
		try{
			System.out.println(10 / 0);
		}
		catch (Exception e) {
			System.out.println(e);	
		}
		System.out.println("ok");
		System.out.println("ok");

	}	
}

// nested try|catch 
class Child2{
	Child2(){
		try {
			System.out.println(10 / 2);
			try{
				System.out.println(10 / 0);
			}
			catch(Exception e){
				System.out.println(e);	
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Done!");
	}
}


class Child3{
	Child3(){
		try {
			System.out.println(10 / 2);
			try{
				System.out.println(10 / 0);
			}
			catch(Exception e){
				System.out.println("here");	
				System.out.println(10 / 0);
				System.out.println(e);	
			}
		}
		catch(Exception e){
			System.out.println("here2");	
			System.out.println(e);
		}

		finally{
			System.out.println("always works ;) ");
		}
		System.out.println("Done!");	
	}
}



public class ExceptionStuff{
	public static void main(String[] args){

		// Child obj1 = new Child();
		// Child2 obj2 = new Child2();
		Child3 obj3 = new Child3();


		System.out.println("\n\nend...");

	}
}