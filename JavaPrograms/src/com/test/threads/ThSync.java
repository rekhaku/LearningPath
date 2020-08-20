package com.test.threads;


public class ThSync {


	public static void main(String[] args) {
		Runner1 r1 = new Runner1();
		Runner2 r2 = new Runner2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.run();
		
		// all t1 , then starts t2
		t1.run();
		t2.run();
		
		// all t1 , then starts t2
		t2.run();
		t2.start();
		
		//order of exec main()->run()
		
	}

}
