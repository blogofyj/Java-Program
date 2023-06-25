package IODemo01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 1.ͼƬ��ȡ���ֽ�����
 * 2.�ֽ�����д�����ļ�
 * 
 * �ļ���һ��Ҫ�ͷ�
 * �ֽ������Բ���
 */
public class IOTest10 {

	public static void main(String[] args) {
		
	}
	
	/**
	 * 1.ͼƬ���ֽ�����
	 * 1).ͼƬ������ FileInputStream
	 * 2).�����ֽ����� ByteArrayOutputStream
	 * @throws IOException 
	 */
	public static byte[] fileToByteArray(String filePath) throws IOException {
		
		File src = new File(filePath);
		byte[] dest = null;
		
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		
		try {
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			
			//����(�ֶζ�ȡ)
			byte[] flush = new byte[1024*10];//10k
			int len = -1;
			
			while((len = is.read(flush)) != -1) {
				baos.write(flush, 0, len);//д���ֽ�������
			}
			
			baos.flush();
			
			return baos.toByteArray();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				} 
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		return null;
	}
	/**
	 * 2.�ֽ�����д����ͼƬ
	 * 1).�ֽ����鵽���� ByteArrayInputStream
	 * 2).�����ļ� FileOutputStream
	 * @throws IOException 
	 */
	public static void byteArrayToFile(byte[] src, String filePath) throws IOException {
		
		File dest = new File(filePath);
		
		InputStream is = null;
		OutputStream os = null;
		
		
		try {
			is = new ByteArrayInputStream(src);
			os = new FileOutputStream(dest);
			
			//����
			byte[] flush = new byte[5];
			int len = -1;
			
			while((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);
			}
			
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				} 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
