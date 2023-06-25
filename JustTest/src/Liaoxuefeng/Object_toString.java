package Liaoxuefeng;

import java.awt.List;
import java.util.Iterator;
import java.util.Scanner;

public class Object_toString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> people = new HashMap<>(){
			{
				put("tom", 19);
				put("lily", 18);
			}
		};
		
		Iterator<Integer> it = people.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = people.get(key);
			System.out.println(key + "," + value);
		}
	}

	public static String toString(Object[] a){
		if(a == null)
			return "null";
		int iMax = a.length;
		if(iMax == -1)
			return "[]";
		
		StringBuilder b = new StringBuilder();
		b.append('[');
		
		for (int i = 0; ; i++) {
			b.append(String.valueOf(a[i]));
			if(i == iMax)
				return b.append(']').toString();
			b.append(", ");
			
		}
	}
}
