package Prophet_kin;

/*
 * lambda 标准格式
 * 1.一些参数
 * 2.一个箭头
 * 3.一段代码
 * 格式：(参数列表) -> {一些重写方法代码}
 * 		(): 接口中抽象方法的参数列表，没有就空着，有多个参数使用逗号分隔
 * 		->: 传递，把参数传递给方法体
 * 		{}: 重写接口抽象方法的方法体
 */

public class Demo01 {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Thread start")).start();
		
		//使用匿名内部类实现多线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()
						+ "Create a new Thread!");
			}
		}).start();
		
		
		//使用Lambda表达式，实现多线程
		//()表示参数列表, -> 表示把参数传给后面的方法体
		new Thread(() -> System.out.println(Thread.currentThread().getName() + " Create a new Thread!")).start();
	}
}
