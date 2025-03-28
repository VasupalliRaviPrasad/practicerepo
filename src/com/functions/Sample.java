package com.functions;

public interface Sample {
	
	void m1();
	
	default void data() {
		System.out.println("default method from sample interface");
	}
	
	static void changedata() {
		System.out.println("static method from sample interface");
	}

	public static void main(String[] args) {
		int i =10;
		int j =1;
		System.out.println((i>j) ? "i greater than j":"i less than j");
	}
}
