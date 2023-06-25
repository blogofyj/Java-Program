package NetStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient01 {

	public static void main(String[] args) throws IOException {
		
		File src = new File("tcpTest.txt");
		if(!src.exists()) {
			src.createNewFile();
		}
		System.out.println(src.getAbsolutePath());
		
		FileInputStream fis = new FileInputStream(src);//绑定要读取的数据
		
		//创建socket的客户端对象，绑定服务器的IP地址和端口号
		Socket socket = new Socket("127.0.0.1", 8888);
		
		OutputStream os = socket.getOutputStream();
		
		//调用FileInputStream对象中的read方法，读取本地文件
		int len = -1;
		byte[] datas = new byte[1024];
		while((len = fis.read(datas)) != -1) {
			//使用OutputStream对象的read方法吧文件上传到服务器
			os.write(datas, 0, len);
		}
		
		/*
		 * 上传完文件，给服务器一个结束标记
		 */
		socket.shutdownOutput();
		
		//获取网络字节输入流的InputStream对象
		InputStream is = socket.getInputStream();
		
		while((len = is.read(datas)) != -1) {
			System.out.println(new String(datas, 0, len));
		}
		
		//释放资源
		fis.close();
		socket.close();
	}
}
