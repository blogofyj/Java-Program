package Prophet_kin;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * url:
 *	��ʽ��protocol://host:port/path?query#fragment
 *
 *	���ӣ�http://www.runoob.com/index.html?language=cn#j2se
 *	1.Э��Ϊ(protocol)��http
	2.����Ϊ(host:port)��www.runoob.com	���������������
	3.�˿ں�Ϊ(port): 80 ������URLʵ����δָ���˿ڣ���Ϊ HTTP Э��Ĭ�ϵĶ˿ں�Ϊ 80��
	4.�ļ�·��Ϊ(path)��/index.html
	5.�������(query)��language=cn
	6.��λλ��(fragment)��j2se����λ����ҳ�� id ����Ϊ j2se �� HTML Ԫ��λ�� ��
	
	���棺
	1.URL
	2.����
	3.����--��������ʽ
	4.��ȡ
 */

public class UrlTest01 {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://www.bilibili.com/video/BV1Gt411Y7jG?p=5");
		
		System.out.println("Э��: " + url.getProtocol());
		System.out.println("����IP: " + url.getHost());
		System.out.println("�˿� : " + url.getPort());
		System.out.println("������Դ�� " + url.getFile());
		System.out.println("�ļ�·����" + url.getPath());
		
		//����
		System.out.println("����: " + url.getQuery());
		//ê��
		System.out.println("ê�㣺" + url.getRef());
	}
}
