package Liaoxuefeng;

public class Eleven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double[] nums = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
//		for(double num : nums){
//			test(num);
//		}
//	}
//	private static void test(double num){
//		
//		System.out.println("Math.flor:(" + num + ")=" + Math.floor(num));
//		System.out.println("Math.round:(" + num + ")=" + Math.round(num));
//		System.out.println("Math.ceil:(" + num + ")=" + Math.ceil(num));
//		System.out.println("Math.abs:(" + num + ")=" + Math.abs(num));
//	
//	}
//		System.out.println("My name is" + "\t" + "Bob");
//		System.out.println("My name is" + "\b" + "Bob");
//		System.out.println("My name is" + "\n" + "Bob");
//		System.out.println("My name is" + "\r" + "Bob");
//		System.out.println("My name is" + "\f" + "Bob");
//		System.out.println("My name is" + "\'" + "Bob");
//		System.out.println("My name is" + "\\" + "Bob");
	
		char[] array = {'A', 'e', 'e', 9, 'B', ' '};
//		haracter n = 'M';
//		System.out.println(Character.isLetter(array[0]));
//		String name = "Bob";
//		System.out.println(name.toLowerCase());
		for(char letter : array){
			System.out.println(Character.isLetter(letter));
			System.out.println(Character.isDigit(letter));
			System.out.println(Character.isWhitespace(letter));
			System.out.println(Character.isUpperCase(letter));
			System.out.println(Character.isLowerCase(letter));
			System.out.println(Character.toUpperCase(letter));
			System.out.println(Character.toString(letter));
			System.out.println();
		}
	}

	
}