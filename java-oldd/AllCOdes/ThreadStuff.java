class ThreadClass1 extends Thread{
	public void run(){
		for (int i=0; i<10; i++){
			System.out.println(i + "o");
		}
	}
}


public class ThreadStuff{
	public static void main(String[] args){

		ThreadClass1 thread1 = new ThreadClass1();
		thread1.start();

		for (int i=0; i<10; i++){
			System.out.println(i);
		}


		System.out.println("\n\nend...");
	}
}