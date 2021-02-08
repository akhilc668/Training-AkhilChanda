package PorotypePattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentNumbers implements Cloneable {
	private Map<String,Long> student;

	public Map<String, Long> getStudent() {
		return student;
	}
	
	public StudentNumbers() {
		student=new HashMap<String, Long>();
	}
	
	public StudentNumbers(Map<String,Long> student) {
		this.student=student;
	}
	
	public void add() {
		student.put("Akhil", 9632587410l);
		student.put("prashanth", 7412589630l);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Map<String,Long> temp=new HashMap<String, Long>();
		Set<Entry<String, Long>>s=student.entrySet();
		Iterator< Entry<String, Long>> i=s.iterator();
		while (i.hasNext()) {
			Map.Entry<String, Long> entry = (Map.Entry<String, Long>) i.next();
			temp.put(entry.getKey(),entry.getValue());
		}
		return new StudentNumbers(temp);
	}
}
