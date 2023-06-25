package Prophet_kin;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
/*
 * 爬虫：
 * 1.URL
 * 2.下载
 * 
 * html:骨架		css:美化		js:动态(反射使java语言能够动起来)
 * 
 * InputStreamReader:从字节到字符的桥梁
 * 
 * 1.InputStream  OutputStream 字节流
 * 2.Writer  Reader 字符流
 *  值得说明的是，在这两种等级机构下，还有一道桥梁
	InputStreamReader、OutputStreamWriter负责进行InputStream到Reader的适配和由OutputStream到Writer的适配。
	用inputStreamReader(inputStream);返回reader的字符流
	
	reader = new InputStreamReader（new FileInputStream（File file））
	
	BufferedReader br = new BufferedReader(new FileReader("abc.txt"))
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(OutputStream os))
 */

public class SpiderTest {

	public static void main(String[] args) throws Exception {
		//获取URL
		URL url = new URL("https://www.baidu.com/");
		//下载资源
		InputStream is = url.openStream();
		//字节流和字符流要转换一下
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		
		String msg = null;
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
		
		br.close();
		
		//分析
		//处理
	}
}
