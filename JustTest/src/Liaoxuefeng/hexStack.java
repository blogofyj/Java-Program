package Liaoxuefeng;

import java.util.ArrayDeque;
import java.util.Deque;

public class hexStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hex = toHex(12500);
		if(hex.equalsIgnoreCase("30D4")){
			System.out.println("Sucesss");
		}else{
			System.out.println("Fail");
		}
	}
	
	static String toHex(int n){
		final int Div = 16;
		char[] hexNum = {'0', '1', '2', '3', '4', '5','6', '7',
				'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		Deque<Character> stack = new ArrayDeque();
		while(n != 0){
			int remainder = n % Div;
			stack.push(hexNum[remainder]);
			n /= Div;
		}
		StringBuilder sb = new StringBuilder();
		while(stack.peek() != null){
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}

}






