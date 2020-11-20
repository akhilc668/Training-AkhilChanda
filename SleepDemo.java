package com.threads;

public class SleepDemo extends Thread{

	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new SleepDemo().start();
	}

}
