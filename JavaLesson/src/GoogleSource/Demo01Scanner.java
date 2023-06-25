package GoogleSource;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.MatchResult;
/**
 * 1.导包
 * import java.包路径 包名称；
 * 
 * 2.创建
 * 类名称 对象名 = new 类名称（）；
 * 
 * 3.使用
 * 对象名.方法（）；
 * @author asus
 *
 */

public class Demo01Scanner {
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);//从输入流输入
//		int i = input.nextInt();
		int[] num = new int[10];
		int sum = 0;
		for (int i = 1; i < num.length; i++) {
			System.out.println("Please input the " + i + "th munber:");
			sum += input.nextInt();
		}
		System.out.println("The Sum of number is: " + sum);
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Please input the num["+ i + "] :");
			num[i] = input.nextInt();
		}
		int tmp = num[0] > num[1] ? num[0] : num[1];
		int max = tmp > num[2] ? tmp : num[2];//三角比较
		
		
		
		
		input = new Scanner(new File("myNumber"));//从文件读取
		while(input.hasNextLong()) {
			long along = input.nextLong();
		}
		
		String str = "1 fish 2 fish red fish blue fish";//从指定字符串
		Scanner s = new Scanner(str).useDelimiter("\\s*fish\\s*");//将扫描仪的分隔模式设置为指定模式
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
		
		String str1 = "1 fish 2 fish red fish blue fish";
		Scanner ss = new Scanner(str1);
		ss.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");//尝试找到忽略分隔符的指定模式的下一个出现
		MatchResult result = ss.match();
		for (int j = 0; j <= result.groupCount(); j++) {
			System.out.println(result.group(j));
		}
		ss.close();
		
	}

}

/**public interface MatchResult
 * 该界面包含用于确定与正则表达式匹配的结果的查询方法。
 * 
 * 
 * public final class Scanner extends Object implements
 * Iterator<String>,Closeable{ public Scanner(File source) {
 * 
 * }
 * 
 * public String findInLine(Pattern pattern){
 * 
 * }
 * Pattern p = Pattern.compile("aa");
 * Matcher m = p.matcher("aaaaab");
 * boolean b = m.matches();
 *or
 *boolean b = Pattern.matches("aa", "aaaaabb");
 *
 *
 *public Scanner useDelimiter(Pattern pattern){ }
 *
 *public Scanner reset()//重设扫描仪
 *与同
 *scanner.useDelimiter(Pattern pattern)
 *	.useLocale(Locale.getDefault(Locale.Category.FORMAT))//设置为指定区域
 *	.useRadix(10);//返回此扫描仪的默认基数
 *
 *
 *try{
 *	scanner.close();
 *}catch(Exception e)
 *	e.printStackTrace();
 *  
 * }
 */
