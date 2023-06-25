package IODemo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * ï¿½Ä¼ï¿½ï¿½Ö·ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
 * 1.ï¿½ï¿½ï¿½ï¿½Ô´
 * 2.Ñ¡ï¿½ï¿½ï¿½ï¿½
 * 3.ï¿½ï¿½ï¿½ï¿½
 * 4.ï¿½Í·ï¿½ï¿½ï¿½Ô´
 * 
 * ¿ì½Ý¼ü
 * 1.Ìí¼Ó°ü £ºCtrl shift o 
 * 2.Ìí¼Ó´úÂë¿é£ºalt shift z
 * 3.javaBean: Alt shift s
 * 4.È«ÎÄÄ³µ¥´ÊÌæ»» :Ctrl f
 * 5.newºóÌí¼ÓÇ°Ãæ´úÂëÌå: Ctrl 1
 * 6.²é¿´°üµÄµØÖ· £ºAlt enter
 * 7.É¾³ýÕûÐÐ´úÂë Ctrl D
 */

public class IOTest06 {

	public static void main(String[] args) throws IOException {
		
		File src = new File("abc.txt");
		System.out.println(src.exists());
		System.out.println(src.getAbsolutePath());
		
		Reader reader = null;
		
		try {
			reader = new FileReader(src);
			
			char[] flush = new char[1024];//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
			int len = -1;
			
			while((len = reader.read(flush)) != -1) {
				//ï¿½Ö·ï¿½ï¿½ï¿½ï¿½ï¿½--ï¿½ï¿½ï¿½Ö·ï¿½ï¿½ï¿½
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
					
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			reader.close();
			System.out.println("err");
			
		}
	}
}
