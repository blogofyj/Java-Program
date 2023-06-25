package Prophet_kin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		Collections.addAll(list, "a", "b", "c", "d");
		
		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
	}
	
	//public static <T> void sort(List<T> list)
	public static void show01(List<Person01> list) {
//		Collections.sort(list);
		
		Collections.sort(list, new Comparator<Person01>() {

			@Override
			public int compare(Person01 o1, Person01 o2) {
				int result = o1.getAge() - o2.getAge();//升序
				//return o2.getAge() - o1.getAge(); 降序
				
				//如果年龄相同，按姓名第一个字母比较
				if(result == 0) {
					result = o1.getName().charAt(0) - o2.getName().charAt(0);
				}
				return result;
			}
		});
		
		ArrayList<Person01> list01 = new ArrayList<Person01>() {
			{
				add(new Person01("Tom", 20));
				add(new Person01("Ruby", 21));
			}
		};
	}
}

class Person01{
	private String name;
	private int age;
	
	public Person01(){
		
	}
	public Person01(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person01 [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private int compareTo(Person01 o) {
		return this.getAge() - o.getAge();//按升序
	}
	
}