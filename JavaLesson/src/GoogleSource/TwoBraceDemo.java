package GoogleSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.初始化对象（匿名类）
 * 2.匿名内部类
 * @author asus
 *内部brace相当于代码块
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
		
		
		//匿名接口实现类
		//相当于直接写了一个接口的实现类，只不过是内部匿名
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
		
		
		
		Map<String, String> map = new HashMap<String, String>(){//匿名内部类
			@Override
			public String put(String str1, String str2) {
				str1 = "Key";
				str2 = "Value";
				return super.put(str1, str2);
			}
		};
		map.put("My", "Program");
		System.out.println(map.get("My")); //输出null 因为put方法被重写了，str1和str2的值已固定不变
		System.out.println(map.get("Key")); //输出 Value
		//该重写方法只对当前对象有用
		
		
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