package com.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamsPractice {
	
	public static void main(String[] args) {
		
//		List<String> len = new ArrayList<String>();
//		len.add("Ravi");
//		len.add("Prasad");
//		len.add("Sahithi");
//		len.add("Karthik");
//		len.add("Srinivas");
//		len.add("Vtalent");
//		
//		
//		Stream<String> stream = len.stream();
//		Stream<String> filter = stream.filter(name->name.length()>6);
//		filter.forEach(name->System.out.println(name));
		
		
		User u1 = new User("Ravi", 27);
		User u2 = new User("Karthik", 24);
		User u3 = new User("Sahithi", 27);
		List<User> users = Arrays.asList(u1, u2, u3);
		Stream<User> stream2 = users.stream();
		stream2.filter(user->user.getName().startsWith("S")&& user.getAge()>=18)
		.forEach(user->System.out.println(user.getName()));
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream()
		       .map(n -> n * n).limit(2).skip(1)
		       .forEach(System.out::println); 
		
		
		List<String> names = Arrays.asList("raja", "rani", "raja", "rani", "guru");
		names.stream().distinct().forEach(System.out::println);
		
	}

}
