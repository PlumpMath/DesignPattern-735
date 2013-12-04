package com.luulsj.www.observer;

public class ObserverImpl1 implements IObserver {

	@Override
	public void watch(String source) {
		System.out.println("ObserverImpl1:" + source);
	}

}
