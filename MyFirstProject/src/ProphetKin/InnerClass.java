package ProphetKin;

public class InnerClass {

	
	private int num = 10;
	
	
	/*
	 * 局部内部类
	 * 定义在方法体内部
	 */
	public void show() {
		final int num = 20;
		
		class Demo{
//			int num = 100;
			
			public void method() {
				System.out.println(num);
			}
		}
		
		new Demo().method();
	}
	
	
	public void method() {
		System.out.println("This is InnerClass");
		
		Outter ot = new Outter();
		ot.method();
	}
	
	public void method01() {
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {
		//method 1
		InnerClass ic = new InnerClass();
		ic.method();
		
		//method 2
		InnerClass.Outter demo = new InnerClass().new Outter();
		demo.method();
	}
	
	
	/*
	 * 如何使用成员内部类：
	 * 1.在外部类的成员方法中，创建内部类对象，通过对象调用内部内方法。
	 * 		通过外部类的对象调用外部类的方法， 里面间接再使用内部类
	 * 2.外部类.内部类   对象 = new外部类.new内部类
	 */
	
	public class Outter{
		
		
		int num = 20;
		public void method() {
			
			int num = 30;
			
			System.out.println("This is outterClass");
			
			System.out.println(num + " " + this.num + " " + InnerClass.this.num);
			
			InnerClass.this.method01();//调用外部类与内部类重名的方法
			
		}
		
		public void method01() {
			System.out.println("hello");
		}
		
		
		
	}
}
