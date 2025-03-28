package com.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> c= name->System.out.println(name + " good Evening");
		c.accept("Ravi");
		
		String[] str = {"Only ravi","Ravi Prasad","Prasad","Ravi"};
		List<String> str1 = Arrays.asList(str);
		
		str1.forEach(name->System.out.println(name));
	}

}

