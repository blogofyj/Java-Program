package Liaoxuefeng;

public class One{
	
	public static void main(String[] args){
//		String s = "hello!";
//		String s2 = new String(new char[] {'H','e','l','l','o'});
//		System.out.println(s.toUpperCase() + s2);
//		char[] ch2 = new char[] {'H','e','l','l','o'};
//		System.out.println(java.util.Arrays.toString(ch2));
//		
//		System.out.println(s.lastIndexOf('o'));
//		
//		for(char ch3 : ch2){
//			System.out.println(ch3);
//		}
//		
//		char[] data = {'s','g','k'};
//		String st = String.valueOf(data);
//		int i = 9;
//		String st2 = String.valueOf(i);
//		System.out.println(st + " and " + i);
//		
//		char[] ss = s.toCharArray();
//		for(int i = 0; i < ss.length; i++){
//			System.out.println(ss[i]);
//			
//		}
		
		int[] scores = new int[] {88,90,87,92};
		Score s = new Score(scores);
		s.printScores();
		scores[2] = 99;
		s.printScores();
	}
	
}
class Score{
	private int[] scores;
	public Score(int[] scores){
		this.scores = scores;
	}
	public void printScores(){
		System.out.println(java.util.Arrays.toString(scores));
	}
}