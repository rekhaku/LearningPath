package com.test.threads;

public class ThJoin {
	public static void main(String[] args) {
		Runner1 r1 = new Runner1();
		Runner2 r2 = new Runner2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();

		try {
			t1.join(200);
			System.out.println(t1.getName());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t2.getName());
		t2.start();
	
	}

}
