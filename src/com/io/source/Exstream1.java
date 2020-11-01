package com.io.source;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exstream1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("A firstname","A lastnme",1),
				new Person("B firstname","B lastnme",2),
				new Person("A firstname","A lastnme",3),
				new Person("D firstname","D lastnme",4)
				);
				
		people.stream()
		.filter(p->p.getLastName().startsWith("A"))
		.forEach(p->System.out.println(p.getFirstName()));
//		//we will perform multiple oper's in collections  and stream not external iteartion..everything in internal iteration
//		long count =people.stream()
//		.filter(p->p.getLastName().startsWith("A"))
//		.count();
//		System.out.println(count);
		
		// lambda exp enable llel processing -- multi core processor
		//Adv of stream
		// llel stream crteates mul threads 
		// stream provide lot of methods - to process hudge amout of data 
		// foreach / filter / map / findfirst /  count
		//in stream we have 2 types of methods ..1.intermidate(map/filter) 2.terminate (findfirst/foreach/count)
		//once stream used, we cant reuse again
		
//		Stream<Person> x = people.stream();
//		x.forEach(System.out::println);// will work
//		x.forEach(System.out::println);// excpetion
		
		//---------------
//		long count =people.parallelStream()
//				.filter(p->p.getLastName().startsWith("A"))
//				.count();
//				System.out.println(count);	
	}
}