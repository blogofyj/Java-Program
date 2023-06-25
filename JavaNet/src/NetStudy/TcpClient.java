package NetStudy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Tcp通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
 * 表示客户端的类
 * 		java.net.Socket:此类实现客户端套接字， 套接字是两台机器通信的端点
 * 		套接字：包含了IP地址和端口号的网络单位
 * 
 * 构造方法：
 * 		Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。 
 * 成员方法：
 * public InputStream getInputStream()返回此套接字的输入流
 * public OutputStream getOutputStream()throws IOException返回此套接字的输出流。 
 * 		close()关闭此套接字
 * 
 * 实现步骤：
 * 1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
 * 2.使用Socket对象中的方法getOutPutStream获取网络字节输出流OutPutStream对象
 * 3.使用网络字节输出流OutPutStream对象中的方法write，给服务器发送数据
 * 4.使用Socket对象中的方法getInPutStream获取网络字节输入流InPutStream对象
 * 5.使用网络字节输入流InPutStream对象中的方法read，读取服务器回写的数据
 * 6.释放资源（socket）
 * 
 * 注意：
 * 1.客户端可服务器进行交互，必须使用Socket中提供的流，不能自己创建
 * 2.当创建客户端对象Socket的时候，去与服务器进行三次握手
 * 			服务器没有启动，就会抛出异常
 * 			已启动，可以进行交互
 */

public class TcpClient {

	public static void main(String[] args) throws IOException, IOException {
		
		Socket socket = new Socket("127.0.0.1", 10282);
		
		OutputStream os = socket.getOutputStream();
		
		os.write("Hello Servers".getBytes());
		
		//4.5.先空着
//		InputStream is = socket.getInputStream();//调用socket里的方法，获取网络输入流对象
//		
//		byte[] datas = new byte[1024];//读取服务器端的数据存入数组
//		int len = is.read(datas);
//		System.out.println(new String(datas, 0, len));
		
		
		
		socket.close();
	}
}
