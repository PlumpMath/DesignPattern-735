package com.luulsj.www.designpattern.templatemethod;
/**
 * 抽象类
 * @author liyanan
 * @date 2014年12月23日16:49:16
 */
abstract class AbstractBank {
	private int number;
	
	public final void templateMethodProcess(){
		takeNumber();
		transact();
		if(isEvaluateHook()){
			evaluateHook();
		}
	}
	
	/**
	 * 基本方法  具体方法
	 * 取号
	 */
	private void takeNumber(){
		this.number++;
	}
	
	/**
	 * 基本方法 抽象方法
	 * 交易
	 */
	protected abstract void transact();
	
	/**
	 * 基本方法 钩子方法
	 */
	protected void evaluateHook(){
		System.out.println("evaluateHook");
	}
	
	/**
	 * 基本方法 钩子方法
	 * @return
	 */
	protected boolean isEvaluateHook(){
		return true;
	}
}
