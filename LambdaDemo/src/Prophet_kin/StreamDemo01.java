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
 * java.util.stream.Stream<T>��java���õĽӿ���
 * ��ȡ���ķ�����
 * 1.���е�Collection���϶�����ͨ��streamĬ�Ϸ�����ȡ
 * 2.Stream�ӿھ�̬����of ���Ի�ȡ�����Ӧ����
 * 		static <T> Stream<T> of (T... values);
 * @author asus
 *
 */

public class StreamDemo01 {

	public static void main(String[] args) {
		//�Ѽ���ת��ΪStream��
		ArrayList<String> list = new ArrayList<String>();
		Stream<String> stream01 = list.stream();
		
		Set<String> set = new HashSet<String>();
		Stream<String> stream02 = set.stream();
		
		Map<String,String> map = new HashMap<>();
		//��ȡ������ȡ��һ��set������
		Set<String> keySet = map.keySet();
		Stream<String> stream03 = keySet.stream();
		
		//��ȡֵ���洢��Collection������
		Collection<String> values = map.values();
		Stream<String> stream04 = values.stream();
		
		//��ȡ��ֵ�ԣ�����ֵ �Ķ�Ӧ��ϵ��entrySet
		Set<Entry<String,String>> entrySet = map.entrySet();
		Stream<Entry<String, String>> stream05 = entrySet.stream();
		
		//������ת��ΪStream ��
		Stream<Integer> stream = Stream.of(1, 2, 3, 4);
		
		Integer[] nums = {1, 2, 3, 4};
		Stream<Integer> stream06 = Stream.of(nums);
	}
}

class Student{
	private String name;
	private int age;
	
	/*
	 * Map, List�ȼ����кܶ�ʱ����Ҫ��дequals �� hashcode ����
	 * ��Ϊ��Ĭ�ϵ���String��Integer��һЩ���õķ�����jdk���Ѿ������
	 * �����Map��key ����Ϊ�Լ���������ʱ�򣬾�Ҫ��д����
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
	
	//����ֶ�̫��Ļ��ͱ�úܸ��ӣ���Object��equals������
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
	
	//Objects����
	public int hashCode01() {
		return Objects.hash(name, age);
	}
}
