package Liaoxuefeng;

public class Twelve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("My name");
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();
		sb.append("www");
		sb.append(".runoob");
		sb.append(".com");
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		sb.delete(0, 2);
		System.out.println(sb);
		sb.replace(2, 8, "google");
		System.out.println(sb);
		System.out.println(sb.toString());
	}

}
