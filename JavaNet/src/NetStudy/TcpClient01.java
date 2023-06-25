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
		
		FileInputStream fis = new FileInputStream(src);//��Ҫ��ȡ������
		
		//����socket�Ŀͻ��˶��󣬰󶨷�������IP��ַ�Ͷ˿ں�
		Socket socket = new Socket("127.0.0.1", 8888);
		
		OutputStream os = socket.getOutputStream();
		
		//����FileInputStream�����е�read��������ȡ�����ļ�
		int len = -1;
		byte[] datas = new byte[1024];
		while((len = fis.read(datas)) != -1) {
			//ʹ��OutputStream�����read�������ļ��ϴ���������
			os.write(datas, 0, len);
		}
		
		/*
		 * �ϴ����ļ�����������һ���������
		 */
		socket.shutdownOutput();
		
		//��ȡ�����ֽ���������InputStream����
		InputStream is = socket.getInputStream();
		
		while((len = is.read(datas)) != -1) {
			System.out.println(new String(datas, 0, len));
		}
		
		//�ͷ���Դ
		fis.close();
		socket.close();
	}
}
