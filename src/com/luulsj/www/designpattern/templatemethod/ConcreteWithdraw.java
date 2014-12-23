package com.luulsj.www.designpattern.templatemethod;

public class ConcreteWithdraw extends AbstractBank {

	@Override
	protected void transact() {
		System.out.println("Withdraw");
	}

}
