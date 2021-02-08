package AbstractFactoryPattern;

public class MainLogic {
	public static void main(String[] args) {
		CarFactory cf=new CarFactory();
		Car c=cf.getCar("Audi");
		c.details();
	}
}
