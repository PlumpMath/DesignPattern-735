package com.luulsj.www.designpattern.factorymethod;

/**
 * 引入苹果这一具体的水果
 * 相当于具体产品角色
 * 2014年11月12日16:05:22
 * @author liyanan
 *
 */
public class Apple implements IFruit {

	@Override
	public void introductSelf() {
		System.out.println("hello, i'm apple!");
	}

}
