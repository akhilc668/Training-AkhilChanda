package FactoryPattern;

public class Audi implements Car{
	public void details() {
		System.out.println("Car name is Audi");
		System.out.println("milage: 15kms");
		System.out.println("fuel type: desel");
	}
	
	public void start() {
		System.out.println("displaying");
	}
}
