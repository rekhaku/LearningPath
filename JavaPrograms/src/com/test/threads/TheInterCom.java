package com.test.threads;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed..."+ this.amount);
	}

	synchronized void deposit(int amount) {

		System.out.println("going to deposit...");
		this.amount += amount;
		notify();
		System.out.println("deposit completed...  " +this.amount);

	}

}

public class TheInterCom {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(5000);
			}
		}.start();

	}

}
