package GoogleSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.��ʼ�����������ࣩ
 * 2.�����ڲ���
 * @author asus
 *�ڲ�brace�൱�ڴ����
 */

public class TwoBraceDemo {
	
	public static void main(String[] args) {
		
		User user = new User() {
			{
				username = "xiaoming";
				setPassword("123456");
			}
		};
		System.out.println(user);
		
		
		//�����ӿ�ʵ����
		//�൱��ֱ��д��һ���ӿڵ�ʵ���ֻ࣬�������ڲ�����
		TestDemo demo = new TestDemo() {

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getAge() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		
		
		Map<String, String> map = new HashMap<String, String>(){//�����ڲ���
			@Override
			public String put(String str1, String str2) {
				str1 = "Key";
				str2 = "Value";
				return super.put(str1, str2);
			}
		};
		map.put("My", "Program");
		System.out.println(map.get("My")); //���null ��Ϊput��������д�ˣ�str1��str2��ֵ�ѹ̶�����
		System.out.println(map.get("Key")); //��� Value
		//����д����ֻ�Ե�ǰ��������
		
		
		List<String> list = new ArrayList<String>() {
			{
				add("A");
				add("B");
			}
		};
		System.out.println("Length:" + list.size());//2
	}
	
	
}

abstract interface TestDemo{
	public abstract String getName();
	String getAge();
}

class User{
	
	public String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return username + " " + password;
	}
}