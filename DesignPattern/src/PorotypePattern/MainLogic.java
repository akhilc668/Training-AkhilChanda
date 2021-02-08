package PorotypePattern;

import java.util.Map;

public class MainLogic {

	public static void main(String[] args) throws Exception {
		StudentNumbers sn=new StudentNumbers();
		sn.add();
		System.out.println("sn:-"+sn.getStudent());
		
		StudentNumbers sn1=(StudentNumbers) sn.clone();
		Map<String,Long> student=sn1.getStudent();
		student.put("Mahesh", 6547893210l);
		System.out.println("sn1:-"+sn1.getStudent());
		System.out.println("sn:-"+sn.getStudent());
		
		StudentNumbers sn2=(StudentNumbers) sn1.clone();
		Map<String,Long> student1=sn2.getStudent();
		student1.put("Rahul", 6398521470l);
		System.out.println("sn2:-"+sn2.getStudent());
		System.out.println("sn1:-"+sn1.getStudent());
		
	}

}
