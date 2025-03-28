package com.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
	
	public static void main(String[] args) {
		
		Function<String, Integer> fun1 = name -> name.length();
		System.out.println(fun1.apply("Ravi    "));
		
		BiFunction<String, String, Integer> fun = (name1, name2)->(name1+name2).length();
		
		System.out.println(fun.apply("Ravi", "Prasad"));
	}

}
