package Prophet_kin;

import java.io.InputStream;

/*
 * 值得说明的是，在这两种等级机构下，还有一道桥梁
	InputStreamReader、OutputStreamWriter负责进行InputStream到Reader的适配和由OutputStream到Writer的适配。
	
	1. InputStreamReader 是字节流通向字符流的桥梁

 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
    2. OutputStreamWriter 是字符流通向字节流的桥梁

  Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
  

FileInputStream		FileOutputStream

  1.FileReader构造方法
FileReader(File file) 
创建一个新的 FileReader ，给出 File读取。  
FileReader(FileDescriptor fd) 
创建一个新的 FileReader ，给定 FileDescriptor读取。  
FileReader(String fileName) 
创建一个新的 FileReader ，给定要读取的文件的名称。  

  2.FileWriter构造方法
FileWriter(File file) 
给一个File对象构造一个FileWriter对象。  
FileWriter(File file, boolean append) 
给一个File对象构造一个FileWriter对象。  
FileWriter(FileDescriptor fd) 
构造与文件描述符关联的FileWriter对象。  
FileWriter(String fileName) 
构造一个给定文件名的FileWriter对象。  
FileWriter(String fileName, boolean append) 
构造一个FileWriter对象，给出一个带有布尔值的文件名，表示是否附加写入的数据。 

	FileWriter<--OutputStreamWriter<--Writer
	FileOutputStream<--OutputStream
	
	FileReader<--InputStreamReader<--Reader
	FileInputStream<--InputStream
	
 */

public class OutputStreamWriter_InputStreamReader {

	public static void main(String[] args) {
		
	}
}
class Demo1 {
    /**
     * 从控制台输入后写入文件
     */
    public static void main(String[] args) {

        // 创建字节流对象 System.in 代表从控制台输入
        InputStream in = System.in;
        // 创建字符流对象
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            // 实例化字符流对象 通过 InputStreamReader 将字节输入流转化成字符输入流
            br = new BufferedReader(new InputStreamReader(in));
            bw = new BufferedWriter(new FileWriter("a.txt"));
            // 定义读取数据的行
            String line = null;
            // 读取数据
            while ((line = br.readLine()) != null) {
                // 如果输入的是"exit"就退出
                if("exit".equals(line)){
                    break;
                }
                // 将数据写入文件
                bw.write(line);
                // 写入新的一行
                bw.newLine();
                // 刷新数据缓冲
                bw.flush();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // 释放资源
            try {
                if(bw != null)
                    bw.close();
                if (br != null)
                    br.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

public class Demo2 {

    /**
     * 读取文件输出到控制台
     */
    public static void main(String[] args) {

        // 定义字节输出流的对象
        OutputStream out = System.out;
        // 定义字节流的对象
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            // 实例化字节输出流 使用
            bw = new BufferedWriter(new OutputStreamWriter(out));
            br = new BufferedReader(new FileReader("a.txt"));
            // 定义读取行的字符串
            String line = null;
            // 读取数据
            while ((line = br.readLine()) != null) {
                // 输出到控制台
                bw.write(line);
                // 新的一行 
                bw.newLine();
                // 刷新缓冲
                bw.flush();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // 释放资源
            try {
                if(bw != null)
                    bw.close();
                if (br != null)
                    br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
