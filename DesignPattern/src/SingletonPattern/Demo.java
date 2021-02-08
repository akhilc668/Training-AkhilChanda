package SingletonPattern;

public class Demo {
	public static Demo d=new Demo();
	private Demo() {
		
	}
	
	public static Demo getObject() {
		return d;
	}
	
	public void message() {
		System.out.println("welcome to demo");
	}
}
