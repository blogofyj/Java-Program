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

	public static void demo01() throws IOException {//��ȡ����̨����
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char c;
        // ʹ�� System.in ���� BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�����ַ�, ���� 'q' ���˳���");
        // ��ȡ�ַ�
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
//		�������ڴ��ļ���ȡ���ݣ����Ķ�������ùؼ��� new ��������
//
//		�ж��ֹ��췽����������������
//
//		����ʹ���ַ������͵��ļ���������һ����������������ȡ�ļ���
//		
//		Ҳ����ʹ��һ���ļ�����������һ����������������ȡ�ļ����������ȵ�ʹ�� File() ����������һ���ļ�����
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
        // ����FileOutputStream����,�ļ������ڻ��Զ��½�
 
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // ����OutputStreamWriter����,��������ָ������,Ĭ��Ϊ����ϵͳĬ�ϱ���,windows����gbk
 
        writer.append("��������");
        // д�뵽������
 
        writer.append("\r\n");
        // ����
 
        writer.append("English");
        // ˢ�»����,д�뵽�ļ�,��������Ѿ�û��д���������,ֱ��closeҲ��д��
 
        writer.close();
        // �ر�д����,ͬʱ��ѻ���������д���ļ�,���������ע�͵�
 
        fop.close();
        // �ر������,�ͷ�ϵͳ��Դ
 
        FileInputStream fip = new FileInputStream(f);
        // ����FileInputStream����
 
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // ����InputStreamReader����,������д����ͬ
 
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // ת��char�ӵ�StringBuffer������
        }
        System.out.println(sb.toString());
        reader.close();
        // �رն�ȡ��
 
        fip.close();
        // �ر�������,�ͷ�ϵͳ��Դ
	}
	
	
	public static void ioDemo() throws IOException {//����Ŀ¼
		
//		File���������������������������ļ��У�
//		1.mkdir( )��������һ���ļ��У��ɹ��򷵻�true��ʧ���򷵻�false��
//		2.mkdirs()��������һ���ļ��к��������и��ļ���
		
		String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        // ���ڴ���Ŀ¼
        d.mkdirs();
	}
	
	public static void ioReadDir() throws IOException {//��ȡĿ¼
		String dirname = "/tmp";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Ŀ¼ " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " ��һ��Ŀ¼");
                } else {
                    System.out.println(s[i] + " ��һ���ļ�");
                }
            }
        } else {
            System.out.println(dirname + " ����һ��Ŀ¼");
        }
	}
	
	public static void deleteFolder(File folder) throws IOException {//ɾ���ļ���Ŀ¼
		
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
