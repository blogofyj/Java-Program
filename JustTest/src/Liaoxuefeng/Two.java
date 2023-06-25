package Liaoxuefeng;

public class Two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder(100);
//		for(int i = 0; i < 10; i++){
//			sb.append(i);
//			sb.append(',');
//			
//			
//		}
//		System.out.println(sb.toString());
//		String s = "";
//		for(int i = 0; i < 10; i++){
//			System.out.print(s + i + " ,");
//			
//		}
//		System.out.println();
		
//		var sb1 = new StringBuilder(10);
		String[] fields = {"name","position","salary"};
		String table = "employee";
		String insert = buildInsertSql(table,fields);
		System.out.println(insert);
		
		
	}
	static String buildInsertSql(String table,String[] fields){
		StringBuilder sb = new StringBuilder(1024);
		sb.append("Insert into" + table + "(");
		for(int i = 0; i < fields.length-1; i++){
			sb.append(fields[i]);
			sb.append(",");
		}
		sb.append(fields[fields.length-1]);
		sb.append(")values(???)");
		return sb.toString();
	}
	public static void showDemo() {
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
