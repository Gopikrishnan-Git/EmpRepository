package com.io.source;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class ExampleusingJava8 {
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
		
		printContially(people,(Person p)-> true,p->System.out.println(p));				
		printContially(people,(Person p)->p.getFirstName().startsWith("A"),p->System.out.println(p));
		printContially(people,(Person p)->p.getLastName().startsWith("A"),p->System.out.println(p.getFirstName()));
	}
	private static void printContially(List<Person> people,Predicate<Person	> condition,Consumer<Person> consumer) {
		for(Person p : people) {
			if(condition.test(p)) {
				//System.out.println(p);	
				consumer.accept(p);
			}
	}}
}