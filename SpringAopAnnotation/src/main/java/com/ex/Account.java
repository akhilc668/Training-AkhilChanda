package com.ex;

import org.springframework.stereotype.Component;

@Component(value = "account")
public class Account implements HdfcBank{

	public void widthdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Widthdrawing");
	}

	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Depositing");
	}

}
