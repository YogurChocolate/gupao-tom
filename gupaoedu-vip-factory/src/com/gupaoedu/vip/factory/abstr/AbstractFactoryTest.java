package com.gupaoedu.vip.factory.abstr;

/**
 * �ص㣺
 * 1�����ظ��ӵ��߼��������̣�ֻ����ִ�н��
 * ���ࣺ
 * �򵥹���ģʽ����������ģʽ�����󹤳�ģʽ
 * @author Administrator
 *
 */
public class AbstractFactoryTest {
	
	// ���󹤳�ģʽ
	// 1�������ߵ��ü򵥣�
	// 2�������߸��Խ�����ڸ���ά����չ��
	public static void main(String[] args) {
		
		// @���Ż�������ʱʹ�ó�����AbstractFactory
		AbstractFactory factory = new DefaultFactory();
//		DefaultFactory factory = new DefaultFactory();
		// �޲�ʱ������Ĭ�Ϲ�������޲η���
		System.out.println(factory.getCar());
		// �в�ʱ�����ó������е��вη���
		System.out.println(factory.getCar("Benz"));
		
		//���ģʽ�ľ���֮���������ڣ�����˱�д������˺͵��ô������˫����ʹ��
		//������ǵ�˫��
		
	}
}