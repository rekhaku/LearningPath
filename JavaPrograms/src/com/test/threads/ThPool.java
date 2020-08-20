package com.test.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{

	private String message;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Start - " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End - " + Thread.currentThread().getName());
	}
	
	public WorkerThread(String message) {
		this.message =message;
	}
}

class WorkerThread2 extends Thread
{

	private String message;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Start - " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End - " + Thread.currentThread().getName());
	}
	
	public WorkerThread2(String message) {
		this.message =message;
	}
}


public class ThPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i =0;i<5;i++)
		{
			Thread worker = new WorkerThread2("worker");			
			exec.execute(worker);
			Thread.currentThread().getThreadGroup().interrupt();
			
		}
		exec.shutdown();
	}

}
