//it's can sort arrays, and it's interface is sortedMap
//but it's action is TreeMap
package Liaoxuefeng;
import java.util.*;

public class TreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person, Integer> map = new TreeMap(new comparator<person>(){
			public int compare(Person p1, Person p2){
				return p1.name.compareTo(p2.name);
			}
		});
		map.put(new Person("Tom"), 12);
		map.put(new Person("merry"), 18);
		map.put(new Person("Kingla"), 16);
		for(Person key : map.keySet()){
			System.out.println(key);
		}
		System.out.println(map.get(new Person("Tom")));
	}

}
class Person{
	public String name;
	private int age;
	public Person(String name){
		this.name = name;
	}
	
	public String toString(){
		return "{Person:" + name + "}";
	}
}

