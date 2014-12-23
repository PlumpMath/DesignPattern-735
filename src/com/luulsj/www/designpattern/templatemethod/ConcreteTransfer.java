package com.luulsj.www.designpattern.templatemethod;

public class ConcreteTransfer extends AbstractBank {

	@Override
	protected void transact() {
		System.out.println("transfer");
	}

}
