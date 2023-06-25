package Liaoxuefeng;

public class StaticTest {

	public static class InnerClass{
		InnerClass(){
			System.out.println("=========静态内部类============");
		}
		
		public void InnerMethod(){
			System.out.println("========静态内部方法==========");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass inner = StaticTest.InnerClass();
		
		inner.InnerMethod();

	}

}
