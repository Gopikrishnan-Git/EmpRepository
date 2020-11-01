package com.io.source;

public class ExMethodRef {

	public static void main(String[] args) {
		
		//Thread t = new Thread(()->call()); // no input arg and execution method is also no arg then we go alnretae sytax
		// meaning input arg and method exe arg must same then go alternate syntax
		Thread t = new Thread(ExMethodRef::call); // method ref execution
		// () -> method() ..if this kind of model comes .. use M.ref
		t.start();	
	}

	private static void call() {
		System.out.println("call method");
	}
}