package com.io.source;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleusingJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("A firstname","A lastnme",1),
				new Person("B firstname","B lastnme",2),
				new Person("A firstname","A lastnme",3),
				new Person("D firstname","D lastnme",4)
				);
		
		//sort the list by l.name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());				
			}
		});
		
		Collections.sort(people, (Person p1,Person p2)-> p1.getLastName().compareTo(p2.getLastName()));
		//creat method that prints all elements in the list
		//printAll(people);
		printContially(people,(Person p)-> true);
		//create method that print all people that have l.name begin with C
		//printALLwithlastname(people);
//		printContially(people,new Condition() {
//
//			@Override
//			public boolean test(Person p) {
//				return p.getLastName().startsWith("A");
//			}		
//			
//		});
		
		printContially(people,(Person p)->p.getFirstName().startsWith("A"));
		printContially(people,(Person p)->p.getLastName().startsWith("A"));
		
//		printContially(people,new Condition() {
//			@Override
//			public boolean test(Person p) {
//				return p.getFirstName().startsWith("A");
//			}		
//			
//		});
	}

	private static void printContially(List<Person> people,Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);		
			}
	}}

//	private static void printALLwithlastname(List<Person> people) {
//		
//		for(Person p : people) {
//			if(p.getLastName().startsWith("A"))
//			System.out.println(p);
//		}
//	}

//	private static void printAll(List<Person> people) {
//		for(Person p : people) {
//			System.out.println(p);
//		}		
//	}
}