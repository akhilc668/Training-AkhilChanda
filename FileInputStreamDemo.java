package com.files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit.txt");
		int i=fi.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fi.read();
		}
		fi.close();
	}

}
