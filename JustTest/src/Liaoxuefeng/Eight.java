package Liaoxuefeng;

import java.lang.reflect.Constructor;

public class Eight {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		Class s = Integer.class.getSuperclass();
//		Class i = Integer.class;
//		
//		System.out.println(i);
//		Class[] is = s.getInterfaces();
//		for(Class i : is){
//			System.out.println(i);
//		}
		Constructor cons1 = Integer.class.getConstructor(int.class);
		Integer n1 = (Integer) cons1.newInstance(123);
		System.out.println(n1);
		
		Constructor cons2 = Integer.class.getConstructor(String.class);
		Integer n2 = (Integer) cons2.newInstance("456");
		System.out.println(n2);
		
	}

}
