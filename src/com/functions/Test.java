package com.functions;

public class Test {
	
	
	public int methodReference() {
		for(int i =1; i <= 5; i ++) {
			System.out.println("Child Thread" + Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	public static void main(String[] args) throws InterruptedException {
		
		Test test = new Test();

		Runnable r = test::methodReference;
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i =1; i<=5; i++) {
			System.out.println("main Thread" + Thread.currentThread().getName());
			Thread.sleep(5000);
		}
	}

}
