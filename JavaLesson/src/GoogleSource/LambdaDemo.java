package GoogleSource;

import java.util.Arrays;
import java.util.List;

/*
 * �����̴߳���
 */
public class LambdaDemo {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(10, 20, 30, 40);
		
		int res = new LambdaDemo().add(values);
		System.out.println(res );
	}
	
	public int add(List<Integer> values) {
		return values.parallelStream().mapToInt(a -> a).sum();
		
		//��֤�Ƿ��ǲ���ִ�У����еĻ���ֵ������
//		values.parallelStream().forEach(System.out ::println);//����
//		//��˳��
//		values.parallelStream().forEachOrdered(System.out :: println);
	}
}
