package Prophet_kin;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/*
 * 
 * 发送端 
 * 1.使用DatagramSocket 指定端口，创建接受端  (用于发送或接收数据包的套接字)
 * 2.准备数据 一定转成字节数据
 * 3.封装成DatagramPacket 包裹  ，需指定目的地
 * 4.发送包裹sent（DatagramPacket p）
 * 
 * 5.释放资源
 */
public class UDPClient01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Message is sending");
		
		DatagramSocket client = new DatagramSocket(8888);
		
		String str = "Hello the World";
		byte[] datas = str.getBytes();
		
		//构造用于  发送  长度的分组数据报包
		DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
				new InetSocketAddress("localhost", 9999));
		
		/*
		 * send(DatagramPacket p) 从此套接字发送数据报包。
		 */
		client.send(packet);
		
		client.close();
	}
}
