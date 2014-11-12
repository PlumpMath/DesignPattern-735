package com.luulsj.www.designpattern.test;

import org.junit.Assert;
import org.junit.Test;

import com.luulsj.www.designpattern.factorymethod.Apple;
import com.luulsj.www.designpattern.factorymethod.AppleGarden;
import com.luulsj.www.designpattern.factorymethod.IFruit;
import com.luulsj.www.designpattern.factorymethod.IGarden;
import com.luulsj.www.designpattern.factorymethod.Orange;
import com.luulsj.www.designpattern.factorymethod.OrangeGarden;

/**
 * 工厂方法模式测试类
 * 2014年11月12日16:13:00
 * @author liyanan
 *
 */
public class TestFactoryMethod {

	@Test
	public void testFactoryMethod(){
		IGarden appleGarden = new AppleGarden();
		IGarden orangeGarden = new OrangeGarden();
		IFruit apple = appleGarden.product();
		IFruit orange = orangeGarden.product();
		Assert.assertTrue(apple instanceof Apple);
		Assert.assertTrue(orange instanceof Orange);
		apple.introductSelf();
		orange.introductSelf();
	}
}
