package SingletonPattern;

public class MainLogic {
	public static void main(String[] args) {
		Demo d=Demo.getObject();
		d.message();
	}
}
