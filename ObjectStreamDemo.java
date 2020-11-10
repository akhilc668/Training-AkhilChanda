package com.files;

//ObjectOutputStream creates an object of data of a file.
//ObjectInputStream retrives an object of data of a file

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fo=new FileOutputStream("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit2.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		String s="This is object output stream";
		oo.writeObject(s);
		oo.close();
		FileInputStream fi=new FileInputStream("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit2.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		s=(String)oi.readObject();
		System.out.println(s);
		oi.close();
	}

}
