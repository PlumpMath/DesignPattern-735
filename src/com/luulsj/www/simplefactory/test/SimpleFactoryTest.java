package com.luulsj.www.simplefactory.test;

import org.junit.Test;

import com.luulsj.www.simplefactory.IFruit;
import com.luulsj.www.simplefactory.SimpleFactory;

public class SimpleFactoryTest {

	@Test
	public void test() {
		SimpleFactory sf = new SimpleFactory();
		IFruit apple = sf.produce("apple");
		apple.grow();
		apple.harvest();
		
		IFruit strawberry = sf.produce("strawberry");
		strawberry.grow();
		strawberry.harvest();
	}

}
