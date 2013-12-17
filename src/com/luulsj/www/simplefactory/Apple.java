package com.luulsj.www.simplefactory;
/**
 * �����ƻ����
 * @author Astah
 *
 */
public class Apple implements IFruit {

	//ƻ����������
	private int treeAge;
	
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

	@Override
	public void plant() {
		System.out.println("apple is planted!");
	}

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}
	
	
}
