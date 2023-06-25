package GoogleSource;

public class Demo04Array {

	public static void main(String[] args) {
		
		Person01[] array = new Person01[3];
		
		Person01 one = new Person01("Tom", 18);
		
		array[0] = one;
		
		System.out.println(array[0]);//Print address
		
		System.out.println(array[0].getName());
	}
}


class Person01{
	private String name;
	private int age;
	
	public Person01(String name, int age) {
		super();
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
	
	
}