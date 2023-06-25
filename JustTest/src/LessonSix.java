import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

//ArithmeticException
public class LessonSix {

	/**
	 * @param args
	 */
//	static Scanner userInput = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		divideByZero(2);
//		System.out.println("How old are you?");
//		int age = checkValidAge();
//		
//		if(age != 0){
//			System.out.println("you are" + age + "years old");
//		}
//		
//	}
//	
//	public static void divideByZero(int a){
//		
//		try{
//			System.out.println(a/0);
//			
//		}catch(ArithmeticException e){
//			System.out.println("you can't do that.");
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			
//			e.printStackTrace();
//		}
//	}
//	public static int checkValidAge(){
//		try{
//			return userInput.nextInt();
//		}catch(InputMismatchException e){
//			userInput.next();
//			System.out.println("That's not a whole number");
//			return 0;
//		}
//		
//	}
	public static void main(String[] args){
		
		getAFile("./somestuff.txt");
	}
	
	public static void getAFile(String fileName){
		
		 try{
			 FileInputStream file = new FileInputStream(fileName);
		 }catch(FileNotFoundException e){
			 
			 System.out.println("Sorry,can't find that file.");
		 }catch(IOException e){
			 System.out.println("Unknow IO Error.");
			 
		 }
		 catch(ClassNotFoundException | IOException e){
			 
		 }
		 catch(Exception e){
			 System.out.println("Some error occurred.");
		 }finally{
			 System.out.println("");
		 }
	}
	//or as follows:
	public static void getAFile(String fileName) throws IOException,FileNotFoundException{
		
		FileInputStream file = new FileInputStream(fileName);
	}

}
