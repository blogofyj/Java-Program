package GoogleSource;

public class StaticDemo {
	
	//1.static修饰类，只能是内部类
	public static class InnerClass{
		
		InnerClass(){
			System.out.println("静态内部类");
		}
		
		public void InnerMethod() {
			System.out.println("静态内部放法");
		}
	}
	
	public static void main(String[] args) {
		//直接通过类名访问静态内部类
		InnerClass  inner = new StaticDemo.InnerClass();
		
		//静态内部放法和普通类一样
		inner.InnerMethod();
	}

	
	/*
	 * 2.static 修饰成员变量，类变量，该变量属于该类，而不是属于对象
	 */
	private static String name = "Tom";
	
	/*
	 * 3.static 修饰方法，直接通过类名访问
	 */
	
	/*
	 * 4.static 修饰代码块,程序首次运行就会执行的部分
	 */
}
