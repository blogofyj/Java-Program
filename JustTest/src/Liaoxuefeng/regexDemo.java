package Liaoxuefeng;
import java.util.regex.*;


public class regexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
		Matcher m = p.matcher("010-12345678");
		
		Pattern pattern = Pattern.compile("..");
		pattern.matcher("..").matches();
		pattern.matcher("....").matches();
		
		
		Pattern pattern1 = Pattern.compile("(\\d+?)(0*)");
		Matcher matcher1 = pattern1.matcher("12300000");
		if(matcher1.matches()){
			System.out.println("group1=" + matcher1.group(1));
			System.out.println("group2=" + matcher1.group(2));
		}
		
		
		
		if(m.matches()){
			String g1 = m.group(1);
			String g2 = m.group(2);
			System.out.println(g1);
			System.out.println(g2);
		}else{
			System.out.println("Failed");
		}
	}

}
