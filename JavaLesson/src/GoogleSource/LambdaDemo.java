package GoogleSource;

import java.util.Arrays;
import java.util.List;

/*
 * 用于线程创建
 */
public class LambdaDemo {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(10, 20, 30, 40);
		
		int res = new LambdaDemo().add(values);
		System.out.println(res );
	}
	
	public int add(List<Integer> values) {
		return values.parallelStream().mapToInt(a -> a).sum();
		
		//验证是否是并行执行，并行的话数值是乱序
//		values.parallelStream().forEach(System.out ::println);//乱序
//		//按顺序
//		values.parallelStream().forEachOrdered(System.out :: println);
	}
}
