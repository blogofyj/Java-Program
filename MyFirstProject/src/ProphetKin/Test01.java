package ProphetKin;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
//		Stream<Integer> stream = Stream.of(1,2,3,4,5);
//		stream.forEach(System.out :: print);
//		stream.close();
//		
//		Stream<Integer> stream2 = Stream.iterate(0, x -> x + 2).limit(4);
//		stream2.forEach(System.out :: print);
		
//		Stream<Double> stream3 = Stream.generate(Math :: random).limit(2);
//		stream3.forEach(System.out:: print);
		
		

		Stream<Integer> stream = Stream.of(3,14,6,7,21,45,1,4,8);
		Stream<Integer> newStream = stream.filter(s -> s >10)
				.distinct()
				.skip(1)
				.limit(2);
		newStream.forEach(System.out:: println);
		
		List<String> list = Arrays.asList("a,b,c", "1,2,3");
		Stream<String> stream2 = list.stream().map(s -> s.replaceAll(",", ""));
		stream2.forEach(System.out::println);
		
		Stream<String> stream3 = list.stream().flatMap(s -> {
			String[] split = s.split(",");
			Stream<String> s2 = Arrays.stream(split);
			return s2;
		});
		stream3.forEach(System.out::println);
		
		test01();
	}
	
	public static void test01() {
		Student s1 = new Student("aa", 10);
		System.out.println(s1);//重写了String方法
		Student s2 = new Student("bb", 20);
		
		List<Student> asList = Arrays.asList(s1, s2);
		
		asList.stream().sorted((o1, o2) -> {
			
			if(o1.getName().equals(o2.getName())) {
				return o1.getAge() - o2.getAge();
			}else {
				return o1.getName().compareTo(o2.getName());
			}
			
		}).forEach(System.out::println);
	}
}

class Student{
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student[" + name + " " + age +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}else if(obj instanceof Student) {
			Student stu = (Student) obj;
			return getAge() == stu.getAge() &&
					Objects.equals(getName(), stu.getName());
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getAge(), getName());
	}
}
