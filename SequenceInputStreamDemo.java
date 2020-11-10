package com.files;

//It reads the files in sequence order.

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit.txt");
		FileInputStream f2=new FileInputStream("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit1.txt");
		SequenceInputStream si=new SequenceInputStream(f2, f1);
		int i=si.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=si.read();
		}
		f1.close();
		si.close();
	}

}
