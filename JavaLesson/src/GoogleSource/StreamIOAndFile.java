package GoogleSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class StreamIOAndFile {
	
	public static void main(String[] args) {
		
	}

	public static void demo01() throws IOException {//读取控制台输入
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
		
	}
	
	
	public static void demo02() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		System.out.println("Please enter lines of text.");
		System.out.println("enter 'end' to quit." );
		
		do {
			str = br.readLine();
			System.out.println(str);
		}while( !str.equals("end"));
	}
	
	
	public static void fileInputStreamDemo() throws IOException {
//		FileInputStream
//		该流用于从文件读取数据，它的对象可以用关键字 new 来创建。
//
//		有多种构造方法可用来创建对象。
//
//		可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
//		
//		也可以使用一个文件对象来创建一个输入流对象来读取文件。我们首先得使用 File() 方法来创建一个文件对象：
		InputStream f = new FileInputStream("C:/java/hello");
		
		File f1 = new File("C:/java/hello");
		InputStream out = new FileInputStream(f1);
		
		 try {
	            byte bWrite[] = { 11, 21, 3, 40, 5 };
	            OutputStream os = new FileOutputStream("test.txt");
	            for (int x = 0; x < bWrite.length; x++) {
	                os.write(bWrite[x]); // writes the bytes
	            }
	            os.close();
	 
	            InputStream is = new FileInputStream("test.txt");
	            int size = is.available();
	 
	            for (int i = 0; i < size; i++) {
	                System.out.print((char) is.read() + "  ");
	            }
	            is.close();
	        } catch (IOException e) {
	            System.out.print("Exception");
	        }
	}
	
	
	public static void fileStreamTestDemo() throws IOException {
		
		File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建
 
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
 
        writer.append("中文输入");
        // 写入到缓冲区
 
        writer.append("\r\n");
        // 换行
 
        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
 
        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
 
        fop.close();
        // 关闭输出流,释放系统资源
 
        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象
 
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同
 
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流
 
        fip.close();
        // 关闭输入流,释放系统资源
	}
	
	
	public static void ioDemo() throws IOException {//创建目录
		
//		File类中有两个方法可以用来创建文件夹：
//		1.mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。
//		2.mkdirs()方法创建一个文件夹和它的所有父文件夹
		
		String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
	}
	
	public static void ioReadDir() throws IOException {//读取目录
		String dirname = "/tmp";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("目录 " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname + " 不是一个目录");
        }
	}
	
	public static void deleteFolder(File folder) throws IOException {//删除文件及目录
		
			File[] files = folder.listFiles();
			
	        if (files != null) {
	            for (File f : files) {
	                if (f.isDirectory()) {
	                    deleteFolder(f);
	                } else {
	                    f.delete();
	                }
	            }
	        }
	        folder.delete();
	}
}
