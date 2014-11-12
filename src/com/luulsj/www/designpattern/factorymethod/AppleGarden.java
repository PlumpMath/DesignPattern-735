package com.luulsj.www.designpattern.factorymethod;
/**
 * 苹果都引入了，肯定需要一个苹果果园需要登录
 * 相当于具体工厂角色
 * 2014年11月12日16:07:33
 * @author liyanan
 *
 */
public class AppleGarden implements IGarden {

	@Override
	public IFruit product() {
		return new Apple();
	}

}
