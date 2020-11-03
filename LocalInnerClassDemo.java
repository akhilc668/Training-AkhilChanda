package com.localinnerclass;


class Redmi{
	void announcement() {
		System.out.println("New model release from 1 Dec");
		class Model{
			void newFeatures() {
				System.out.println("new model with new Features");
			}
		}
		Model note9ProMax=new Model();
		note9ProMax.newFeatures();
	}
	
}
public class LocalInnerClassDemo {

	public static void main(String[] args) {
		Redmi phone=new Redmi();
		phone.announcement();

	}

}
