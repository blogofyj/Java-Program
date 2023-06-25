package Liaoxuefeng;

public class regexSearchAndReplaceone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The     quick\t\t brown   fox  jumps   over the  lazy dog.";
		String r = s.replace("\\s+", " ");
		System.out.println(r);
		
		String rr = s.replaceAll("\\s([a-z]{4})\\s", "<b>$1</b>");
		
	}

}
