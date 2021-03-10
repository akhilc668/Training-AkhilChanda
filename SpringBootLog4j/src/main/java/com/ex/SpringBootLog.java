package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ex2.MyRun;

@SpringBootApplication
public class SpringBootLog {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog.class, args);
		MyRun mr=new MyRun();
		mr.run();
	}
}
