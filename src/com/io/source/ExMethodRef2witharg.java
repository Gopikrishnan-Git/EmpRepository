package com.io.source;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExMethodRef2witharg {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("A firstname","A lastnme",1),
				new Person("B firstname","B lastnme",2),
				new Person("A firstname","A lastnme",3),
				new Person("D firstname","D lastnme",4)
				);		
		
		Collections.sort(people, (Person p1,Person p2)-> p1.getLastName().compareTo(p2.getLastName()));	
		//printContially(people,(Person p)-> true,p->System.out.println(p));	
		printContially(people, p-> true,System.out::println);	// here arg is one obj and method also one obj	
		//here we passing input arg as p ,how compiler know about input is there or not..with the help of consumer, consumer should accept
		//some input
		//if (p) -> method(p) ...use M.Ref
	}

	private static void printContially(List<Person> people,Predicate<Person	> prdeicate,Consumer<Person> consumer) {
		for(Person p : people) {
			if(prdeicate.test(p)) {
				//System.out.println(p);	
				consumer.accept(p);
			}
	}}
}
