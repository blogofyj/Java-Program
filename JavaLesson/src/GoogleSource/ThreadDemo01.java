package GoogleSource;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadDemo01 {

	public static void main(String[] args) {
		
		new Thread() {
			public void run() {
				System.out.println("thread start...");
			}
		}.start();
		
//		new Thread().start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread start..");
			}
		}).start();
		
		
//		new Thread() {}.start();
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("Tom");
//			};
//		}) {	//������ʵ��Runnable����д
//			public void run() {
//				System.out.println("hello");//ִֻ�и����,�����ڶ�̬��������
//			}
//		}.start();
		
		
		
	}
	
}
/**
 * �̴߳�����ֵ�ҿ����׳��쳣
 */
class Demo04 implements Callable<Integer>{

	public static void main(String[] args) throws Exception {
		
		Demo04 d = new Demo04();
		
		//��ǰ�������
		FutureTask<Integer> task = new FutureTask<Integer>(d);//���߳�����ķ�װ
		
		Thread t = new Thread(task);
		
		t.start();
		
		System.out.println("���ȸɵ���");
		
		//�õ����ؽ��
		Integer result = task.get();
		System.out.println("�߳�ִ�н����" + result);
		
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);//3s
		return 1;
	}
	
}
/**
 * 
 * ��ʱ��()quartz
 *
 */
class Demo05{
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//ʵ�ֶ�ʱ����
				System.out.println("timertask is run.");
			}
		}, 0, 1000);
		
		
		
	}
}

/**
 * 
 * �̳߳ص�ʵ��
 *
 */
class Demo06{
	
	public static void main(String[] args) {
		
		Executor threadPool = Executors.newFixedThreadPool(10);//����10���߳�
		
		for(int i = 0; i < 10; i++ ) {
			threadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName());
				}
			});
		}
		
		threadPool.shutdown();
	}
}