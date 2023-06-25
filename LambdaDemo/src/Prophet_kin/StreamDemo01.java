package Prophet_kin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

/**
 * java.util.stream.Stream<T>是java常用的接口流
 * 获取流的方法：
 * 1.所有的Collection集合都可以通过stream默认方法获取
 * 2.Stream接口静态方法of 可以获取数组对应的流
 * 		static <T> Stream<T> of (T... values);
 * @author asus
 *
 */

public class StreamDemo01 {

	public static void main(String[] args) {
		//把集合转化为Stream流
		ArrayList<String> list = new ArrayList<String>();
		Stream<String> stream01 = list.stream();
		
		Set<String> set = new HashSet<String>();
		Stream<String> stream02 = set.stream();
		
		Map<String,String> map = new HashMap<>();
		//获取键，存取到一个set集合中
		Set<String> keySet = map.keySet();
		Stream<String> stream03 = keySet.stream();
		
		//获取值。存储到Collection集合中
		Collection<String> values = map.values();
		Stream<String> stream04 = values.stream();
		
		//获取键值对（键于值 的对应关系，entrySet
		Set<Entry<String,String>> entrySet = map.entrySet();
		Stream<Entry<String, String>> stream05 = entrySet.stream();
		
		//把数组转化为Stream 流
		Stream<Integer> stream = Stream.of(1, 2, 3, 4);
		
		Integer[] nums = {1, 2, 3, 4};
		Stream<Integer> stream06 = Stream.of(nums);
	}
}

class Student{
	private String name;
	private int age;
	
	/*
	 * Map, List等集合中很多时候需要重写equals 和 hashcode 方法
	 * 因为它默认的是String，Integer等一些常用的方法，jdk中已经编好了
	 * 但如果Map的key 对象为自己定义的类的时候，就要改写方法
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student stu = (Student) obj;
			boolean nameEquals = false;
			
			if(this.name == null && stu.name == null) {
				nameEquals = true;
			}
			if(this.name != null) {
				nameEquals = this.name.equals(stu.name);
			}
			return nameEquals && this.age == stu.age;
		}
		return false;
	}
	
	//如果字段太多的话就变得很复杂，用Object的equals方法简化
	public boolean equals01(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student) obj;
			return Objects.equals(this.name, stu.name) && this.age == stu.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int h = 0;
		h = 31 * h + name.hashCode();
		h = 31 * h + age;
		return h;
	}
	
	//Objects方法
	public int hashCode01() {
		return Objects.hash(name, age);
	}
}
