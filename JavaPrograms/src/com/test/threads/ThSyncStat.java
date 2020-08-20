package com.test.threads;

public class ThSyncStat {

	public static void main(String[] args) {
		
		Table2 table = new Table2();
		Table2 table1 = new Table2();
		MyThread5 t1= new MyThread5(table);
		MyThread6 t2= new MyThread6(table);
		MyThread5 t3= new MyThread5(table1);
		MyThread6 t4= new MyThread6(table1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class MyThread5 extends Thread {
	Table2 t;

	MyThread5(Table2 table) {
		this.t = table;
	}

	public void run() {
		t.printTable(8);
	}
}

class MyThread6 extends Thread {
	Table2 t;

	MyThread6(Table2 table) {
		this.t = table;
	}

	public void run() {
		t.printTable(100);
	}
}

class MyThread7 extends Thread {
	Table2 t;

	MyThread7(Table2 table) {
		this.t = table;
	}

	public void run() {
		t.printTable(8);
	}
}

class MyThread8 extends Thread {
	Table2 t;

	MyThread8(Table2 table) {
		this.t = table;
	}

	public void run() {
		t.printTable(8);
	}
}


class Table2 {
 synchronized static void printTable(int n) {
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
