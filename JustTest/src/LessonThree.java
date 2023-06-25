
public class LessonThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = (int) (Math.random() * 50);
		
		if(randomNumber < 25){
			System.out.println("The random number is less than 25");
		}
		else if(randomNumber > 40){
			System.out.println("The random number is grater than 40");
		}
		else if(randomNumber ==40){
			
		}
		else{
			System.out.println("Nothing worked");
		}
		if(!(false)){
			System.out.println("\nI turned false into true");
		}
		if((false)&(true)){
			System.out.println("both are true");
		}
		if((false)^(true)){
			System.out.println("one is true");
		}
		
		int valueOne = 1;
		int valueTwo = 2;
		int biggestValue = (valueOne > valueTwo)? valueOne : valueTwo;
		
		
		char theGrade = 'B';
		switch(theGrade){
		case 'A':
			System.out.println("Grate job");
			break;
		case 'B':
			System.out.println("Fine");
			break;
		case 'C':
			System.out.println("OK");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("You Failed");
			break;
		}
	}

}
