package Prophet_kin;

import java.util.ArrayList;

/**
 * lambda���ʽ���ǿ��Ƶ�������ʡ��
 * ���Ǹ����������Ƶ����������ݣ�������ʡ����д
 * ����ʡ�Ե����ݣ�
 * 		1.�������б� �� �����в����б���������ͣ�����ʡ�Բ�д
 * 		2.�������б� �� �����еĲ������ֻ��һ���� ��ô���ͺͣ���������ʡ��
 * 		3.{һЩ����} �� ���{}�еĴ���ֻ��һ�У� �����Ƿ��з���ֵ��������ʡ�ԣ� {}�� return�� �ֺţ�
 * 					ע�⣺Ҫʡ��{}��return���ֺű���һ��ʡ��
 * @author asus
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		//{},return,�ֺ� ��ʡ����
		new Thread(() -> System.out.println(Thread.currentThread().getName() + " start Running")).start();
	
		/**
		 * 1.ʹ��lambda������нӿڣ���Ҫ��ӿ��н���һ�����󷽷�
		 * 2.ʹ��lambda������С��������ƶϡ�
		 * 		Ҳ���Ƿ����Ĳ�����ֲ��������ͱ���Ϊlambda��Ӧ�Ľӿ����ͣ�����ʹ��lambda ��Ϊ�ýӿڵ�ʵ��
		 * 
		 * ���ҽ���һ�����󷽷��Ľӿڣ���Ϊ ����ʽ�ӿ�
		 */
	}
}
