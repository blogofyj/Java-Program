package JavaAdvance;

public class LessonOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] words = {"funk", "chunk", "furry", "baconator"};
//		
//		//StartsWith
//		for(String w : words){
//			if(w.startsWith("fu"))
//				System.out.println(w + " starts with fu");
//		}
//		
//		//ends with
//		for(String w : words){
//			if(w.endsWith("unk"))
//				System.out.println(w + " ends with unnk");
//		}
		
		String s = "buckyrobertsbuckyroberts";
		
		System.out.println(s.indexOf('k',5));//start from index 5
		
		System.out.println(s.indexOf("rob"));//output the index of r
		
		
		String a = "Bacon";
		String b = "    monster     ";
		
		System.out.println(a + b);
		
		System.out.println(a.replace('B', 'F'));
		
		System.out.println(b.toUpperCase());
		
		System.out.println(b.trim());
	}

}
