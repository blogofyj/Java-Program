package Liaoxuefeng;
import java.lang.*;
//位于java.lang包下的Thread类是非常重要的线程类，它实现了Runnable接口，

public class threadDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread();
		t.start();
		
		Thread t1 = new MyThread();
		t1.start();
		
		Thread t2 = new Thread(new MyRunnable());
		t2.start();
		
		System.out.println("more thread!");
		Thread t3 = new Thread(){
			public void run(){
				System.out.println("thread run...");
				
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					
				}
				
				System.out.println("thread end.");
			}
		};
		
		t3.start();
		try{
			Thread.sleep(20);
		}catch(InterruptedException e){
			
		}
		
		System.out.println("main end...");
	}

}

class MyRunnable implements Runnable{
	//@override
	public void run(){
		System.out.println("start new thrad");
	}
}



class MyThread extends Thread{
	//@override
	public void run(){
		System.out.println("start new thread");
	}
}



//class threadPriority{
//	private int priority;
//	
//	public final static int MIN_PRIORITY = 1;
//	public final static int NORM_PRIORITY = 5;
//	public final static int MAX_PRIORITY = 10;
//	
//	public final void setPriority(int newPriority){
//		ThreadGroup g;
//		checkAccess();
//		if(newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY){
//			throw new Exception();
//		}
//		if((g = getThreadGroup()) != null){
//			if(newPriority > g.getMaxPriority()){
//				newPriority = g.getMaxPriority();
//			}
//			setPriority(priority = newPriority);
//		}
//	}
//	
//	public final int getPriority(){
//		return priority;
//	}
//}
//
//final class enumDemo1{
//	public enum State{
//		NEW,
//		RUNNABLE,
//		BLOCKED,
//		WAITING,
//		TIME_WAITING,
//		TERMINATED;
//	}
//	public State getState(){
//		return sun.misc.VM.toThreadState(threadStatus);
//	}
//}
//
//class runDemo{
//	public void run(){
//		if(target != null){
//			target.run();
//		}
//	}
//	
//	public synchronized void start(){
//		if(threadStatus != 0){
//			throw new ILLrgalthreadStateException();
//		}
//		
//		group.add(this);
//		
//		boolean started = false;
//		
//		try{
//			start();
//			Started = true;
//		}finally{
//			try{
//				if(!started){
//					group.threadStartFailed(this);
//				}
//			}catch(Throwable ignore){
//				
//			}
//		}
//	}
//	private native void start();
//}