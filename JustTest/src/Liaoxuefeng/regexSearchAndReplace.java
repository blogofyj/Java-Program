package Liaoxuefeng;
import java.util.regex.*;

public class regexSearchAndReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the quick brown fox jumps over the lazy dog.";
		Pattern pattern = Pattern.compile("\\wo\\w");
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()){
			
			System.out.println(matcher.start());//初始匹配位置序号
			
			String sub = s.substring(matcher.start(), matcher.end());
			System.out.println(sub);
		}
		
		System.out.println(pattern.pattern());
		
		Pattern p1 = Pattern.compile("\\d+");
		String[] str1 = p1.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");
		System.out.println(java.util.Arrays.toString(str1));
		System.out.println(java.util.Arrays.deepToString(str1));
		for(String ss : str1){
			System.out.println(ss);
		}
		
		//1.static method, use directly
		boolean isMatch = Pattern.matches("\\d+", "3803");
		Pattern.matches("\\d+", "34ajs99");
		
		
		//2.说了这么多,终于轮到Matcher类登场了,Pattern.matcher(CharSequence input)返回一个Matcher对象.
		//Matcher类的构造方法也是私有的,不能随意创建,只能通过Pattern.matcher(CharSequence input)方法得到该类的实例. 
		//Pattern类只能做一些简单的匹配操作,要想得到更强更便捷的正则匹配操作,那就需要将Pattern与Matcher一起合作.Matcher类提供了对正则表达式的分组支持,以及对正则表达式的多次匹配支持
		Pattern p2 = Pattern.compile("\\d+");
		Matcher m = p2.matcher("22bb99");
		m.pattern();//return p2,返回该Matcher对象是由哪个Pattern对象的创建的
		
		
		//3.Another coding
//		Pattern p=Pattern.compile("\\d+");
//		Matcher m=p.matcher("22bb23");
//		m.matches();//返回false,因为bb不能被\d+匹配,导致整个字符串匹配未成功.
		
		
		//4.等价代码
//		Pattern.compile(regex).matcher(input).matches();
		
		
		
		//5.lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true 
//		Pattern p=Pattern.compile("\\d+");
//		Matcher m=p.matcher("22bb23");
//		m.lookingAt();//返回true,因为\d+匹配到了前面的22
//		Matcher m2=p.matcher("aa2223");
//		m2.lookingAt();//返回false,因为\d+不能匹配前面的aa
		
		
		//6.find()对字符串进行匹配,匹配到的字符串可以在任何位置. 
		
		
		//7.start()返回匹配到的子字符串在字符串中的索引位置. 
	    //8.end()返回匹配到的子字符串的最后一个字符在字符串中的索引位置. 
	    //9.group()返回匹配到的子字符串 
//		Pattern p = Pattern.compile("\\d+");<br>       
//		Matcher m1 = p.matcher("aaa2223bb");
//		System.out.println(m1.find());// 匹配2223【true】
//		System.out.println(m1.start());// 返回3
//		System.out.println(m1.end());// 返回7,返回的是2223后的索引号
//		System.out.println(m1.group());// 返回2223<br>
//		Matcher m2 = p.matcher("2223bb");
		
		
		
		
	}

}
