package com.luulsj.www.factorymethod;
/**
 * ���幤����ɫ2 2013��12��18��11:52:24
 * @author Astah
 *
 */
public class Creator2 implements ICreator {

	@Override
	public IProduct facotry() {
		return new Product2();
	}

}
