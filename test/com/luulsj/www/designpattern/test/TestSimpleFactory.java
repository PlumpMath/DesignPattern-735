package com.luulsj.www.designpattern.test;


import org.junit.Assert;
import org.junit.Test;

import com.luulsj.www.designpattern.factory.ConcreteProduct1;
import com.luulsj.www.designpattern.factory.ConcreteProduct2;
import com.luulsj.www.designpattern.factory.Creator;
import com.luulsj.www.designpattern.factory.IProduct;

/**
 * 简单工厂模式测试类
 * 2014年11月11日15:12:18
 * @author liyanan
 *
 */
public class TestSimpleFactory {
	
	@Test
	public void testSimpleFactory(){
		IProduct cp1 = Creator.getInstance(1);
		IProduct cp2 = Creator.getInstance(2);
		Assert.assertTrue(cp1 instanceof  ConcreteProduct1);
		Assert.assertTrue(cp2 instanceof ConcreteProduct2);
		cp1.sayHello();
		cp2.sayHello();
	}
}
