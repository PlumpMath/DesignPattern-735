package com.luulsj.www.observer;
/**
 * 被观察者接口
 * @author nicolos
 *00:12 2013-12-04
 */
public interface ISubject {
	/**
	 * 通知观察者
	 */
	public void notifyObserver();
	/**
	 * 观察者登记注册才有资格观察
	 * @param observer 观察者
	 */
	public void addObserver(IObserver observer);
	
	/**
	 * 观察者取消注册
	 * @param observer
	 */
	public void deleteObserver(IObserver observer);
}
