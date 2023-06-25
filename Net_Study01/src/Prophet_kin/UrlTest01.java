package Prophet_kin;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * url:
 *	格式：protocol://host:port/path?query#fragment
 *
 *	例子：http://www.runoob.com/index.html?language=cn#j2se
 *	1.协议为(protocol)：http
	2.主机为(host:port)：www.runoob.com	（域名，计算机）
	3.端口号为(port): 80 ，以上URL实例并未指定端口，因为 HTTP 协议默认的端口号为 80。
	4.文件路径为(path)：/index.html
	5.请求参数(query)：language=cn
	6.定位位置(fragment)：j2se，定位到网页中 id 属性为 j2se 的 HTML 元素位置 。
	
	爬虫：
	1.URL
	2.下载
	3.分析--》正则表达式
	4.抽取
 */

public class UrlTest01 {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://www.bilibili.com/video/BV1Gt411Y7jG?p=5");
		
		System.out.println("协议: " + url.getProtocol());
		System.out.println("域名IP: " + url.getHost());
		System.out.println("端口 : " + url.getPort());
		System.out.println("请求资源： " + url.getFile());
		System.out.println("文件路径：" + url.getPath());
		
		//参数
		System.out.println("参数: " + url.getQuery());
		//锚点
		System.out.println("锚点：" + url.getRef());
	}
}
