package com.files;

//It writes and prints the data in file
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit5.txt");
		String s="This is printwriter";
		pw.write(s);
		pw.print(s);
		pw.println();
		pw.println(s);
		pw.close();
		FileReader fr=new FileReader("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit5.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
		
	}

}
