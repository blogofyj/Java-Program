package ProphetKin;

public class InnerClass {

	
	private int num = 10;
	
	
	/*
	 * �ֲ��ڲ���
	 * �����ڷ������ڲ�
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
	 * ���ʹ�ó�Ա�ڲ��ࣺ
	 * 1.���ⲿ��ĳ�Ա�����У������ڲ������ͨ����������ڲ��ڷ�����
	 * 		ͨ���ⲿ��Ķ�������ⲿ��ķ����� ��������ʹ���ڲ���
	 * 2.�ⲿ��.�ڲ���   ���� = new�ⲿ��.new�ڲ���
	 */
	
	public class Outter{
		
		
		int num = 20;
		public void method() {
			
			int num = 30;
			
			System.out.println("This is outterClass");
			
			System.out.println(num + " " + this.num + " " + InnerClass.this.num);
			
			InnerClass.this.method01();//�����ⲿ�����ڲ��������ķ���
			
		}
		
		public void method01() {
			System.out.println("hello");
		}
		
		
		
	}
}
