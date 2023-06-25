package Prophet_kin;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 
 * 接受端 
 * 1.使用DatagramSocket 指定端口，创建接受端		此类表示用于发送和接收数据报数据包的套接字。 
 * 2.准备容器 封装成DatagramPacket 包裹		数据报包 用于实现无连接分组传送服务。
 * 3.阻塞式接收包裹receive（DatagramPacket p）
 * 4.分析数据
 * 		byte[] getData()
 * 		int    getLength()
 * 5.释放资源
 */
public class UDPServer01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("接收方启动中...");
		
		DatagramSocket server = new DatagramSocket(8888);
		
		
		/*
		 * buf - 用于保存传入数据报的缓冲区。 offset - 缓冲区的偏移量  length - 要读取的字节数。
		 * 构造一个 DatagramPacket用于  接收  长度的分组 length ，指定偏移到缓冲器中。 
		 */
		byte[] container = new byte[1024*60];
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
		
		
		/*
		 * receive(DatagramPacket p)从此套接字接收数据报包。
		 */
		server.receive(packet);//阻塞式接收包裹
		
		byte[] datas = packet.getData();//返回数据缓冲区。 
		int len = packet.getLength();//返回要发送的数据的长度或接收到的数据的长度。 
		System.out.println(new String(datas, 0, len));
		
		server.close();
	}
}
