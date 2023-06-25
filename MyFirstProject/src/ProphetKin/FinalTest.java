package ProphetKin;

public class FinalTest {

	
	public void method() {
		
		final int num = 10;
	
		class LocalInnerClass{
			int num = 20;
			
			public void test() {
				System.out.println(num + " " + this.num);
			}
		}
		
		LocalInnerClass lic = new LocalInnerClass();
		lic.test();
	}
	
	public static class method01{
		public static void show2() {
			System.out.println("this is static method");
		}
		public void show() {
			System.out.println("This is static innerclass");
		}
	}
	
	public static void main(String[] args) {
//		new FinalTest().method();
		method01 demo = new FinalTest.method01();
		demo.show();
		
		method01.show2();
	}
}
