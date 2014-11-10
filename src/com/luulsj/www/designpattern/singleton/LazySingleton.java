package com.luulsj.www.designpattern.singleton;
/**
 * 懒汉式
 * 2014年11月10日13:25:46
 * @author liyanan
 *
 */
public class LazySingleton {
	private static LazySingleton singleton = null;
	
	private LazySingleton(){
	}
	
	public synchronized static LazySingleton getInstance(){
			if (singleton == null) {
				singleton = new LazySingleton();
			}
			return singleton;
	}
}
