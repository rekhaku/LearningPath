package com.test.threads;

public class ThSyncBlock {

	public static void main(String[] args) {

		Table1 table = new Table1();
		MyThread4 t1 = new MyThread4(table);
		MyThread3 t2 = new MyThread3(table);
		t1.start();
		t2.start();
	}

}

class MyThread3 extends Thread {
	Table1 t;

	MyThread3(Table1 table) {
		this.t = table;
	}

	public void run() {
		t.printTable(8);
	}
}

class MyThread4 extends Thread {
	Table1 t;

	MyThread4(Table1 table) {
		this.t = table;
	}

	public void run() {
		t.printTable(100);
	}
}

class Table1 {
	void printTable(int n) {
	synchronized(this)	
		{
			for (int i = 1; i < 5; i++) {
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
}
