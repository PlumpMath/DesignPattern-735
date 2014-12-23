package com.luulsj.www.designpattern.templatemethod;

public class ConcreteDeposit extends AbstractBank {

	@Override
	protected void transact() {
		System.out.println("Deposit");
	}

}
