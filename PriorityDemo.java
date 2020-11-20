package com.threads;

public class PriorityDemo extends Thread {
	public synchronized void run() {
		System.out.println("Thread Name is: "+Thread.currentThread().getName());
		System.out.println("Thread Priority is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		PriorityDemo pd=new PriorityDemo();
		pd.setPriority(MIN_PRIORITY);
		PriorityDemo pd1=new PriorityDemo();
		pd1.setPriority(MAX_PRIORITY);
		pd.start();
		pd1.start();
	}

}
