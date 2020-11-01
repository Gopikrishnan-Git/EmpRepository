package com.io.source;
import java.util.Arrays;
import java.util.List;
public class ForEachColl {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("A firstname","A lastnme",1),
				new Person("B firstname","B lastnme",2),
				new Person("A firstname","A lastnme",3),
				new Person("D firstname","D lastnme",4)
				);
		
		//for loop
//		for(int i = 0 ; i <people.size();i++) {
//			System.out.println(people.get(i));
//		}
		
		//for in loop
//		for(Person p : people) {
//			System.out.println(p);
//		}
		
		// above mentioed External iteartor ... bcz we need to force i =0 ; i.size;i++ every thing ..we r managing/controlling
	
		// internal iterator -> meaning -> we r not control .. at runtime system taking care ..
		people.forEach(p->System.out.println(p));		
		//people.forEach(System.out::println);
		
		// adv: simply the code and performance bcz for ex first 3 person obj run in one core and another 2 in one core
		//make it easy for processor to run multiple threads / llelisam
	}	
}