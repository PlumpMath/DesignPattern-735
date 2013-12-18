package com.luulsj.www.factorymethod;
/**
 * 具体工厂角色1 2013年12月18日11:52:09
 * @author Astah
 *
 */
public class Creator1 implements ICreator {

	@Override
	public IProduct facotry() {
		return new Product1();
		
	}

}
