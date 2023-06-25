package IODemo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 1.����Դ
 * 2.ѡ����
 * 3.����
 * 4.�ͷ���Դ
 * 
 * �ж�ӳ����ļ��Ƿ���ʵ����     file.exists()  //true����  false������
	������ڼ���ֱ�Ӳ���,  ������Ҫ����  file.createNewFile() ������ʵ�ļ�
	�������Ϸ�ʽֻ�����ô����ļ�����,���������ļ��Ĵ���(������ļ�������)
	����һ����Ҫ�Ը��ļ�����������ж�  
	File parent = file.getParentFile()  // ��ȡ���ļ�
	if( !parent.exists() )  parent.mkdirs();  //�������и��ļ���
 */
public class IOTest01 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("test.txt");//������
		
		InputStream is = null;
		byte[] b = new byte[3];
		
		try {
			is = new FileInputStream(f);//ѡ����
			
//			int data1 = is.read();//��ȡ
//			int data2 = is.read();
//			int data3 = is.read();
//			System.out.println((char)data1);
			
			int temp;
			while((temp = is.read( )) != -1) {
				System.out.println((char)temp);
			}
			
			is.close();//�ͷ���Դ
			
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}catch(IOException e) {
			
			e.printStackTrace();
		}finally {		//�ͷ���Դ
			
			try {
				if(is != null) {
					is.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
