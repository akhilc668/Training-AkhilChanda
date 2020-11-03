package memberinnerclass;

class Redmi{
	void announcement() {
		System.out.println("New model release from 1 Dec");
		Model note9ProMax=new Model();
		note9ProMax.newFeatures();
	}
	class Model{
		void newFeatures() {
			System.out.println("new model with new Features");
		}
	}
}
public class MemberInnerClassDemo {

	public static void main(String[] args) {
		Redmi phone=new Redmi();
		phone.announcement();

	}

}
