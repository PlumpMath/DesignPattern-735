package com.luulsj.www.designpattern.state;
/**
 * 电梯的实现类
 * 2014年11月20日11:38:19
 * @author liyanan
 *
 */
public class Lift extends AbstractLift{

	//状态
	private static  int state;
	
	@Override
	public void setState(int state) {
		Lift.state = state;
	}

	@Override
	public void open() {
		//电梯在什么状态才能开启
		switch(state){
		case STATE_CLOSE://如果电梯关闭，则可以开门
			this.setState(STATE_OPEN);
			break;
		case STATE_OPEN://如果电梯开启，则什么也不做
			break;
		case STATE_RUN://如果电梯开启，则什么也不做
			break;
		case STATE_STOP://如果电梯停止，则可以开门
			this.setState(STATE_OPEN);
		}
		
			
	}

	@Override
	public void close() {
		//电梯在什么状态才能关闭
		switch(state){
		case STATE_CLOSE://如果电梯关闭，则什么也不做
			break;
		case STATE_OPEN://如果电梯开启，则关门
			this.setState(STATE_CLOSE);
			break;
		case STATE_RUN://如果电梯运行，则什么也不做
			break;
		case STATE_STOP://如果电梯停止，则什么也不做
			break;
		}
	}

	@Override
	public void run() {
		//电梯在什么状态才能启动
		switch(state){
		case STATE_CLOSE://如果电梯关闭，则启动
			this.setState(STATE_RUN);
			break;
		case STATE_OPEN://如果电梯开启，则什么也不做
			break;
		case STATE_RUN://如果电梯运行，则什么也不做
			break;
		case STATE_STOP://如果电梯停止，则启动
			this.setState(STATE_RUN);
			break;
		}
	}

	@Override
	public void stop() {
		//电梯在什么状态才能停止
		switch(state){
		case STATE_CLOSE://如果电梯关闭，则什么也不做
			break;
		case STATE_OPEN://如果电梯开启，则什么也不做
			break;
		case STATE_RUN://如果电梯运行，则停止
			this.setState(STATE_STOP);
			break;
		case STATE_STOP://如果电梯停止，则什么也不做
			break;
		}
		
	}
	
	
}
