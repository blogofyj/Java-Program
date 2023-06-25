package NetStudy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Tcpͨ�ŷ������ˣ����տͻ��˵����󣬶�ȡ�ͻ��˷��͵����ݣ����ͻ��˻�����
 * ��ʾ���������ࣺ
 * 		java.net.ServerSocket: ����ʵ�ַ������׽���
 * ���췽����
 * 		ServerSocket(int port) �����󶨵��ض��˿ںŵķ������׽���
 * ������������ȷһ�����飺
 * 		����֪�����ĸ��ͻ�������ķ�������������Accept������ȡ����ͻ��˶���Socket
 * ��Ա������
 * 		Socket.accpet() ���������յ����׽��ֵ�����
 * 
 * ������ʵ�ֲ��裺
 * 1.����������ServerSocket�����ϵͳҪָ���Ķ˿ں�
 * 2.ʹ��ServerSocket�����еķ���Accept����ȡ������Ŀͻ��˶���Socket
 * 2.ʹ��Socket�����еķ���getInputStream��ȡ�����ֽ�������InPutStream����
 * 3.ʹ�������ֽ�������InPutStream�����еķ���read����ȡ�ͻ��˷��͵�����
 * 4.ʹ��Socket�����еķ���getOutputStream��ȡ�����ֽ������OutputStream����
 * 5.ʹ�������ֽ������OutputStream�����еķ���write�����ͻ��˻�д������
 * 6.�ͷ���Դ��Socket��ServerSocket��
 */

public class TcpServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(10282);//����������
		
		Socket socket = server.accept();//�ҵ��ͻ���
		
		InputStream is = socket.getInputStream();//����socket��ķ�������ȡ��������������
		
		byte[] datas = new byte[1024];//��ȡ�ͻ��˵����ݴ�������
		int len = is.read(datas);
		System.out.println(new String(datas, 0, len));
		
		OutputStream os = socket.getOutputStream();//���ͻ��˻�д����
		
		os.write("Accept the message".getBytes());
		
		socket.close();
		server.close();
	}
}
