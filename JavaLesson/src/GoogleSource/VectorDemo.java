package GoogleSource;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		double a = 9;
		System.out.println((int)a);	//Integer ��Double �Ȳ���ת��
	
//		Vector v = new Vector(6);
//		Vector v = new Vector(4, 2);
		Vector v = new Vector();
		v.add(new Integer(1));
		v.addElement(new Double(6.6));
		
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		
//		System.out.println((int/*Integer*/)v.firstElement());
//		System.out.println((Double/*double*/)v.lastElement());//ֻ��ת��Ϊ��Ӧ������(double)~(double)
		
		v.add(10);
		
		Enumeration num = v.elements();//ת��Ϊö������
		
		while (num.hasMoreElements()) {
			Object obj = (Object) num.nextElement();
			System.out.println(obj);
		}
		
		for (int i = 0; i < v.size(); i++) {//�������
			System.out.println(v.get(i));
		}
		
		ListIterator test = v.listIterator();//ת��Ϊ�������
		while (test.hasNext()) {
			Object obj1 = (Object) test.next();
			System.out.println(obj1);
		}
		
//		Spliterator spliterator = v.spliterator();
		
//		Collections.sort(v);
//		System.out.println(v.toString());
	}
}
