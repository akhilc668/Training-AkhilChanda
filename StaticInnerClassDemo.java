package com.staticnestedclass;

class Redmi {

	static class Model {
		void announcement() {
				System.out.println("New model release from 1 Dec");
		}
		static void newFeatures() {
			System.out.println("new model with new Features");
		}
	}

}

public class StaticInnerClassDemo {

	public static void main(String[] args) {
		Redmi.Model note9promax=new Redmi.Model();
		note9promax.announcement();
		Redmi.Model.newFeatures();

	}

}
