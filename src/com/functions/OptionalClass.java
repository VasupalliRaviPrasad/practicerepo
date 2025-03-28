package com.functions;

import java.util.Optional;

public class OptionalClass {
	
	static Optional<String> getName(Integer id) {
		String name = "";
		if(id==101) {
			name = "Prasad";
		}
		if(id==102) {
			name = "Ravi";
		}
		if(id==101) {
			name = "Ravi Prasad";
		}
		return Optional.ofNullable(name);
	}
	
	public static void main(String[] args) {
		Optional<String> data = getName(102);
		
//		if(data.isPresent()) {
//			String name = data.get();
//			System.out.println(name);
//		}
	}
 
}
