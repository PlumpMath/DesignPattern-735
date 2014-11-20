package com.luulsj.www.designpattern.strategy;
/**
 * 具体环境
 * 2014年11月13日16:55:22
 * @author liyanan
 *
 */
public class Context {
	//有一个抽象策略类的引用
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void suanfa(){
		this.strategy.suanfa();
	}
	
	
}
