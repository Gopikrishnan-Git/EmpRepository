package com.io.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapwithForloop {

	public static void main(String[] args) {
		/*
		// map() function with opeartion of number*3 on each element of stream.
		List<Integer> list = Arrays.asList(3,6,9);
		list.stream()
		.map(n->n*3)
		//.forEach(n->System.out.println(n));
		.forEach(System.out::println);
		*/
		
		// map() function with opeartion of converting L.case to U.case		
		/*List<String> list = Arrays.asList("a","b","c");
		list.stream()
		.map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		*/
		
		// map() function with opeartion of mapping string length 
		/*List<String> list = Arrays.asList("a","ab","abc");
		list.stream()
		.map(s->s.length())
		.forEach(s->System.out.println(s));
		*/
		// map() function with opeartion of converting string to integer
		/*
		List<String> list = Arrays.asList("1","2");
		System.out.println("List of string -->"+list);
		
		List<Integer> ilist = list.stream()
		.map(n->Integer.valueOf(n))
		.collect(Collectors.toList());
		System.out.println(ilist);
		*/
		
		// to find all distinct salaries		
		/*
		List<Employee> listofemp = Arrays.asList(				
				new Employee(1, "A", 100),
				new Employee(2, "B", 200),
				new Employee(3, "C", 100),
				new Employee(4, "D", 300),
				new Employee(5, "E", 100)
				);
		
		List<Integer> result = listofemp.stream()
		.map(e->e.getSalary())
		.distinct()
		//.forEach(e->System.out.println(e));
		.collect(Collectors.toList());
		System.out.println(result);
		}*/
		
		// convert List of string to List of Integer and then filter all even numbers
		/*
		List<String> list = Arrays.asList("2","3","4","5");
		
		List<Integer> result = list.stream()
		.map(n->Integer.valueOf(n))
		.filter(n->n%2 == 0)
		//.forEach(n->System.out.println(n));
		.collect(Collectors.toList());		
		System.out.println(result);
		*/
		
		// Map values print	
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("x", 1);
		m.put("y", 2);
		m.put("z", 3);		
		m.forEach((k,v)->System.out.println("Key-->"+k+"  value-->"+v));		
	}
}