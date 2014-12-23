package com.luulsj.www.designpattern.test;

import org.junit.Test;

import com.luulsj.www.designpattern.templatemethod.ConcreteDeposit;
import com.luulsj.www.designpattern.templatemethod.ConcreteTransfer;
import com.luulsj.www.designpattern.templatemethod.ConcreteWithdraw;

public class TestTemplateMethod {

	@Test
	public void testTemplateMethod(){
		ConcreteWithdraw withdraw = new ConcreteWithdraw();
		ConcreteDeposit deposit = new ConcreteDeposit();
		ConcreteTransfer transfer = new ConcreteTransfer();
		
		withdraw.templateMethodProcess();
		deposit.templateMethodProcess();
		transfer.templateMethodProcess();
	}
}
