package FactoryPattern;

public class CarFactory {
	public Car getCar(String name) {
		if(name.equals("Audi")) 
			return new Audi();
		else if(name.equals("Swift"))
			return new Swift();
		return null;
	}
}
