package Prophet_kin;

import java.util.ArrayList;

/**
 * lambda表达式，是可推导，可以省略
 * 凡是根据上下文推导出来的内容，都可以省略书写
 * 可以省略的内容：
 * 		1.（参数列表） ： 括号中参数列表的数据类型，可以省略不写
 * 		2.（参数列表） ： 括号中的参数如果只有一个， 那么类型和（）都可以省略
 * 		3.{一些代码} ： 如果{}中的代码只有一行， 无论是否有返回值，都可以省略（ {}， return， 分号）
 * 					注意：要省略{}，return，分号必须一起省略
 * @author asus
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		//{},return,分号 都省略了
		new Thread(() -> System.out.println(Thread.currentThread().getName() + " start Running")).start();
	
		/**
		 * 1.使用lambda必须具有接口，且要求接口中仅有一个抽象方法
		 * 2.使用lambda必须具有“上下文推断”
		 * 		也就是方法的参数或局部变量类型必须为lambda对应的接口类型，才能使用lambda 作为该接口的实例
		 * 
		 * 有且仅有一个抽象方法的接口，称为 函数式接口
		 */
	}
}
