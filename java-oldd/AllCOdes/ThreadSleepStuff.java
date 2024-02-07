class Thread1Class extends Thread {
	public void run(){
		for (int i=0; i<5; i++){
			System.out.println("Thread 1 Running");
		}
	}
}


// This Thread will sleep for 5 secs [5000ms] ;)
class Thread2Class extends Thread {
	public void run(){
		for (int i=0; i<5; i++){
			try{
				Thread.sleep(5000);
				System.out.println("Thread 2 Running");
			}
			catch(Exception e){
				System.out.println(e);	
			}
		}
	}
}




public class ThreadSleepStuff{
	public static void main(String[] args){

		Thread1Class thread1 = new Thread1Class();
		Thread2Class thread2 = new Thread2Class();

		thread1.start();
		thread2.start();


		System.out.println("\n\nend...");
	}
}