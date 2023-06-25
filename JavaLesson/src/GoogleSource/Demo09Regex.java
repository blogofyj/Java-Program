package GoogleSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
 * 
 */

public class Demo09Regex {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		groupCountDemo();
		startAndEndDemo();
		matchesAndLookingAtDemo();
		replaceFirstAndReplaceAllDemo();
		appendReplacementAndAppendTailDemo();
		
	}
	
	public static void groupCountDemo() {
		String line = "This order was placed for QT3000! OK?";
		
		String pattern = "(\\D*)(\\d+)(.*)";
		
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(line);
		
		if (m.find()) {
			System.out.println("ȫ�壺 " + m.group(0));
			System.out.println("��һ�飺" + m.group(1));
		}else {
			System.out.println("No Match");
		}
		
		System.out.println(m.groupCount());
		for (int i = 0; i <= m.groupCount(); i++) {
			System.out.println(m.group(i));
		}
	}
	
//	����ΪʲôҪ��һ��ȫ�ֱ���������һ�������У������ǲ����в��ף�
//
//	��Ա�����ж���ı������Ǿֲ�������ֻ���ڷ������ڷ��ʡ�����̬��������ȫ�ֱ�����(�����ݲ�����private���εľ�̬����)��
//
//	���ⲻ���ھ�̬�����ж��徲̬�������ڷǾ�̬�����и����ܡ�java�ǲ�������������ĳ���
	public static void startAndEndDemo() {
		final String REGEX = "\\bcat\\b";	//b��ʾ�߽��
	    final String INPUT ="cat cat cat cattie cat";
	    
	    Pattern p = Pattern.compile(REGEX);
	    Matcher m = p.matcher(INPUT); // ��ȡ matcher ����
	    int count = 0;
	    
	    while(m.find()) {
	    	count ++;
	    	System.out.println("Match number: " + count);
	    	System.out.println("start(): "+m.start());
	        System.out.println("end(): "+m.end());
	    }
	}
	
	
	public static void matchesAndLookingAtDemo() {
//		matches �� lookingAt ��������������ƥ��һ����������ģʽ�����ǵĲ�ͬ�� matches Ҫ���������ж�ƥ�䣬��lookingAt ��Ҫ��
//		lookingAt ������Ȼ����Ҫ���䶼ƥ�䣬������Ҫ�ӵ�һ���ַ���ʼƥ�䡣
		
		final String REGEX = "foo";
	    final String INPUT = "fooooooooooooooooo";
	    final String INPUT2 = "ooooofoooooooooooo";
	    
	    Pattern pattern = Pattern.compile(REGEX);
	    Matcher matcher = pattern.matcher(INPUT);
	    Matcher matcher2 = pattern.matcher(INPUT2);
	    
	    System.out.println("lookingAt(): "+matcher.lookingAt());//true
	    System.out.println("matches(): "+matcher.matches());//false
	    System.out.println("lookingAt(): "+matcher2.lookingAt());//false
	    
	    
	}
	
	
	public static void replaceFirstAndReplaceAllDemo() {
		
		String REGEX = "dog";
	    String INPUT = "The dog says meow. " + "All dogs say meow.";
	    String REPLACE = "cat";
	    
	    Pattern p = Pattern.compile(REGEX);
	    Matcher m = p.matcher(INPUT);
	    
	    INPUT = m.replaceAll(REPLACE);//The cat says meow. All cats say meow.
	    System.out.println(INPUT);
	    
	    String another = m.replaceFirst("cat");
	    System.out.println(another);
	}
	
	
	public static void appendReplacementAndAppendTailDemo() {
//		Matcher ��Ҳ�ṩ��appendReplacement �� appendTail ���������ı��滻
//		appendReplacement(StringBuffer sb,String replacement)
//
//		����ǰƥ���Ӵ��滻Ϊָ���ַ��������ҽ��滻����Ӵ��Լ���֮ǰ���ϴ�ƥ���Ӵ�֮����ַ�������ӵ�һ�� StringBuffer ������
//
//		appendTail(StringBuffer sb)
//
//		�����һ��ƥ�乤����ʣ����ַ�����ӵ�һ�� StringBuffer ������
		
		String REGEX = "a*b";
		String INPUT = "aabfooaabfooabfoobkkk";
		String REPLACE = "-";
		
		Pattern p = Pattern.compile(REGEX);
	      // ��ȡ matcher ����
	    Matcher m = p.matcher(INPUT);
	    
	    StringBuffer sb = new StringBuffer();
	    
	    while(m.find()){
	       m.appendReplacement(sb,REPLACE);
	    }
	    
	    m.appendTail(sb);
	    
	    System.out.println(sb.toString());//-foo-foo-foo-kkk
	    
	    try {
	    	//todo
	    }catch(PatternSyntaxException e) {
	    	e.printStackTrace();
	    }
		
		
	}

}





class Pizza {		//���徲̬�ڲ���
	private String name;
	private String price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
 
	public static Builder newBuilder() {
		return new Builder();
	}
 
	//˽�пչ�����
	private Pizza() {
	}
	
	//���ι�����ΪBuilderʹ��
	private Pizza(Builder builder) {
		this.name = builder.name;
		this.price = builder.price;
	}
	
	public static final class Builder {
		private String name;
		private String price;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder price(String price) {
			this.price = price;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
	}
	
    public static void main(String[] args) {
 
    	Pizza pizza = Pizza.newBuilder().name("chicken cheese").build();
		System.out.println(pizza.getName());
	}
}


