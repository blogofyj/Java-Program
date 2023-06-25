package IODemo01;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 字节数组输出流
 * ByteArrayOutputStream
 * 1.创建源 ： 内部维护
 * 2.选择流： 不关联流
 * 3.操作
 * 4.释放资源: 可以不用处理
 * 
 * 获取数据： toByteArray();
 */

public class IOTest09 {

	public static void main(String[] args) {
	
		//创建源
		byte[] dest = null;
		
		//选择流(新增方法)
		ByteArrayOutputStream baos = null;
		
		try {
			baos = new ByteArrayOutputStream();//不需要传值，系统自动分配
			//操作
			String msg = "show me the code";
			byte[] datas = msg.getBytes();
			
			baos.write(datas, 0, datas.length);
			baos.flush();
			
			//获取数据
//			System.out.println(baos.toString());
			dest = baos.toByteArray();
			System.out.println(dest.length + "-->" + new String(dest, 0, baos.size()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		is.close();不用调用，是空方法
	}
}
