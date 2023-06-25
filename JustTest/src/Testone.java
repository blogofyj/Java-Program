import java.lang.*;
public class Testone{
	
	static String randomString = "String to print";
	
	
	public static void main(String[] args){
		System.out.println(randomString);
		
		int integerOne = 22;
		int integerTwo = 10;
		integerTwo += integerOne;
		
		System.out.println(integerTwo);
		byte bigByte = 127;
		short bigShort = 28932;
		int bigInt = 2100000;
		long bigLong = 2803804820820848L;
		double bigDouble = 3.43478378;
		float bigFloat = 3.14F;
		
		boolean trueOrFlase = true;
		
		char randomChar = 65;
		char anotherChar = 'A';
		
		char escapedChar = '\\';
		
		String randomString = "I'm a Stirng";
		String anotherString = "buffer";
		String andAnotherString = randomString + ' '  + anotherString;
		
		
		
		String byteString = Byte.toString(bigByte);
		System.out.println(byteString);
		double aDoubleValue = 3.14353546;
		int doubleToInt = (int) aDoubleValue;
		
		System.out.println(doubleToInt);
		String intString = "5";
		
		int stringToInt = Integer.parseInt(intString);
		Short stringToShort = Short.parseShort(intString);
		
		System.out.println(stringToInt + " " + stringToShort);
		
	} 
}