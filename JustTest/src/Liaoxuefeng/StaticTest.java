package Liaoxuefeng;

public class StaticTest {

	public static class InnerClass{
		InnerClass(){
			System.out.println("=========��̬�ڲ���============");
		}
		
		public void InnerMethod(){
			System.out.println("========��̬�ڲ�����==========");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass inner = StaticTest.InnerClass();
		
		inner.InnerMethod();

	}

}
