package Prophet_kin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/*
 * 爬虫：
 * 1.URL
 * 2.下载
 * (爬虫 + 模拟浏览器)并不是所有的都能抓取，所以需要模拟浏览器
 */

public class SpiderTest02 {

	public static void main(String[] args) throws Exception {
		//获取URL
		URL url = new URL("https://www.dianping.com");
		//下载资源
		
		//调入一个输入流
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		
		//模拟浏览器		偷偷的骗过浏览器，以为是浏览器访问
		conn.setRequestMethod("GET");//get 和  post 方法
		
		conn.setRequestProperty("User-Agent ","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.116 Safari/537.36");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		
		String msg = null;
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
		
		br.close();
		
		//分析
		//处理
	}
}
