package com.luulsj.www.designpattern.state;
/**
 * 
 * @author liyanan
 *
 */
public abstract class AbstractLift {
	
	public Context context;
	
	public static final int STATE_OPEN = 1;		//开门状态
	public static final int STATE_CLOSE = 2;	//关门状态
	public static final int STATE_RUN = 3;		//运行状态
	public static final int STATE_STOP = 4;		//停止状态

	//设置环境
	public void setContext(Context context){
		this.context = context;
	}
	public void setState(int state){};			//设置电梯的状态
	public void open(){};							//开启动作
	public void close(){};							//关闭动作
	public void run(){};								//运行动作
	public void stop(){};								//停止动作
	
}
