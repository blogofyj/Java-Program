package IODemo01;

import java.util.Arrays;

public class ByteToStringDemo {

	public static void main(String[] args) {
		
		String str = "Hello world";
		
		//String-->byte[]
		byte[] b = str.getBytes();
		
		//byte[]-->String
		String s = new String(b);
		
		//����
//		String s = b.toString()//��������
		System.out.println(Arrays.toString(b));
	}
}
