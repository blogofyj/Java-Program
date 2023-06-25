package Liaoxuefeng;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ArraysOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {2,3,78,32,14};
		for(int i = num.length-1; i >= 0; i--){
			System.out.println(num[i]);
		}
		
		for(int n : num){
			System.out.println(n);
			System.out.print(n + ",");
		}
		System.out.println();
		
		System.out.println(java.util.Arrays.toString(num));
		
		System.out.println(java.util.Arrays.toString(Reverse(num)));
		
//		System.out.println(java.util.Arrays.toString(Reverse_One(num)));

//		Reverse_String();
		
		ArrayReverse();
	}
	
	public static int[] Reverse(int[] num){
		int[] result = new int[num.length];
		for(int i = num.length-1, j = 0; i >=0; i--,j++){
			result[j] = num[i];
		}
		return result;
	}
	
	public static void Reverse_String(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input string:");
		String str = scanner.nextLine();
		StringBuffer stringbuffer = new StringBuffer(str);
		System.out.println(stringbuffer.reverse());
	}
	
	public static void ArrayReverse(){
		List list = new ArrayList(){
			{
				add(1);
				add(10);
				add(44);
				add(13);
				add(15);
			}
		};
		System.out.println("Before:" + list);
		java.util.Collections.swap(list, 0, 4);
		System.out.println("After:" + list);
		
	}
//	
//	wrong!!!
//	public static int[] Reverse_One(int[] num){
//		for(int i = 0, j = num.length-1; j >= 0; i++, j--){
//			num[i] = num[j];
//		}
//		return num;
//	}

}
