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
		 * �Զ���һ���ļ����������򣬷�ֹ�ļ�ͬ��������
		 * ��������+����ֵ+�����
		 */
		String filename = "Itcast" + System.currentTimeMillis() + new Random().nextInt(666666) + ".txt";
		
		//���췽���а����Ŀ�ĵ�
		FileOutputStream fos = new FileOutputStream(file + "\\" + filename);
		
		byte[] datas = new byte[1024];
		int len = -1;
		while((len = is.read(datas)) != -1) {
			//ʹ�ñ����ֽ������FileOutputStream�����е�write������ �Ѷ�ȡ���ļ����浽������Ӳ��
			fos.write(datas, 0, len);
		}
		
		socket.getOutputStream().write("�ϴ��ɹ�".getBytes());
		
		fos.close();
		socket.close();
		server.close();
	}
}
