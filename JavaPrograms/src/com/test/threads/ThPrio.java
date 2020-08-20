package com.test.threads;

public class ThPrio {

	public static void main(String[] args) {
		Runner1 r1 = new Runner1();
		Runner2 r2 = new Runner2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	
	}


	

}
