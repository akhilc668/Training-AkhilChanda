package com.files;

//Buffered writer can write complete buffered string and Buffered reader read a complete line in a file 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit4.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String s="This is Buffered Writer";
		bw.write(s);
		bw.append(" and Buffered Reader");
		bw.close();
		
		FileReader fr=new FileReader("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit4.txt");
		BufferedReader br=new BufferedReader(fr);
		String i=br.readLine();
		System.out.println(i);
		br.close();
	}

}
