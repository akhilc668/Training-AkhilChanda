package com.threads;

class Trainees{
	public synchronized void message(String companyName) {
		for(int i=0;i<5;i++) {
			System.out.print("Welcome to ");
			try {
				System.out.println(companyName);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread{
	Trainees t;
	String companyName;
	MyThread(Trainees t,String companyName) {
		this.companyName=companyName;
		this.t=t;
	}
	public void run() {
		t.message(companyName);
	}
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		Trainees Akhil=new Trainees();
		MyThread mt=new MyThread(Akhil, "Motivity");
		MyThread mt1=new MyThread(Akhil, "JNIT");
		mt.start();
		mt1.start();
	}

}
