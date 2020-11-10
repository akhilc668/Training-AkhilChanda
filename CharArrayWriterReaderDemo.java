package com.files;

//CharArraywriter writes in this file and CharArrayReader read string as chararray from same file.

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		 CharArrayWriter cw=new CharArrayWriter();
		 String str="This is char array writer";
		 cw.write(str);
		 cw.append(" and reader");
		 CharArrayReader cr=new CharArrayReader(cw.toCharArray());
		 int i=cr.read();
		 while(i!=-1) {
			 System.out.print((char)i);
			 i=cr.read();
		 }
		 cw.close();
		 cr.close();
	}

}
