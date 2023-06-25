package IODemo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * 
 * 判断映射的文件是否真实存在     file.exists()  //true存在  false不存在
	如果存在即可直接操作,  否则需要调用  file.createNewFile() 创建真实文件
	但是以上方式只会适用创建文件本身,不包括父文件的创建(如果父文件不存在)
	所以一般需要对父文件存在与否作判断  
	File parent = file.getParentFile()  // 获取父文件
	if( !parent.exists() )  parent.mkdirs();  //创建所有父文件夹
 */
public class IOTest01 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("test.txt");//创建流
		
		InputStream is = null;
		byte[] b = new byte[3];
		
		try {
			is = new FileInputStream(f);//选择流
			
//			int data1 = is.read();//读取
//			int data2 = is.read();
//			int data3 = is.read();
//			System.out.println((char)data1);
			
			int temp;
			while((temp = is.read( )) != -1) {
				System.out.println((char)temp);
			}
			
			is.close();//释放资源
			
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}catch(IOException e) {
			
			e.printStackTrace();
		}finally {		//释放资源
			
			try {
				if(is != null) {
					is.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
