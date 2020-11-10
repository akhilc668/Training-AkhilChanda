package com.files;

//Stringwriter writes in this file and StringReader read string from same file.

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		StringWriter sw=new StringWriter();
		String str="This is string writer";
		sw.write(str);
		sw.append(" and reader");
		StringReader sr=new StringReader(sw.getBuffer().toString());
		int i=sr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=sr.read();
		}
		sw.close();
		sr.close();
	}

}
