package Prophet_kin;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) throws UnknownHostException {
		//ʹ��getLocalHost��������InetAddress����		����
		InetAddress addr = InetAddress.getLocalHost();
		
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
		//���������õ�InetAddress����
		addr = InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
		//����IP�õ�InetAddress����
		addr = InetAddress.getByName("127.0.0.1");
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
	}
}
