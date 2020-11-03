package com.localinnerclass;



class University{
	void announcement() {
		System.out.println("Exams results declared");
		class Department{
			void examPapers() {
				System.out.println("Results are in website");
			}
		}
		Department dept=new Department();
		dept.examPapers();
	}
	
}

public class UniversityLocalInnerClassDemo {

	public static void main(String[] args) {
		University jntu=new University();
		jntu.announcement();
	}

}
