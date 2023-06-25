package IODemo01;

import java.util.Arrays;

public class CharToStringDemo {

	public static void main(String[] args) {
		
		String s = "hello the world";
		//字符串--》字符数组
		char[] ss = s.toCharArray();
		
		
		
		
		//字符数组--》字符串
		char[] ch = {'a', 'b', 'c'};
		String str = new String(ch);
		//or
		String str1 = String.valueOf(ch);
		System.out.println(str1);
		
//		！String s1 = ch.toString();//不能这样转换，[C@15db9742 出现乱码
//		！System.out.println(s1);
		String s1 = Arrays.toString(ch);//只能用Arrays方法
		
		
		
		
		String string = "abc,def,ghi";
		String[] subString = string.split(",");
		for (String subS : subString) {
			System.out.println(subS);
		}
	}
}
