package Prophet_kin;

import java.net.InetSocketAddress;

/**
 * 
 * @author Prophet
 *端口：两个字节， 0~65535 TCP UDP
 *
 *
 *
 */
public class PortTest {

	public static void main(String[] args) {
		
		InetSocketAddress isa = new InetSocketAddress("127.0.0.1", 8080);
		
		InetSocketAddress isa2 = new InetSocketAddress("localhost", 9000);
	
		System.out.println(isa.getHostName());
		System.out.println(isa.getAddress());
		
		System.out.println(isa2.getAddress());
		System.out.println(isa2.getPort());
	}
}
