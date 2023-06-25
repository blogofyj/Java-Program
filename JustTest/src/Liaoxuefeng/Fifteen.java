//SimpleDateFormate

package Liaoxuefeng;
import java.util.*;
import java.lang.reflect.Array;
import java.text.*;

public class Fifteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date dNow = new Date();
//		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		System.out.println("当前时间:" + ft.format(dNow));
//		
//		System.out.printf("全部日期和时间信息：%tc%n",dNow);
//		System.out.printf("%tF%n",dNow);
//		System.out.printf("%tD%n",dNow);
//		System.out.printf("%tr%n",dNow);
//		System.out.printf("%tT%n",dNow);
//		System.out.printf("%tR%n",dNow);
//		
//		Character ch = new Character('a');
//		
//		String str = "Runoob";
//		char[] array = str.toCharArray();
//		
//		
//		for(char i : array){
//			System.out.print(i + " ");
//		}
		int[] num = new int[] {7, 9, 4, 25, 1};
		int[] num2 = {7, 9, 4, 25, 1};
		Arrays.sort(num);
		Arrays.sort(num2);
		System.out.println(Arrays.toString(num2));
		
		System.out.println(Arrays.toString(num));
		
		Arrays.fill(num, 99);
		for(int demo : num){
			System.out.print(demo + " ");
		}
		System.out.println();
		//boolean ifEqual = Arrays.equals(num, num2);
		System.out.println(Arrays.equals(num, num2));
		/*int[] num1 = {1,2,3};
		int[] num2 = {1,2,3};
		System.out.println(Arrays.equals(num1, num2));*/
		
		
		
	}

}
