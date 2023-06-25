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
			System.out.println("全体： " + m.group(0));
			System.out.println("第一组：" + m.group(1));
		}else {
			System.out.println("No Match");
		}
		
		System.out.println(m.groupCount());
		for (int i = 0; i <= m.groupCount(); i++) {
			System.out.println(m.group(i));
		}
	}
	
//	我们为什么要把一个全局变量定义在一个方法中？这样是不是有不妥？
//
//	成员方法中定义的变量都是局部变量，只能在方法体内访问。而静态变量则是全局变量，(这里暂不考虑private修饰的静态变量)。
//
//	不光不能在静态方法中定义静态变量，在非静态方法中更不能。java是不允许这种情况的出现
	public static void startAndEndDemo() {
		final String REGEX = "\\bcat\\b";	//b表示边界符
	    final String INPUT ="cat cat cat cattie cat";
	    
	    Pattern p = Pattern.compile(REGEX);
	    Matcher m = p.matcher(INPUT); // 获取 matcher 对象
	    int count = 0;
	    
	    while(m.find()) {
	    	count ++;
	    	System.out.println("Match number: " + count);
	    	System.out.println("start(): "+m.start());
	        System.out.println("end(): "+m.end());
	    }
	}
	
	
	public static void matchesAndLookingAtDemo() {
//		matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。它们的不同是 matches 要求整个序列都匹配，而lookingAt 不要求。
//		lookingAt 方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配。
		
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
//		Matcher 类也提供了appendReplacement 和 appendTail 方法用于文本替换
//		appendReplacement(StringBuffer sb,String replacement)
//
//		将当前匹配子串替换为指定字符串，并且将替换后的子串以及其之前到上次匹配子串之后的字符串段添加到一个 StringBuffer 对象里
//
//		appendTail(StringBuffer sb)
//
//		将最后一次匹配工作后剩余的字符串添加到一个 StringBuffer 对象里
		
		String REGEX = "a*b";
		String INPUT = "aabfooaabfooabfoobkkk";
		String REPLACE = "-";
		
		Pattern p = Pattern.compile(REGEX);
	      // 获取 matcher 对象
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





class Pizza {		//定义静态内部内
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
 
	//私有空构造器
	private Pizza() {
	}
	
	//带参构造器为Builder使用
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


