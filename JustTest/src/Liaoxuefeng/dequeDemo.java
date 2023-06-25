package Liaoxuefeng;

import java.util.Deque;
import java.util.LinkedList;

public class dequeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new LinkedList();
		deque.offer("Hi");
		deque.add("Welcome to runooob");
		
		deque.pollFirst();
		deque.pollLast();
		deque.remove();
		
		deque.peekFirst();
		deque.peekLast();
		
	}

}
