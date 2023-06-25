package IODemo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOTest02 {
	
	public static void main(String[] args) {
		
		//创建源
		File f = new File("D:\\ProgramFiles\\JavaProgram\\IOStudy01\\abc.txt");//创建文件映像
//		if( !f.exists()) {
//			f.createNewFile();
//		}else if( !(f.getParentFile()).exists()) {
//			f.getParentFile().mkdirs();
//		}
		
		InputStream is =null;
		try {
			is = new FileInputStream(f);//选择流
			
			//操作 (分段读取)
			byte[] flush = new byte[3];//缓冲容器 每3个读取一次
			int len = -1;//接收长度
			try {
				while((len = is.read(flush)) != -1) {
					//字节数组-->字符串
//				String st = new String(new byte[] {1,2,3,4});
//				System.out.println(st);
					
					String str = new String(flush,0,len);
					System.out.println(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			is.close();//释放资源
			
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
