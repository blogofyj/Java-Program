package Prophet_kin;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/*
 * 
 * ���Ͷ� 
 * 1.ʹ��DatagramSocket ָ���˿ڣ��������ܶ�  (���ڷ��ͻ�������ݰ����׽���)
 * 2.׼������ һ��ת���ֽ�����
 * 3.��װ��DatagramPacket ����  ����ָ��Ŀ�ĵ�
 * 4.���Ͱ���sent��DatagramPacket p��
 * 
 * 5.�ͷ���Դ
 */
public class UDPClient01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Message is sending");
		
		DatagramSocket client = new DatagramSocket(8888);
		
		String str = "Hello the World";
		byte[] datas = str.getBytes();
		
		//��������  ����  ���ȵķ������ݱ���
		DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
				new InetSocketAddress("localhost", 9999));
		
		/*
		 * send(DatagramPacket p) �Ӵ��׽��ַ������ݱ�����
		 */
		client.send(packet);
		
		client.close();
	}
}
