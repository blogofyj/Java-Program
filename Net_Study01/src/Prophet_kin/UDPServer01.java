package Prophet_kin;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 
 * ���ܶ� 
 * 1.ʹ��DatagramSocket ָ���˿ڣ��������ܶ�		�����ʾ���ڷ��ͺͽ������ݱ����ݰ����׽��֡� 
 * 2.׼������ ��װ��DatagramPacket ����		���ݱ��� ����ʵ�������ӷ��鴫�ͷ���
 * 3.����ʽ���հ���receive��DatagramPacket p��
 * 4.��������
 * 		byte[] getData()
 * 		int    getLength()
 * 5.�ͷ���Դ
 */
public class UDPServer01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("���շ�������...");
		
		DatagramSocket server = new DatagramSocket(8888);
		
		
		/*
		 * buf - ���ڱ��洫�����ݱ��Ļ������� offset - ��������ƫ����  length - Ҫ��ȡ���ֽ�����
		 * ����һ�� DatagramPacket����  ����  ���ȵķ��� length ��ָ��ƫ�Ƶ��������С� 
		 */
		byte[] container = new byte[1024*60];
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
		
		
		/*
		 * receive(DatagramPacket p)�Ӵ��׽��ֽ������ݱ�����
		 */
		server.receive(packet);//����ʽ���հ���
		
		byte[] datas = packet.getData();//�������ݻ������� 
		int len = packet.getLength();//����Ҫ���͵����ݵĳ��Ȼ���յ������ݵĳ��ȡ� 
		System.out.println(new String(datas, 0, len));
		
		server.close();
	}
}
