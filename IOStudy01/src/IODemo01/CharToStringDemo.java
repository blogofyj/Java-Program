package IODemo01;

import java.util.Arrays;

public class CharToStringDemo {

	public static void main(String[] args) {
		
		String s = "hello the world";
		//�ַ���--���ַ�����
		char[] ss = s.toCharArray();
		
		
		
		
		//�ַ�����--���ַ���
		char[] ch = {'a', 'b', 'c'};
		String str = new String(ch);
		//or
		String str1 = String.valueOf(ch);
		System.out.println(str1);
		
//		��String s1 = ch.toString();//��������ת����[C@15db9742 ��������
//		��System.out.println(s1);
		String s1 = Arrays.toString(ch);//ֻ����Arrays����
		
		
		
		
		String string = "abc,def,ghi";
		String[] subString = string.split(",");
		for (String subS : subString) {
			System.out.println(subS);
		}
	}
}
