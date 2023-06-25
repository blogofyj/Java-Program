package Prophet_kin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * java.util.Properties集合extends Hashtable<k, v> implements Map<k, v>
 * 
 * Properties类表示一个持久的属性集，它可以保存在流中或从流中加载
 * 
 * properties集合是一个唯一和IO流相结合的集合
 * 		可以使用properties集合中的 store方法，把集合中的临时数据，持久化写入到硬盘中存储
 * 		可以使用properties集合中的方法load，把硬盘中保存的文件（键值对） 读到集合中使用
 * 属性列表中每个键及其对应的值都是 一个  字符串 
 * properties是双列集合（key ,value） 都是字符串
 * 
 * properties中有一些操作字符串的特有方法
 * 		object setProperty(String key, String value) 调用Hashtable的方法 put
 * 		String getProperty(String key) 找到value值， 等价于Map的get(key)
 * 		Set<String> stringPropertyNames() 返回此属性列表的键集，该键及其对应的值是字符串
 */

public class PropertiesDemo {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("Tom", "middle school");
		
		Set<String> set = prop.stringPropertyNames();
		
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key + " " + value);
		}
	}
	
	
	/*
	 * 1.创建properties集合对象，添加数据
	 * 2.创建字节输出流/字符输出流对象， 构造方法中绑定要输出的目的地
	 * 3.使用properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中
	 * 4.释放资源
	 */
	public static void show01() throws IOException {
		
		Properties prop = new Properties() {
			{
				setProperty("Tom", "Middle school");
				setProperty("Lily", "High school");
				setProperty("Lisa", "Junior school");
			}
		};
		
		FileWriter fw = new FileWriter(".");
		
		prop.store(fw, "save data");
		
		fw.close();
		
		//字节流，中文——乱码
		prop.store(new FileOutputStream("."), "save data");
	}
	
	
	/*
	 * Load方法
	 * 1.创建properties集合对象
	 * 2.使用Load方法，读取保存键值得文件
	 * 3.遍历properties集合
	 * 	注意：存储键值对的文件中，键于值默认的连接符号可以使用=，空格（其他符号）
	 * 		存储键值对的文件中，可以用# 进行注释，不会再被读取
	 * 		存储键值对的文件中，键与值默认都是字符串，不用再加引号
	 */
	public static void show02() throws FileNotFoundException, IOException {
		 
		Properties prop = new Properties();
		
		prop.load(new FileReader("."));
		
		Set<String> set = prop.stringPropertyNames();
		
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key + " " + value);
		}
	}
}
