package com.luulsj.www.simplefactory;
/**
 * �����ƻ����
 * @author nicolos
 *
 */
public class Apple implements IFruit {

	@Override
	public void grow() {
		System.out.println("apple.grow() invoked");
	}

	@Override
	public void harvest() {
		System.out.println("apple.harvest() invoked");
	}
	
	/**
	 * ƻ���Ǻ�ɫ��
	 * @return �Ǻ�ɫ��
	 */
	public boolean isRed(){
		System.out.println("apple is not red!");
		return true;
	}
}
