package IODemo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 字节输出流
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */

public class IOTest04 {

	public static void main(String[] args) {
		
		File dest = new File("desk.txt");
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(dest);
			String msg = "IO is easy";
			byte[] datas = msg.getBytes();
			os.write(datas, 0, datas.length);
			os.flush();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(os != null)
						os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
