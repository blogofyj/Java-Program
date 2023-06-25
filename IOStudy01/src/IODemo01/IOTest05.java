package IODemo01;

import java.io.*;

/*
 * cpoy
 */

public class IOTest05 {

	public static void main(String[] args) {
		
		dirCopy("abc.txt", "abcCopy.txt");
	}
	
	public static void dirCopy(String srcPath, String destPath) {
		File src = new File(srcPath);
		File dest = new File(destPath);
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
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
		
	}
	
}
