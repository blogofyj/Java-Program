package ProphetKin;

import java.util.function.Predicate;

/**
 * �ӿ���
 * 
 * ���ڶ�ĳ���������͵����ݽ����о����������һ��Booleanֵ
 * ����һ�����ܽ��棬��˿�������lambda���ʽ�򷽷����õĸ�ֵ����
 * һ��functional interface�Ĺ��ܷ�����test(Object) 
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
