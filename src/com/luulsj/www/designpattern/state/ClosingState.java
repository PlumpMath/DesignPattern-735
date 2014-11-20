package com.luulsj.www.designpattern.state;

/**
 * 定义，电梯门关闭以后，电梯可以做哪些事
 * 2014年11月20日12:20:53
 * @author liyanan
 *
 */
public class ClosingState extends AbstractLift {
	
	@Override
	public void close(){
		System.out.println("电梯正处于关闭状态！");
	}

	@Override
	public void open() {
		this.setContext(context);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
	
	
}
