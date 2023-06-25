package ProphetKin;

import java.util.function.Predicate;

/**
 * 接口类
 * 
 * 用于对某种数据类型的数据进行判决，结果返回一个Boolean值
 * 这是一个功能界面，因此可以用作lambda表达式或方法引用的赋值对象
 * 一个functional interface的功能方法是test(Object) 
 *
 */
public class Predicate01 {

	public static void main(String[] args) {
		
		String s = "abcdef";
		
		boolean b = checkString(s, (String str) -> {
			
			return str.length() > 5;
		});
		
		//checkString(s, str -> str.length() > 5);
	}
	
	public static boolean checkString(String s, Predicate<String> pre) {
		return pre.test(s);
	}
	
}
