package com.test.threads;

class Runner1 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(100);
				System.out.println("current thread is: "+Thread.currentThread().getName());
				System.out.println("current thread priority is :"+Thread.currentThread().getPriority());
				System.out.println("from Runner extends Thread"+i );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Runner2 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(100);
				System.out.println("current thread is: "+Thread.currentThread().getName());
				System.out.println("current thread priority is :"+Thread.currentThread().getPriority());
				System.out.println("from Runner2 implements Runnable"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}


public class ThStart {


	public static void main(String[] args) {
		Runner1 r1 = new Runner1();
		Runner2 r2 = new Runner2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
//		t1.start();
//		t2.run();
//		
//		// all t1 , then starts t2
//		t1.run();
//		t2.run();
		
		// all t1 , then starts t2
		t1.run();
		t2.start();
		
		//order of exec main()->run()
		
	}

}
