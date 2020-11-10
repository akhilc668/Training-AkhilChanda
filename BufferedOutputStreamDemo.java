package com.files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit1.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		String s="Hello world from bufferedoutputstream";
		bo.write(s.getBytes());
		bo.close();
	}

}
