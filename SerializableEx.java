package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	float marks;
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}
public class SerializableEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s=new Student(1,"Akhil Chanda",450f);
		FileOutputStream fo = new FileOutputStream("E:\\Motivity\\Files\\jnit2.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(s);
		oo.close();
		
		//Deserializable
		FileInputStream fi = new FileInputStream("E:\\Motivity\\Files\\jnit2.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		s = (Student) oi.readObject();
		System.out.println(s.id+" "+s.name+" "+s.marks);
		oi.close();
	}
}
