package com.luulsj.www.factorymethod;
/**
 * ���幤����ɫ1 2013��12��18��11:52:09
 * @author Astah
 *
 */
public class Creator1 implements ICreator {

	@Override
	public IProduct facotry() {
		return new Product1();
		
	}

}
