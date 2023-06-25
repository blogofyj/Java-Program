package Prophet_kin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * List--> Stream ��list.stream();
 * Stream--> List : list.collect(Collectors.toList());
 * @author asus
 *
 *
 *    ע�ͣ�  Accumulate names into a List
     List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());

     // Accumulate names into a TreeSet
     Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));

     // Convert elements to strings and concatenate them, separated by commas
     String joined = things.stream()
                           .map(Object::toString)
                           .collect(Collectors.joining(", "));

     // Compute sum of salaries of employee
     int total = employees.stream()
                          .collect(Collectors.summingInt(Employee::getSalary)));

     // Group employees by department
     Map<Department, List<Employee>> byDept
         = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));

     // Compute sum of salaries by department
     Map<Department, Integer> totalByDept
         = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                                                   Collectors.summingInt(Employee::getSalary)));

     // Partition students into passing and failing
     Map<Boolean, List<Student>> passingFailing =
         students.stream()
                 .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
 */
public class StreamDemo02 {

	public static void main(String[] args) {
		show01();
		//stream�е�concat�������ϲ�������
		Stream<Integer> nums01 = Stream.of(1,2,3,4);
		Stream<Integer> nums02 = Stream.of(5,6,7,8);
		Stream<Integer> concat = Stream.concat(nums01, nums02);
		concat.forEach(name -> System.out.println(name));
		
	}
	
	public static void show01() {
		
		Stream<Integer> nums = Stream.of(1, 2, 3, 4);
		
//		nums.forEach((Integer num) -> {
//			System.out.println(num);
//		});
		
		//��һ����
		nums.forEach(num -> System.out.println(num));
	}
	
	public static void show02() {
		Stream<String> stream = Stream.of("����", "����", "С��");
		
		//Represents a predicate (boolean-valued function) of one argument. 
		//This is a functional interfacewhose functional method is test(Object).
		//Stream.filter(Predicate<? super String> predicate)

		stream.filter((String name) -> {return name.startsWith("��");});
		
		
		//Stream.forEach(Consumer<? super String> action)
		//This is a functional interfacewhose functional method is accept(Object).
		stream.forEach(name -> System.out.println(name));
	}
	
	/*
	 * Stream�����ڹܵ�����ֻ�ܱ�ʹ��һ��
	 * ��һ��Stream��������ϣ����ݾͻ�ת����һ��stream��
	 * ��ʱ��һ�����Ѿ��رգ������ٵ��÷���
	 */
	
	
	/*
	 * ��һ����ӳ�䵽��һ������Ҫʹ��map����
	 */
	public static void show03() {
		 //��ȡһ��Stream ��
		Stream<String> stream = Stream.of("1", "2", "3", "4");
		//ʹ��map����,���ַ������͵�����ת��ΪInteger���͵�����
		
		/*
		 * Stream.map(Function<? super String, ? extends Integer> mapper)
		 * This is a functional interfacewhose functional method is apply(Object).
		 */
		Stream<Integer> stream02 = stream.map((String s) -> {
			return Integer.parseInt(s);
		});
		
		//����
		stream02.forEach(i -> System.out.println(i));
	}
	
	/*
	 * ���е�count��������ȡ����
	 */
	public static void show04() {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		Collections.addAll(arrayList, 1, 2, 3, 4, 5);
		
		Stream<Integer> stream = arrayList.stream();
		
		long count = stream.count();
		System.out.println(count);
	}
	
	/*
	 * limit���Զ������н�ȡ��ֻȡ��ǰn��
	 * ����һ���ӳٷ�����ֻ�����е�Ԫ�ؽ��н�ȡ������һ���µ��������Կ��Լ���ʹ��Stream���е���������
	 */
	public static void show05() {
		String[] arr = {
				"����",
				"̫��ϵ",
				"����ϵ",
				"����"
		};
		
		//java.util.stream.Stream.of(String... values)
		Stream<String> stream = Stream.of(arr);
		
		Stream<String> stream2 = stream.limit(3);
		
		stream2.forEach(name -> System.out.println(name));
	}
	
	/*
	 * Stream������ǰ����Ԫ��
	 */
	public static void show06() {
		
		Stream<String> stream = Stream.of("����","̫��ϵ","����ϵ","����");
		
		Stream<String> skip = stream.skip(3);
		
		skip.forEach(name -> System.out.println(name));
		
		//Stream--> List��ת��
//		ArrayList<String> arrayList = new ArrayList<>();
//		Object[] array = stream.toArray();
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] instanceof String) {
//				String num = (String) array[i];
//				arrayList.add(num);
//			}
//		}
//		arrayList.forEach(name -> System.out.println(name));
		
		//ֱ������Stream��collect����
		List<String> list = stream.collect(Collectors.toList());
		
		list.forEach(System.out :: println);
		
		//��ʵ��һ�����˷���
		List<String> list02 = stream.filter(name -> name.startsWith("��")).collect(Collectors.toList());
	
		list02.forEach(name -> System.out.println(name));
		
	}
}
