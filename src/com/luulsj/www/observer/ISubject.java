package com.luulsj.www.observer;
/**
 * ���۲��߽ӿ�
 * @author nicolos
 *00:12 2013-12-04
 */
public interface ISubject {
	/**
	 * ֪ͨ�۲���
	 */
	public void notifyObserver();
	/**
	 * �۲��ߵǼ�ע������ʸ�۲�
	 * @param observer �۲���
	 */
	public void addObserver(IObserver observer);
	
	/**
	 * �۲���ȡ��ע��
	 * @param observer
	 */
	public void deleteObserver(IObserver observer);
}
