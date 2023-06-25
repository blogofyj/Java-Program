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
		System.out.println((int)a);	//Integer 与Double 等不能转换
	
//		Vector v = new Vector(6);
//		Vector v = new Vector(4, 2);
		Vector v = new Vector();
		v.add(new Integer(1));
		v.addElement(new Double(6.6));
		
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		
//		System.out.println((int/*Integer*/)v.firstElement());
//		System.out.println((Double/*double*/)v.lastElement());//只能转化为对应的类型(double)~(double)
		
		v.add(10);
		
		Enumeration num = v.elements();//转化为枚举类型
		
		while (num.hasMoreElements()) {
			Object obj = (Object) num.nextElement();
			System.out.println(obj);
		}
		
		for (int i = 0; i < v.size(); i++) {//正常输出
			System.out.println(v.get(i));
		}
		
		ListIterator test = v.listIterator();//转化为迭代输出
		while (test.hasNext()) {
			Object obj1 = (Object) test.next();
			System.out.println(obj1);
		}
		
//		Spliterator spliterator = v.spliterator();
		
//		Collections.sort(v);
//		System.out.println(v.toString());
	}
}
