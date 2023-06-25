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
 * List--> Stream ：list.stream();
 * Stream--> List : list.collect(Collectors.toList());
 * @author asus
 *
 *
 *    注释：  Accumulate names into a List
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
		//stream中的concat方法，合并两个流
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
		
		//进一步简化
		nums.forEach(num -> System.out.println(num));
	}
	
	public static void show02() {
		Stream<String> stream = Stream.of("李四", "张三", "小明");
		
		//Represents a predicate (boolean-valued function) of one argument. 
		//This is a functional interfacewhose functional method is test(Object).
		//Stream.filter(Predicate<? super String> predicate)

		stream.filter((String name) -> {return name.startsWith("李");});
		
		
		//Stream.forEach(Consumer<? super String> action)
		//This is a functional interfacewhose functional method is accept(Object).
		stream.forEach(name -> System.out.println(name));
	}
	
	/*
	 * Stream流属于管道流，只能被使用一次
	 * 第一个Stream流调用完毕，数据就会转到下一个stream上
	 * 这时第一个流已经关闭，不能再调用方法
	 */
	
	
	/*
	 * 将一个流映射到另一个流需要使用map方法
	 */
	public static void show03() {
		 //获取一个Stream 流
		Stream<String> stream = Stream.of("1", "2", "3", "4");
		//使用map方法,把字符串类型的整数转换为Integer类型的整数
		
		/*
		 * Stream.map(Function<? super String, ? extends Integer> mapper)
		 * This is a functional interfacewhose functional method is apply(Object).
		 */
		Stream<Integer> stream02 = stream.map((String s) -> {
			return Integer.parseInt(s);
		});
		
		//遍历
		stream02.forEach(i -> System.out.println(i));
	}
	
	/*
	 * 流中的count方法，获取个数
	 */
	public static void show04() {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		Collections.addAll(arrayList, 1, 2, 3, 4, 5);
		
		Stream<Integer> stream = arrayList.stream();
		
		long count = stream.count();
		System.out.println(count);
	}
	
	/*
	 * limit可以对流进行截取，只取用前n个
	 * 它是一个延迟方法，只对流中的元素进行截取，返回一个新的流，所以可以继续使用Stream流中的其他方法
	 */
	public static void show05() {
		String[] arr = {
				"地球",
				"太阳系",
				"银河系",
				"宇宙"
		};
		
		//java.util.stream.Stream.of(String... values)
		Stream<String> stream = Stream.of(arr);
		
		Stream<String> stream2 = stream.limit(3);
		
		stream2.forEach(name -> System.out.println(name));
	}
	
	/*
	 * Stream，跳过前几个元素
	 */
	public static void show06() {
		
		Stream<String> stream = Stream.of("地球","太阳系","银河系","宇宙");
		
		Stream<String> skip = stream.skip(3);
		
		skip.forEach(name -> System.out.println(name));
		
		//Stream--> List的转化
//		ArrayList<String> arrayList = new ArrayList<>();
//		Object[] array = stream.toArray();
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] instanceof String) {
//				String num = (String) array[i];
//				arrayList.add(num);
//			}
//		}
//		arrayList.forEach(name -> System.out.println(name));
		
		//直接利用Stream的collect方法
		List<String> list = stream.collect(Collectors.toList());
		
		list.forEach(System.out :: println);
		
		//再实现一个过滤方法
		List<String> list02 = stream.filter(name -> name.startsWith("地")).collect(Collectors.toList());
	
		list02.forEach(name -> System.out.println(name));
		
	}
}
