package IODemo01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * �ļ��ַ������
 * Writer()
 * FileWriter()
 */

public class IOTest07 {

	public static void main(String[] args) {
		
		File dest = new File("desk.txt");
		
		Writer writer = null;
		
		try {
			writer = new FileWriter(dest);
			//����
//			String msg = "IO is easy\r\n�������";
//			char[] datas = msg.toCharArray();
//			
//			writer.write(datas, 0, datas.length);
			
			//д����
//			String msg = "IO is easy\r\n�������";
//			writer.write(msg);
			
			//д����
			writer.append("IO is easy\\r\\n").append("�������");
			
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
