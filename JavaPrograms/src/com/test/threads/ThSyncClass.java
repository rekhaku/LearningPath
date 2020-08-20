package com.test.threads;

public class ThSyncClass {

	public static void main(String[] args) {
		
		Table table = new Table();
		MyThread1 t1= new MyThread1(table);
		MyThread2 t2= new MyThread2(table);
		t1.start();
		t2.start();
	}

}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table table) {
		this.t = table;
	}

	public void run() {
		t.printTable(8);
	}
}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table table) {
		this.t = table;
	}

	public void run() {
		t.printTable(100);
	}
}

class Table {
 void printTable(int n) {
		for (int i = 1; i < 5; i++)			
		{
			System.out.println(n * i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
