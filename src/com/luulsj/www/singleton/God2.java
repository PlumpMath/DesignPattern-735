package com.luulsj.www.singleton;
/**
 * ���ַ�ʽ��ֻ�е���getInstance������ʱ��Ż����ڴ����½�һ������
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
