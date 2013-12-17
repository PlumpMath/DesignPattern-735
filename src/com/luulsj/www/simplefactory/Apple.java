package com.luulsj.www.simplefactory;
/**
 * 具体的苹果类
 * @author Astah
 *
 */
public class Apple implements IFruit {

	//苹果树的年龄
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
	 * 苹果是红色的
	 * @return 是红色的
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
