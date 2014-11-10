package com.luulsj.www.designpattern.test;


import org.junit.Assert;
import org.junit.Test;

import com.luulsj.www.designpattern.singleton.HungrySingleton;
import com.luulsj.www.designpattern.singleton.LazySingleton;

/**
 * 2014年11月10日13:48:21
 * 单例模式测试类
 * @author liyanan
 *
 */
public class TestSingleton {

	//懒汉式测试
	@Test
	public void testLazySingleton(){
		LazySingleton singleton1 = LazySingleton.getInstance();
		LazySingleton singleton2 = LazySingleton.getInstance();
		Assert.assertTrue(singleton1.equals(singleton2));
	}
	
	//饿汉式测试
	@Test
	public void testHungrySingleton(){
		HungrySingleton singleton1 = HungrySingleton.getInstance();
		HungrySingleton singleton2 = HungrySingleton.getInstance();
		Assert.assertTrue(singleton1.equals(singleton2));
	}
}
