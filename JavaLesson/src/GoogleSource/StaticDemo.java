package GoogleSource;

public class StaticDemo {
	
	//1.static�����ֻ࣬�����ڲ���
	public static class InnerClass{
		
		InnerClass(){
			System.out.println("��̬�ڲ���");
		}
		
		public void InnerMethod() {
			System.out.println("��̬�ڲ��ŷ�");
		}
	}
	
	public static void main(String[] args) {
		//ֱ��ͨ���������ʾ�̬�ڲ���
		InnerClass  inner = new StaticDemo.InnerClass();
		
		//��̬�ڲ��ŷ�����ͨ��һ��
		inner.InnerMethod();
	}

	
	/*
	 * 2.static ���γ�Ա��������������ñ������ڸ��࣬���������ڶ���
	 */
	private static String name = "Tom";
	
	/*
	 * 3.static ���η�����ֱ��ͨ����������
	 */
	
	/*
	 * 4.static ���δ����,�����״����оͻ�ִ�еĲ���
	 */
}
