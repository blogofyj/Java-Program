package Prophet_kin;

import java.util.Arrays;
import java.util.Objects;

public class Demo03 {

	public static void main(String[] args) {
		
		Person[] arr = {
				new Person("Tom", 19),
				new Person("Hortons", 20),
				new Person("Kairi", 23)
		};
		
		//对数组中的Person对象使用arrays的sort方法通过年龄进行升序 排序
//		Arrays.sort(arr, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//
////				if((o1.getName() == null) || (o2.getName() == null)) {
////					return 0;
////				}else {
////					return o1.getName().charAt(0) - o2.getName().charAt(0);
////					
////				}
//				if(o1.getName().equals(o2.getName())) {
//					return o1.getAge() - o2.getAge();
//				}else {
//					return o1.getName().compareTo(o2.getName());
//				}
////				return o1.getAge() - o2.getAge();
//				return 0;
//			}
//			
//		});
		
		//使用lambda表达式，简化匿名内部类
		Arrays.sort(arr, (Person o1, Person o2) -> {return o1.getAge() - o2.getAge();});
		
		
		for (Person p : arr) {
			System.out.println(p);
		}
	}
}

class Person{
	
	private String name;
	private int age;
	
	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}