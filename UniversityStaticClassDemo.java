package com.staticnestedclass;

class University{
	static class Department{
		void announcement() {
			System.out.println("result are declared");
		}
		static void result() {
			System.out.println("result are in website");
		}
	}
	
}
public class UniversityStaticClassDemo {

	public static void main(String[] args) {
		University.Department cse=new University.Department();
		cse.announcement();
		University.Department.result();

	}

}
