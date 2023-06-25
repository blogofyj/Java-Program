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
 * 1.图片读取到字节数组
 * 2.字节数组写出到文件
 * 
 * 文件流一定要释放
 * 字节流可以不管
 */
public class IOTest10 {

	public static void main(String[] args) {
		
	}
	
	/**
	 * 1.图片到字节数组
	 * 1).图片到程序 FileInputStream
	 * 2).程序到字节数组 ByteArrayOutputStream
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
			
			//操作(分段读取)
			byte[] flush = new byte[1024*10];//10k
			int len = -1;
			
			while((len = is.read(flush)) != -1) {
				baos.write(flush, 0, len);//写到字节数组中
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
	 * 2.字节数组写出到图片
	 * 1).字节数组到程序 ByteArrayInputStream
	 * 2).程序到文件 FileOutputStream
	 * @throws IOException 
	 */
	public static void byteArrayToFile(byte[] src, String filePath) throws IOException {
		
		File dest = new File(filePath);
		
		InputStream is = null;
		OutputStream os = null;
		
		
		try {
			is = new ByteArrayInputStream(src);
			os = new FileOutputStream(dest);
			
			//操作
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
