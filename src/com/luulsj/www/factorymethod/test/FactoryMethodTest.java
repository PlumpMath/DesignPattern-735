package com.luulsj.www.factorymethod.test;

import org.junit.Test;

import com.luulsj.www.factorymethod.Creator1;
import com.luulsj.www.factorymethod.Creator2;
import com.luulsj.www.factorymethod.ICreator;

public class FactoryMethodTest {

	@Test
	public void test() {
		ICreator creator1 = new Creator1();
		ICreator creator2 = new Creator2();
		creator1.facotry();
		creator2.facotry();
	}

}
