package NetStudy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Tcp通信服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回数据
 * 表示服务器的类：
 * 		java.net.ServerSocket: 此类实现服务器套接字
 * 构造方法：
 * 		ServerSocket(int port) 创建绑定到特定端口号的服务器套接字
 * 服务器必须明确一件事情：
 * 		必须知道是哪个客户端请求的服务器，所以有Accept方法获取请求客户端对象Socket
 * 成员方法：
 * 		Socket.accpet() 侦听并接收到此套接字的连接
 * 
 * 服务器实现步骤：
 * 1.创建服务器ServerSocket对象和系统要指定的端口号
 * 2.使用ServerSocket对象中的方法Accept，获取到请求的客户端对象Socket
 * 2.使用Socket对象中的方法getInputStream获取网络字节输入流InPutStream对象
 * 3.使用网络字节输入流InPutStream对象中的方法read，读取客户端发送的数据
 * 4.使用Socket对象中的方法getOutputStream获取网络字节输出流OutputStream对象
 * 5.使用网络字节输出流OutputStream对象中的方法write，给客户端回写的数据
 * 6.释放资源（Socket，ServerSocket）
 */

public class TcpServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(10282);//创建服务器
		
		Socket socket = server.accept();//找到客户端
		
		InputStream is = socket.getInputStream();//调用socket里的方法，获取网络输入流对象
		
		byte[] datas = new byte[1024];//读取客户端的数据存入数组
		int len = is.read(datas);
		System.out.println(new String(datas, 0, len));
		
		OutputStream os = socket.getOutputStream();//给客户端回写数据
		
		os.write("Accept the message".getBytes());
		
		socket.close();
		server.close();
	}
}
