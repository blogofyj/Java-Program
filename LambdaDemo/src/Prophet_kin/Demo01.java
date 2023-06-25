package Prophet_kin;

/*
 * lambda ��׼��ʽ
 * 1.һЩ����
 * 2.һ����ͷ
 * 3.һ�δ���
 * ��ʽ��(�����б�) -> {һЩ��д��������}
 * 		(): �ӿ��г��󷽷��Ĳ����б�û�оͿ��ţ��ж������ʹ�ö��ŷָ�
 * 		->: ���ݣ��Ѳ������ݸ�������
 * 		{}: ��д�ӿڳ��󷽷��ķ�����
 */

public class Demo01 {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Thread start")).start();
		
		//ʹ�������ڲ���ʵ�ֶ��߳�
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()
						+ "Create a new Thread!");
			}
		}).start();
		
		
		//ʹ��Lambda���ʽ��ʵ�ֶ��߳�
		//()��ʾ�����б�, -> ��ʾ�Ѳ�����������ķ�����
		new Thread(() -> System.out.println(Thread.currentThread().getName() + " Create a new Thread!")).start();
	}
}
