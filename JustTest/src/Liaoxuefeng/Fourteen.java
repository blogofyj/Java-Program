package Liaoxuefeng;

public class Fourteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
		String helloString = new String(helloArray);
		System.out.println(helloArray);
		System.out.println(helloString.equals("runoob"));
		
		//int s = helloString.length();
		
		//helloString.concat("www.google.com");
		
		//boolean isEquals = helloString.equals("runoob www.google.com");
		
		System.out.println(helloString.concat(" www.google.com"));
		System.out.println(helloString.equals("runoob www.google.com"));
	}

}
