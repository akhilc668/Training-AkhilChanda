package com.files;

//Filewriter can write complete string into file at once and filereader reads one by one character.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit3.txt");
		String str="This is File Writer";
		fw.write(str);
		fw.close();
		FileReader fr=new FileReader("C:\\Users\\akhil nikhil\\Desktop\\Motivity\\Files\\jnit3.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
