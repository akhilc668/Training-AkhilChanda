package com.files;

//pipedwirter and pipedreader are connected to ecahother.

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterReaderDemo {

	public static void main(String[] args) throws IOException {
		PipedWriter pw=new PipedWriter();
		PipedReader pr=new PipedReader();
		String s="This is piped writer";
		pw.connect(pr);
		pw.write(s);
		pw.append(" and reader");
		int i=pr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=pr.read();
		}
		pw.close();
		pr.close();
	}

}
