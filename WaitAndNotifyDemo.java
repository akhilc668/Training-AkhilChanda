package com.threads;

class Customer{
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if(this.amount<amount) {
			System.out.println("less amount go and deposit");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdrawl completed");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("Deposit done");
		notify();
	}
}
public class WaitAndNotifyDemo {

	public static void main(String[] args) {
		Customer akhil=new Customer();
		new Thread() {
			public void run() {
				akhil.withdraw(20000);
			}
		}.start();
		new Thread() {
			public void run() {
				akhil.deposit(25000);
			}
		}.start();

	}

}
