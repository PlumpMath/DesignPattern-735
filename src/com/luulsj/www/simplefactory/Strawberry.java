package com.luulsj.www.simplefactory;

public class Strawberry implements IFruit {

	@Override
	public void grow() {
		System.out.println("strawberry.grow() invoked!");
	}

	@Override
	public void harvest() {
		System.out.println("strawberry.harvest() invoked!");
	}
	
	public void pick(){
		System.out.println("strawberry.pick() invoked!");
	}

}
