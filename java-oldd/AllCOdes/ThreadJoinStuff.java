class Thread1Class extends Thread{
	// public void run(){
	// 	for (int i=0; i<5; i++){
	// 		System.out.println("Thread 2 Running");
	// 	}
	// }
	public Thread1Class(){
		for (int i=0; i<5; i++){
			System.out.println("Thread 2 Running");
		}
	}
}

class Thread2Class extends Thread{
	// public void run(){
	// 	for (int i=0; i<5; i++){
	// 		System.out.println("Thread 2 Running");
	// 	}
	// }

	public Thread2Class(){
		for (int i=0; i<5; i++){
			System.out.println("Thread 2 Running");
		}
	}
}

class Thread3Class extends Thread{
	public Thread3Class(){
		for (int i=0; i<5; i++){
			System.out.println("Thread 3 Running");
		}
	}
}



public class ThreadJoinStuff{
	public static void main(String[] args){

		Thread1Class thread1 = new Thread1Class();
		Thread2Class thread2 = new Thread2Class();
		Thread3Class thread3 = new Thread3Class();

		thread1.start();
		try{
			thread1.join();	
		}
		catch(Exception e){
			System.out.println(e);
		}
		thread2.start();
		

		System.out.println("\n\nend...");
	}
}