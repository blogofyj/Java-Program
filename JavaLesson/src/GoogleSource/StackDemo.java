package GoogleSource;

import java.util.EmptyStackException;
import java.util.Stack;//ºÃ≥–vector¿‡

public class StackDemo {

//	private static final String Integer = null;//≥£¡ø

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
//		StackDemo  demo = new StackDemo();
//		demo.test(90);
		new StackDemo().test(100);
		
		System.out.println("Stack: " + st);
		showPush(st, 34);
		showPush(st,19);
		showPush(st, 18);
		showPop(st);
		showPop(st);
		showPop(st);
		try {
			showPop(st);
		}catch(EmptyStackException e) {
			System.out.println("Stack is empty");
		}
		
	}
	
	static void showPush(Stack<Integer> st, int a) {
		
		st.push(new Integer(a));
		System.out.println("Stack:" + st);

	}
	
	static void showPop(Stack<Integer> st) {
		
		System.out.println("pop-> ");
		Integer a = (Integer)st.pop();
		System.out.println(a);
		System.out.println("Stack: " + st);
		
	}
	
	public void test(int x) {
		Stack<Integer> st1 = new Stack<Integer>(); 
		Stack<Integer> st2 = new Stack<Integer>();
		st1.push(x);
		st2.push(x);//complile as st1.push(Integer.valueOf()),when x over the range[-128,127],there be error
		
		int p1 = st1.peek();
		int p2 = st2.peek();//view the element in top of Stack
		
		System.out.println(p1 == p2);
		System.out.println(st1.peek() == st2.peek());
	}
}
