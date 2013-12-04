package com.luulsj.www.singleton;
/**
 * 此种方式是只有调用getInstance方法的时候才会在内存中新建一个单例
 * @author nicolos
 *
 */
public class God2 {

	private static God2 god2;
	
	private God2(){
	}
	
	public static God2 getInstance(){
		if(god2 == null){
			god2 = new God2();
		}
		return god2;
	}
}
