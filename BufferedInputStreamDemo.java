package com.files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit1.txt");
		BufferedInputStream bi=new BufferedInputStream(fi);
		int i=bi.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=bi.read();
		}
		bi.close();
	}

}
