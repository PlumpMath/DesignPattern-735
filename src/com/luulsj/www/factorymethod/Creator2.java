package com.luulsj.www.factorymethod;
/**
 * 具体工厂角色2 2013年12月18日11:52:24
 * @author Astah
 *
 */
public class Creator2 implements ICreator {

	@Override
	public IProduct facotry() {
		return new Product2();
	}

}
