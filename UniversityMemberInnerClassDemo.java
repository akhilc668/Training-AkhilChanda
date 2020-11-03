package memberinnerclass;

class University{
	void announcement() {
		System.out.println("Exams starts from 1 Dec");
		Department dept=new Department();
		System.out.println("from announcement");
		dept.examPapers();
	}
	class Department{
		void examPapers() {
			System.out.println("Exam papaers are being prepared");
		}
	}
}
public class UniversityMemberInnerClassDemo {

	public static void main(String[] args) {
		University jntu=new University();
		jntu.announcement();
		University.Department cse=jntu.new Department();
		System.out.println("From main mathod");
		cse.examPapers();
	}

}
