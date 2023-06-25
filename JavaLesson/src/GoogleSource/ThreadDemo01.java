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
//		}) {	//以上是实现Runnable的重写
//			public void run() {
//				System.out.println("hello");//只执行该输出,类似于多态调用子类
//			}
//		}.start();
		
		
		
	}
	
}
/**
 * 线程带返回值且可以抛出异常
 */
class Demo04 implements Callable<Integer>{

	public static void main(String[] args) throws Exception {
		
		Demo04 d = new Demo04();
		
		//提前完成任务
		FutureTask<Integer> task = new FutureTask<Integer>(d);//对线程任务的封装
		
		Thread t = new Thread(task);
		
		t.start();
		
		System.out.println("我先干点别的");
		
		//拿到返回结果
		Integer result = task.get();
		System.out.println("线程执行结果：" + result);
		
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
 * 定时器()quartz
 *
 */
class Demo05{
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//实现定时任务
				System.out.println("timertask is run.");
			}
		}, 0, 1000);
		
		
		
	}
}

/**
 * 
 * 线程池的实现
 *
 */
class Demo06{
	
	public static void main(String[] args) {
		
		Executor threadPool = Executors.newFixedThreadPool(10);//创建10个线程
		
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