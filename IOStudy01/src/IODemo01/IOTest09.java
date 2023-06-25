package IODemo01;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * �ֽ����������
 * ByteArrayOutputStream
 * 1.����Դ �� �ڲ�ά��
 * 2.ѡ������ ��������
 * 3.����
 * 4.�ͷ���Դ: ���Բ��ô���
 * 
 * ��ȡ���ݣ� toByteArray();
 */

public class IOTest09 {

	public static void main(String[] args) {
	
		//����Դ
		byte[] dest = null;
		
		//ѡ����(��������)
		ByteArrayOutputStream baos = null;
		
		try {
			baos = new ByteArrayOutputStream();//����Ҫ��ֵ��ϵͳ�Զ�����
			//����
			String msg = "show me the code";
			byte[] datas = msg.getBytes();
			
			baos.write(datas, 0, datas.length);
			baos.flush();
			
			//��ȡ����
//			System.out.println(baos.toString());
			dest = baos.toByteArray();
			System.out.println(dest.length + "-->" + new String(dest, 0, baos.size()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		is.close();���õ��ã��ǿշ���
	}
}
