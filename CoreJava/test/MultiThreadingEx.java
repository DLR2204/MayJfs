package test;

public class MultiThreadingEx implements Runnable{

	@Override
	public void run() {
		for(int i =0 ;i<10;i++) {
			System.out.println("Child Thread");
		}
		
	}
	
	public static void main(String[] args) {
		
		MultiThreadingEx obj = new MultiThreadingEx();
		
		Thread thread = new Thread(obj);
		
		thread.start();	//run method calling
		
		for(int i = 0 ;i<10 ;i++) {
			System.out.println("Main thread");
		}
		
		
		
	}

	
}
