package com.luulsj.www.designpattern.factorymethod;
/**
 * 橘子园
 * 2014年11月12日16:10:41
 * @author liyanan
 *
 */
public class OrangeGarden implements IGarden {

	@Override
	public IFruit product() {
		return new Orange();
	}

}
