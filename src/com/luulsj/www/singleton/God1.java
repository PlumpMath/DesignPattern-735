package com.luulsj.www.singleton;
/**
 * Godֻ����һ������������������ģʽ������
 * @author nicolos
 *
 */
public class God1 {
	private  final static God1 god = new God1();
	
	public static God1 getInstance(){
		return god;
	}
}
