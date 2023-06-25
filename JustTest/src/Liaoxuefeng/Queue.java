package Liaoxuefeng;
import java.util.LinkedList;
import java.util.Queue;


public class Queue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList();
		q.offer(2);
		q.offer(78);
		System.out.println(q.poll());
		System.out.println(q.poll());
		q.offer(90);
		q.offer(69);
		System.out.println(q.peek());
		System.out.println(q.peek());
	}

}
