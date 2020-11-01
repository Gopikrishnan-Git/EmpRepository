package com.io.source;

public class RunnableExample {

	public static void main(String[] args) {

			Thread d = new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("OK");
					
				}
			});
			d.start();
			
			//Thread thread = new Thread(()-> System.out.println("OK11")); //in this also call methods execution
			//Thread thread = new Thread(()-> call());// lambda
			Thread thread = new Thread(RunnableExample::call);// alternative lambda
			thread.start();					
	}
	private static void call() {
		System.out.println("OK11");
		
	}

}
