package com.ex;

import org.springframework.stereotype.Component;

@Component
public class Account implements HdfcBank {

	public void withdraw() {
		System.out.println("withdraw logic");
	}

	public void deposit() {
		System.out.println("deposit logic");
	}

}
