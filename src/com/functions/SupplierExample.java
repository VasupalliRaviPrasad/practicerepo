package com.functions;

import java.util.function.Supplier;

public class SupplierExample {
	
	public static void main(String[] args) {
		Supplier<Integer> s = () -> {
			int ans=0;
			for(Integer i =1; i<= 5; i ++) {
				 ans += i;
			}
			return ans;
		};
		System.out.println(s.get());

	}

}
