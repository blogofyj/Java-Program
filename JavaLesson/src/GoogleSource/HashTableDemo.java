package GoogleSource;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * HashTable is the part of primary java.util,
 * and it's the application of Dictionary,
 * just like as HashMap;
 * so just put you heart on the HashMap 
 * @author 
 *
 */
public class HashTableDemo {

	public static void main(String[] args) {
		
		
		Hashtable demo = new Hashtable();
		
		Enumeration names;//enum class
		
		
		demo.put("Tom", new Double(23.21));
		demo.put("Lily", new Double(19.2));
		demo.put("Kairi", new Double(45.51));
		
		//show all demo in hashtable
		names = demo.keys();
		
		while(names.hasMoreElements()) {
			
			String str = (String) names.nextElement();
			
			System.out.println(str + ": " + demo.get(str));
		}
		System.out.println();
		
		double d = ((Double)demo.get("Tom")).doubleValue();//double - Double
//		double dd = (double)demo.get("Tom");
//		System.out.println("doubleֵ: "+ dd);
//		int a = Integer.parseInt("3");
//		Integer aa = Integer.valueOf(19);
//		Double b = 19.2;
//		b.doubleValue();
	}
	
}
