package com.luulsj.www.simplefactory;
/**
 * 用来生产各种水果的简单工厂
 * @author nicolos
 *
 */
public class SimpleFactory {
	
	/**
	 * 生产水果
	 * @param kind 水果种类
	 * @return kind种类的水果
	 */
	public IFruit produce(String kind){
		if("apple".equals(kind)){
			return new Apple();
		}else if("strawberry".equals(kind)){
			return new Strawberry();
		}
		return null;
	}
}
