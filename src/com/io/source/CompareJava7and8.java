package com.io.source;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareJava7and8 {
	public static void main(String[] args) {		
				List<Person> listofobj = Arrays.asList(
				new Person("ZxcF.nme","Zcd.Lastname", 1),
				new Person("AxcF.nme","Acd.Lastname", 2),
				new Person("YxcF.nme","Ycd.Lastname", 3)
				);		
//		Collections.sort(listofobj,new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getLastName().compareTo(o2.getLastName());				
//			}			
//		});
		
		Collections.sort(listofobj, (Person o1, Person o2)->o1.getLastName().compareTo(o2.getLastName()));
		
		System.out.println("===== Print all records ==========");
		printAll(listofobj);
		System.out.println("===== Print all records start with A ==========");
		printAllStartwithA(listofobj);
		System.out.println(" ====== Condition applying =======");
		printconditionally(listofobj,new Conditionally(){	
			@Override
			public boolean test(Person p) {
				System.out.println(" ====== ********** =======");
				return p.getFirstName().startsWith("A");				
			}			
		});
		System.out.println("print all");
		printconditionally(listofobj,(Person)->true);
		
		System.out.println("print all start with Y");
		printconditionally(listofobj,(Person)->Person.getFirstName().startsWith("Y"));
		
	}
	private static void printconditionally(List<Person> listofobj,Conditionally condition) {
		for(Person p : listofobj) {
			if(condition.test(p))
			{
				System.out.println("First Name-->"+p.getFirstName()+"  Age-->"+p.getAge());
			}
		}
	}
	private static void printAllStartwithA(List<Person> listofobj2) {
		for(Person p : listofobj2) {
			if(p.getFirstName().startsWith("A"))
				System.out.println("First Name-->"+p.getFirstName()+"  Age-->"+p.getAge());
		}
	}
	private static void printAll(List<Person> listofobj2) {
		for(Person p : listofobj2) {
			System.out.println("First Name-->"+p.getFirstName()+"  Age-->"+p.getAge());
		}		
	}	
}
interface Conditionally{
	public boolean test(Person p);
}