package Liaoxuefeng;

import java.util.HashMap;
import java.util.Map;

public class OverrideEquals_Map {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Integer num = Integer.valueOf(10);
//		System.out.println(num);
		Map<String, Integer> map = new HashMap();
		map.put("apple", 123);
		map.put("pear", 456);
		map.put("orange", 789);
		for(String key : map.keySet()){
			int value = map.get(key);
			System.out.println(key + "=" + value);
			
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.err.println(key + "=" + value);
		}
		
	}
	
//	public boolean equals(Object o){
//		if(o instanceof Person){
//			Person p = (Person) o;
//			retrun Objects.equals(this.name, p.name) && this.age == p.age;
//		}
//		return false;
//	}

}
class ArrayList{
	Object[] elementData;
	
	public boolean contains(Object o){
		for(int i = 0; i < elementData.length; i++){
			if(o.equals(elementData[i])){
				return true;
			}
		}
		return false;
	}
}
