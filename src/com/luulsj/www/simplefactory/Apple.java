package com.luulsj.www.simplefactory;
/**
 * 具体的苹果类
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
	 * 苹果是红色的
	 * @return 是红色的
	 */
	public boolean isRed(){
		System.out.println("apple is not red!");
		return true;
	}
}
