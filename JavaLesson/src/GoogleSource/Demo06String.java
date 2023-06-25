package GoogleSource;

public class Demo06String {

	public static void main(String[] args) {
//		String str = "Hello";
////		String[] str1 = new String[] {"hello"};
//		String str0 = new String("ab");
//		
//		char[] array = {'r', 'u', 'n', 'o', 'o', 'b'};
//		String str1 = new String(array);
//		
//		System.out.println(str1.length());
//		System.out.println(str1.charAt(0));
//		System.out.println(str1.codePointAt(0));
//		System.out.println(str1.compareToIgnoreCase("runoob"));
////		System.out.println(str.concat(str1).toCharArray());
//		try {
//			System.out.println(str1.indexOf('o'));
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("Error");
//		}
//		System.out.println(str1.indexOf("oob"));
//		System.out.println(str1.indexOf('o', 4));
//		System.out.println(str1.lastIndexOf('o'));
//	
//		String fs = String.format("%f" + " %d" + " %s", str, str, str1);
//		
		String str2 = "    runoob         ";
		System.out.println(str2.trim());
		
		System.out.println(String.valueOf(new Integer(90)));
		System.out.println(String.valueOf(new Character('a')));
		System.out.println(String.valueOf(new Long(12903343)));
		System.out.println(String.valueOf(new Boolean(true)));
		System.out.println(String.valueOf(new char[] {'r', 'u', 'n', 'o', 'o', 'b'}));
	}
	
	public static void testSplit() {
		
		/**
		 * 注意： . 、 $、 | 和 * 等转义字符，必须得加 \\。

			注意：多个分隔符，可以用 | 作为连字符。
		 */
		String str = new String("Welcome-to-Runoob");
		 
        System.out.println("- 分隔符返回值 :" );
        for (String retval: str.split("-")){
            System.out.println(retval);
        }
 
        System.out.println("");
        System.out.println("- 分隔符设置分割份数返回值 :" );
        for (String retval: str.split("-", 2)){//limit分割的分数
            System.out.println(retval);
        }
 
        System.out.println("");
        String str2 = new String("www.runoob.com");
        System.out.println("转义字符返回值 :" );
        for (String retval: str2.split("\\.", 3)){
            System.out.println(retval);
        }
 
        System.out.println("");
        String str3 = new String("acount=? and uu =? or n=?");
        System.out.println("多个分隔符返回值 :" );
        for (String retval: str3.split("and|or")){//设置多个分隔符
            System.out.println(retval);
        }
    }
	
}
