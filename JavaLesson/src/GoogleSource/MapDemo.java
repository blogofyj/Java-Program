package GoogleSource;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(18, "Tom");
		map.put(20, "Hemin");
		
		//first traverse
		for (Integer key : map.keySet()) {
			int result = key.intValue(); //int - Integer
			System.out.println("Key: " + result + " Value: " + map.get(result));
		}
		
		//second traverse
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<Integer, String> entry = it.next();
			
			System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
		}
		
		//third traverse
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
		}
		
		//fourth traverse
		for (String v : map.values()) {
			System.out.println("Value: " + v);//½ö±éÀúvalue
		}
	}
}
