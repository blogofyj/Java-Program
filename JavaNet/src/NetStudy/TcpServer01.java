package NetStudy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpServer01 {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(8888);
		
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		
		File file = new File("..");
		if(!file.exists()) {
			file.mkdirs();
		}
		
		/*
		 * 自定义一个文件的命名规则，防止文件同名被覆盖
		 * 规则：域名+毫秒值+随机数
		 */
		String filename = "Itcast" + System.currentTimeMillis() + new Random().nextInt(666666) + ".txt";
		
		//构造方法中绑定输出目的地
		FileOutputStream fos = new FileOutputStream(file + "\\" + filename);
		
		byte[] datas = new byte[1024];
		int len = -1;
		while((len = is.read(datas)) != -1) {
			//使用本地字节输出流FileOutputStream对象中的write方法， 把读取的文件保存到服务器硬盘
			fos.write(datas, 0, len);
		}
		
		socket.getOutputStream().write("上传成功".getBytes());
		
		fos.close();
		socket.close();
		server.close();
	}
}
