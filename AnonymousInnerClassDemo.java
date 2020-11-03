package com.anonymous;

abstract class Mobile {
	abstract void cost();

	abstract void ram();

	abstract void harddisk();

	abstract void camera_pexcel();

	void open() {
		System.out.println("open with power botton");
	}
}

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		Mobile phone = new Mobile() {

			void cost() {
				System.out.println("Prize of Redmi is: 15000");
			}

			void ram() {
				System.out.println("Ram of Redmi is: 6GB");
			}

			void harddisk() {
				System.out.println("Harddisk of Redmi is: 128GB");
			}

			void camera_pexcel() {
				System.out.println("camera_pexcel of Redmi is: 64px");
			}

		};
		phone.cost();
		phone.camera_pexcel();
		phone.harddisk();
		phone.ram();
		phone.open();

	}

}
