package com.luulsj.www.designpattern.factory;
/**
 * 生产不同产品的工厂
 * 2014年11月11日15:05:17
 * @author liyanan
 *
 */
public class Creator {
	public static IProduct getInstance(int kind){
		if(1 == kind){
			return new ConcreteProduct1();
		}else{
			return new ConcreteProduct2();
		}
	}
}
