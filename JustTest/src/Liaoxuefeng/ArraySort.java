package Liaoxuefeng;

import java.util.Random;

public class ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ð������
		int[] num = new int[10];
//		Random randomNum = new Random(10);
		
		Random r = new Random();
		int b = r.nextInt(10);
		System.out.println(b);
		
		int a = (int)(Math.random() * 10);//create [1~10) don't include 10
		System.out.println(a);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*20);
		}
		System.out.println(java.util.Arrays.toString(num));
		
//		ð������
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i -1; j++) {//�Ƚ��˶��ٴξͼ�i,����ģ��Ѿ�ѡ�Ĵ�������Ͳ���Ҫ�Ƚ���
				if (num[j] > num[j + 1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(num));
		
		java.util.Arrays.sort(num);
		System.out.println(java.util.Arrays.toString(num));
		
		int[][] dimArray = new int[10][10];
		for (int i = 0; i < dimArray.length; i++) {
			for (int j = 0; j < dimArray[i].length; j++) {
				dimArray[i][j] = (int)(Math.random() * 10);
			}
		}
		
		System.out.println(java.util.Arrays.deepToString(dimArray));
		
		for (int[] row : dimArray) {
			for (int i : row) {
				System.out.print(i);
				System.out.print(", ");
			}
			System.out.println();
		}
	}

}
