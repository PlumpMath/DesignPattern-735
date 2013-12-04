package com.luulsj.www.observer.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.luulsj.www.observer.IObserver;
import com.luulsj.www.observer.ISubject;
import com.luulsj.www.observer.ObserverImpl;
import com.luulsj.www.observer.ObserverImpl1;
import com.luulsj.www.observer.SubjectImpl1;

public class ObserverTest {

	@Test
	public void test() {
		ISubject subject = new SubjectImpl1();
		IObserver observer1 = new ObserverImpl();
		IObserver observer2 = new ObserverImpl1();
		//注册
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		//被观察者发生了变化，通知观察者
		subject.notifyObserver();
	}

}
