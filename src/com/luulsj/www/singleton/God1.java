package com.luulsj.www.singleton;
/**
 * God只会有一个，所以用来做单例模式的例子
 * @author nicolos
 *
 */
public class God1 {
	private  final static God1 god = new God1();
	
	public static God1 getInstance(){
		return god;
	}
}
