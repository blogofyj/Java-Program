package GoogleSource;

import java.util.Random;
import java.util.Scanner;

public class Demo03Random {

	public static void main(String[] args) {
		
		gameShow();
		
		Random r = new Random();
		int num = r.nextInt();
		System.out.println("The Random number is :" + num);
		
		int num1 = r.nextInt(3);//×ó±ÕÓÒ¿ªÇø¼ä
		for (int i = 0; i < 100; i++) {
			int num2 = r.nextInt(10);//0~9
			System.out.println(num2);
		}
		
		int n = 5;
		int result = r.nextInt(n) + 1;//1~n
		
	}
	
	public static void gameShow() {
//		Random random = new Random();
//		int randomNum = random.nextInt(100) + 1;
//		Scanner sc = new Scanner(System.in);
		int randomNum = new Random().nextInt(100) + 1;
		
//		System.out.println("Please input the guessNumber: ");
//		int guessNum = sc.nextInt();
//		int guessNum = new Scanner(System.in).nextInt();
		int chance = new Random().nextInt(3) + 3;
		System.out.println("Your guess of chance is: " + chance);
		while(chance > 0) {
			System.out.println("Please input the Number of guess: ");
			int guessNum = new Scanner(System.in).nextInt();
			if(guessNum > randomNum) {
				System.out.println("It's too big, Please try it again!");
			}else if(guessNum < randomNum){
				System.out.println("It's too smaller,Please try it again!");
			}else {
				System.out.println("Success!");
			}
			chance--;
			if(chance == 1) {
				System.out.println("The last chance!");
			}
		}
	}
}

//public class Random extends Object implements Serializable {
//	
//}
 