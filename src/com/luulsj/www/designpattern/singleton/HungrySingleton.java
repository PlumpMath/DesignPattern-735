package com.luulsj.www.designpattern.singleton;
/**
 * 饿汉式单例模式
 * 2014年11月10日14:05:35
 * @author liyanan
 *
 */
public class HungrySingleton {
	private static final HungrySingleton singleton = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return singleton;
	}
}
