package GoogleSource;

import java.util.List;

public class OverrideEqualsDemo {
	
	private String name;
	private int age;
	
	public String getName(Person p) {
		return p.getName();
	}
	public int getAge(Person p) {
		return p.getAge();
	}

	public static void main(String[] args) {
		
//		List<String> list = List.of(
//				new Person(),
//				new Person()
//				);
		Person person1 = new Person("Tom", 18);
		Person person2 = new Person("Lily", 20);
		
		person1.equals(person2);
	}
	
	//equals原方法
//	 public boolean equals(Object obj) {
//		 return (this == obj);
//	 }
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Person) {		//向下转型,obj->Person
//			Person p = (Person)obj;
//			boolean b = this.name.equals(p.getName()) && this.age == p.getAge();
//			return b;
//		}
//		return false;
//	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
