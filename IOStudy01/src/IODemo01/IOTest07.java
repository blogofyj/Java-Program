package IODemo01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * 文件字符输出流
 * Writer()
 * FileWriter()
 */

public class IOTest07 {

	public static void main(String[] args) {
		
		File dest = new File("desk.txt");
		
		Writer writer = null;
		
		try {
			writer = new FileWriter(dest);
			//操作
//			String msg = "IO is easy\r\n你好世界";
//			char[] datas = msg.toCharArray();
//			
//			writer.write(datas, 0, datas.length);
			
			//写法二
//			String msg = "IO is easy\r\n你好世界";
//			writer.write(msg);
			
			//写法三
			writer.append("IO is easy\\r\\n").append("你好世界");
			
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
