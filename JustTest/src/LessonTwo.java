import java.util.*;

public class LessonTwo {

	static Scanner userInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("your favorite number: ");
		
		if(userInput.hasNextInt()){
			
			int numberEnter = userInput.nextInt();
			
			System.out.println("you enterd " + numberEnter);
			
			int numEnteredTimes2 = numberEnter + numberEnter;
			
			int numberABS = Math.abs(numberEnter);
			int whichIsBig = Math.max(5, 9);
			int whichIsSmall = Math.min(4, 9);
			
			double numSqrt = Math.sqrt(5.23);
			
			int numCeiling = (int) Math.ceil(5.23);
			
			int numFloor = (int) Math.floor(5.23);
			
			int numRound = (int) Math.round(5.23);
			
			int randomNumber = (int) (Math.random() * 10);
			
			System.out.println("The random number is : " + randomNumber);
			
			
		}else{
			System.out.println("Enter an integer next time");
		}
		for(int i = 0; i < 20; i++){
			int numTwo = (int) (Math.random()*50);
			System.out.println("The random_num is: " + numTwo);
		}
		
			
		
		
	
	}
}
