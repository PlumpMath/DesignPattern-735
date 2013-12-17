package com.luulsj.www.simplefactory;
/**
 * ������������ˮ���ļ򵥹���
 * @author nicolos
 *
 */
public class SimpleFactory {
	
	/**
	 * ����ˮ��
	 * @param kind ˮ������
	 * @return kind�����ˮ��
	 */
	public static IFruit produce(String kind){
		if("apple".equals(kind)){
			return new Apple();
		}else if("strawberry".equals(kind)){
			return new Strawberry();
		}else if("grape".equals(kind)){
			return new Grape();
		}
		return null;
	}
}
