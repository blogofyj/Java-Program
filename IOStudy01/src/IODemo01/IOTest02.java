package IODemo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOTest02 {
	
	public static void main(String[] args) {
		
		//����Դ
		File f = new File("D:\\ProgramFiles\\JavaProgram\\IOStudy01\\abc.txt");//�����ļ�ӳ��
//		if( !f.exists()) {
//			f.createNewFile();
//		}else if( !(f.getParentFile()).exists()) {
//			f.getParentFile().mkdirs();
//		}
		
		InputStream is =null;
		try {
			is = new FileInputStream(f);//ѡ����
			
			//���� (�ֶζ�ȡ)
			byte[] flush = new byte[3];//�������� ÿ3����ȡһ��
			int len = -1;//���ճ���
			try {
				while((len = is.read(flush)) != -1) {
					//�ֽ�����-->�ַ���
//				String st = new String(new byte[] {1,2,3,4});
//				System.out.println(st);
					
					String str = new String(flush,0,len);
					System.out.println(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			is.close();//�ͷ���Դ
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(is != null) {
					is.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error happen");
			}
		}
		
	}

}
