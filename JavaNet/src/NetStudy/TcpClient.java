package NetStudy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Tcpͨ�ŵĿͻ��ˣ�������������������󣬸��������������ݣ���ȡ��������д������
 * ��ʾ�ͻ��˵���
 * 		java.net.Socket:����ʵ�ֿͻ����׽��֣� �׽�������̨����ͨ�ŵĶ˵�
 * 		�׽��֣�������IP��ַ�Ͷ˿ںŵ����絥λ
 * 
 * ���췽����
 * 		Socket(String host, int port) �������׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ںš� 
 * ��Ա������
 * public InputStream getInputStream()���ش��׽��ֵ�������
 * public OutputStream getOutputStream()throws IOException���ش��׽��ֵ�������� 
 * 		close()�رմ��׽���
 * 
 * ʵ�ֲ��裺
 * 1.����һ���ͻ��˶���Socket�����췽���󶨷�������IP��ַ�Ͷ˿ں�
 * 2.ʹ��Socket�����еķ���getOutPutStream��ȡ�����ֽ������OutPutStream����
 * 3.ʹ�������ֽ������OutPutStream�����еķ���write������������������
 * 4.ʹ��Socket�����еķ���getInPutStream��ȡ�����ֽ�������InPutStream����
 * 5.ʹ�������ֽ�������InPutStream�����еķ���read����ȡ��������д������
 * 6.�ͷ���Դ��socket��
 * 
 * ע�⣺
 * 1.�ͻ��˿ɷ��������н���������ʹ��Socket���ṩ�����������Լ�����
 * 2.�������ͻ��˶���Socket��ʱ��ȥ�������������������
 * 			������û���������ͻ��׳��쳣
 * 			�����������Խ��н���
 */

public class TcpClient {

	public static void main(String[] args) throws IOException, IOException {
		
		Socket socket = new Socket("127.0.0.1", 10282);
		
		OutputStream os = socket.getOutputStream();
		
		os.write("Hello Servers".getBytes());
		
		//4.5.�ȿ���
//		InputStream is = socket.getInputStream();//����socket��ķ�������ȡ��������������
//		
//		byte[] datas = new byte[1024];//��ȡ�������˵����ݴ�������
//		int len = is.read(datas);
//		System.out.println(new String(datas, 0, len));
		
		
		
		socket.close();
	}
}
