package test;

public class MultiThreadingEx1 extends Thread{
	@Override
	public void run() {
		for(int i =0 ;i<10;i++) {
			System.out.println("Child Thread");
		}
		
	}
	
	public static void main(String[] args) {
		
		MultiThreadingEx1 obj = new MultiThreadingEx1();
		
		Thread thread = new Thread(obj);
		
		thread.start();	//run method calling
		
		for(int i = 0 ;i<10 ;i++) {
			System.out.println("Main thread");
		}
		
	

}}
