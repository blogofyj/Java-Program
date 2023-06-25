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
			
			System.out.println(matcher.start());//��ʼƥ��λ�����
			
			String sub = s.substring(matcher.start(), matcher.end());
			System.out.println(sub);
		}
		
		System.out.println(pattern.pattern());
		
		Pattern p1 = Pattern.compile("\\d+");
		String[] str1 = p1.split("�ҵ�QQ��:456456�ҵĵ绰��:0532214�ҵ�������:aaa@aaa.com");
		System.out.println(java.util.Arrays.toString(str1));
		System.out.println(java.util.Arrays.deepToString(str1));
		for(String ss : str1){
			System.out.println(ss);
		}
		
		//1.static method, use directly
		boolean isMatch = Pattern.matches("\\d+", "3803");
		Pattern.matches("\\d+", "34ajs99");
		
		
		//2.˵����ô��,�����ֵ�Matcher��ǳ���,Pattern.matcher(CharSequence input)����һ��Matcher����.
		//Matcher��Ĺ��췽��Ҳ��˽�е�,�������ⴴ��,ֻ��ͨ��Pattern.matcher(CharSequence input)�����õ������ʵ��. 
		//Pattern��ֻ����һЩ�򵥵�ƥ�����,Ҫ��õ���ǿ����ݵ�����ƥ�����,�Ǿ���Ҫ��Pattern��Matcherһ�����.Matcher���ṩ�˶�������ʽ�ķ���֧��,�Լ���������ʽ�Ķ��ƥ��֧��
		Pattern p2 = Pattern.compile("\\d+");
		Matcher m = p2.matcher("22bb99");
		m.pattern();//return p2,���ظ�Matcher���������ĸ�Pattern����Ĵ�����
		
		
		//3.Another coding
//		Pattern p=Pattern.compile("\\d+");
//		Matcher m=p.matcher("22bb23");
//		m.matches();//����false,��Ϊbb���ܱ�\d+ƥ��,���������ַ���ƥ��δ�ɹ�.
		
		
		//4.�ȼ۴���
//		Pattern.compile(regex).matcher(input).matches();
		
		
		
		//5.lookingAt()��ǰ����ַ�������ƥ��,ֻ��ƥ�䵽���ַ�������ǰ��ŷ���true 
//		Pattern p=Pattern.compile("\\d+");
//		Matcher m=p.matcher("22bb23");
//		m.lookingAt();//����true,��Ϊ\d+ƥ�䵽��ǰ���22
//		Matcher m2=p.matcher("aa2223");
//		m2.lookingAt();//����false,��Ϊ\d+����ƥ��ǰ���aa
		
		
		//6.find()���ַ�������ƥ��,ƥ�䵽���ַ����������κ�λ��. 
		
		
		//7.start()����ƥ�䵽�����ַ������ַ����е�����λ��. 
	    //8.end()����ƥ�䵽�����ַ��������һ���ַ����ַ����е�����λ��. 
	    //9.group()����ƥ�䵽�����ַ��� 
//		Pattern p = Pattern.compile("\\d+");<br>       
//		Matcher m1 = p.matcher("aaa2223bb");
//		System.out.println(m1.find());// ƥ��2223��true��
//		System.out.println(m1.start());// ����3
//		System.out.println(m1.end());// ����7,���ص���2223���������
//		System.out.println(m1.group());// ����2223<br>
//		Matcher m2 = p.matcher("2223bb");
		
		
		
		
	}

}
