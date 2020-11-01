package com.io.lambda;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
	
	public static void main(String[] args) {
		
		//List<Integer> numbers = Arrays.asList(1,2,3,4);		
		//numbers.stream()
		//.reduce((a,b)->a+b).ifPresent(System.out::println);
		//.reduce(0,(a,b)->a+b);
		//  .reduce(Integer::sum).ifPresent(System.out::println);
		//System.out.println(i);
		
		// identify longest string		
		List<String> list = Arrays.asList("a","bc","DEF");
		list.stream()
		.reduce((a,b)->a.length()>b.length()?a:b).ifPresent(System.out::println);
	}
}
