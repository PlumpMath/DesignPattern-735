package com.luulsj.www.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubjectImpl1 implements ISubject {
	//存放注册到此对象的观察者的集合
	Set<IObserver> collectionObserver = new HashSet<IObserver>();

	@Override
	public void notifyObserver() {
		for(IObserver observer : collectionObserver){
			observer.watch("subjectImpl1");
		}
	}

	@Override
	public void addObserver(IObserver observer) {
		collectionObserver.add(observer);
	}

	@Override
	public void deleteObserver(IObserver observer) {
		collectionObserver.remove(observer);
	}

}
