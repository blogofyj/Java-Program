package GoogleSource;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.MatchResult;
/**
 * 1.����
 * import java.��·�� �����ƣ�
 * 
 * 2.����
 * ������ ������ = new �����ƣ�����
 * 
 * 3.ʹ��
 * ������.����������
 * @author asus
 *
 */

public class Demo01Scanner {
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);//������������
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
		int max = tmp > num[2] ? tmp : num[2];//���ǱȽ�
		
		
		
		
		input = new Scanner(new File("myNumber"));//���ļ���ȡ
		while(input.hasNextLong()) {
			long along = input.nextLong();
		}
		
		String str = "1 fish 2 fish red fish blue fish";//��ָ���ַ���
		Scanner s = new Scanner(str).useDelimiter("\\s*fish\\s*");//��ɨ���ǵķָ�ģʽ����Ϊָ��ģʽ
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
		
		String str1 = "1 fish 2 fish red fish blue fish";
		Scanner ss = new Scanner(str1);
		ss.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");//�����ҵ����Էָ�����ָ��ģʽ����һ������
		MatchResult result = ss.match();
		for (int j = 0; j <= result.groupCount(); j++) {
			System.out.println(result.group(j));
		}
		ss.close();
		
	}

}

/**public interface MatchResult
 * �ý����������ȷ����������ʽƥ��Ľ���Ĳ�ѯ������
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
 *public Scanner reset()//����ɨ����
 *��ͬ
 *scanner.useDelimiter(Pattern pattern)
 *	.useLocale(Locale.getDefault(Locale.Category.FORMAT))//����Ϊָ������
 *	.useRadix(10);//���ش�ɨ���ǵ�Ĭ�ϻ���
 *
 *
 *try{
 *	scanner.close();
 *}catch(Exception e)
 *	e.printStackTrace();
 *  
 * }
 */
