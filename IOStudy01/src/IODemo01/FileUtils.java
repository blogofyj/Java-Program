package IODemo01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ��װ
 * 1.��װ����
 * 2.��װ�ͷ���Դ
 * 
 * try...with...resource  �Զ��ͷ�
 * try(is;os){
 * 	   //todo
 * }
 */

public class FileUtils {

	public static void main(String[] args) {
		
		//�ļ����ļ�
		try {
			InputStream is = new FileInputStream("abc.txt");
			OutputStream os = new FileOutputStream("abc-copy.txt");
			copy(is, os);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�ļ����ֽ�����
		byte[] datas = null;
		try {
			InputStream is = new FileInputStream("abc.txt");
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			copy(is, os);
			datas = os.toByteArray();
			System.out.println(datas.length);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�ֽ����鵽�ļ�
		try {
			InputStream is = new ByteArrayInputStream (datas);
			OutputStream os = new FileOutputStream("abc-copy.txt");
			copy(is, os);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/*
	 * �Խ����������
	 */
	public static void copy(InputStream is, OutputStream os) {
		
		
		try {
			
			//����(�ֶζ�ȡ)
			byte[] flush = new byte[1024];
			int len = -1;
			
			while((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);
			}
			
			os.flush();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//�ͷ���Դ, �ֱ�رգ��ȴ򿪵ĺ�ر�
			close(is, os); 
		}
		
	}
	
	public static void close(InputStream is, OutputStream os) {
		try {
			
			if (os != null) {
				os.close();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			if (is != null) {
				is.close();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void close(Closeable... ios) {
		for (Closeable io : ios) {
			try {
				if (io != null) {
					io.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
//	�Զ��ͷ���Դ
//	try(InputStream is = new InputStream(src);OutputStream os = new OutputStream(dest); {
//		
//		@Override
//		public void write(int b) throws IOException {
//			// TODO Auto-generated method stub
//			
//		}
//	}; {
//		
//		@Override
//		public int read() throws IOException {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	})
	
}
