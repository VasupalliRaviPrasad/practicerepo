package com.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample implements Sample{
	
	public static void main(String[] args) {
		
		Predicate<Integer> pp = p->p>10;
		System.out.println(pp.test(10)); 
		
		
		String[] names = {"Ravi", "Raju", "Ramana", "Prasad"};
		
		Predicate<String> ps = s->s.startsWith("R");
		for(String name: names) {
			if(ps.test(name)) {
				System.out.println(name);
			}
		}
		
		
//		PredicateExample pr = new PredicateExample();
//		pr.m1();
//		
//		Sample.changedata();
//		
//		pr.data();
//		
//		
//
//		Person p1 = new Person("John", 26);
//		Person p2 = new Person("Smith", 16);
//		Person p3 = new Person("Raja", 36);
//		Person p4 = new Person("Rani", 6);
//		
//		Person[] persons = {p1, p2, p3, p4};
//
//
//		
//		Predicate<Person> p = t1->t1.name.startsWith("R");
//		Predicate<Person> r = t1->t1.age>18;
//		Predicate<Person> result = p.and(r);
//		
//		for(Person person: persons) {
//			if(result.test(person)) {
//				System.out.println(person.name);
//			}
//		}
	}

	@Override
	public void m1() {
		System.out.println("overridden the abstract method");
		
	}
	public void data() {
		System.out.println("default method from Class");
	}
	

}
