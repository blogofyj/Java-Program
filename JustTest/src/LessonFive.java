import java.util.Scanner;


public class LessonFive {

	/**
	 * @param args
	 */
//	static double myPi = 3.14;
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		addThem(1, 2);
//		
//		int d = 5;
//		tryToChange(d);
//		
//	}
//	
//	public static int addThem(int a, int b){
//		double smallPi = 3.14;
//		
////		double myPi = 3.0;
//		
//		System.out.println("Global " + myPi);
//		
//		return 1;
//	}
//	public static void tryToChange(int d){
//		d += 1;
//		System.out.println("main d = " + d);
//		
//	}
	static int randomNumber;
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while(guessResult != -1){
			
			System.out.println("guess a num between 0 and 50:");
			
			randomGuess = userInput.nextInt();
			
			guessResult =checkGuess(randomGuess);
		}
		
		System.out.println("Yes,the random Number is correct");
	}
	public static int getRandomNum(){
		randomNumber = (int) (Math.random()* 51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess){
		
		if(guess == randomNumber){
			return -1;
		}else{
			return guess;
		}
	}

}
