package com.io.source;

public class Greeter {

	public void greet(Greeting g) {
		g.perform();
		System.out.println("i am in greet method");
	}
	public static void main(String[] args) {
		Greeter g = new Greeter();
		Greeting t = new GreetingImpl();
		g.greet(t);
		
	}
}
