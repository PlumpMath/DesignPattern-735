package com.luulsj.www.observer;

public class ObserverImpl implements IObserver {

	@Override
	public void watch(String source) {
		System.out.println("ObserverImpl:" + source);
	}

}
