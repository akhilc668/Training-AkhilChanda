package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fo=new FileOutputStream("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit.txt");
			String s="Hello world";
			fo.write(s.getBytes());
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
