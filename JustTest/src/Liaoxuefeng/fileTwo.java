package Liaoxuefeng;
import java.io.*;

public class fileTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*File f = new File("..");
		if(!f.exists()){
			f.getParentFile().mkdir();
		}
		try{
			f.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}*/
		
		
//		byte[] data = {89, 39, 19, 127, 2};
//		try(InputStream input = new FileInputStream(data)){
//			int n;
//			while((n = input.read()) != -1){
//				System.out.println((char)n);
//			}
//		}
		
//		String s;
//		try(InputStream input = new FileInputStream("..")){
//			int n;
//			StringBuilder sb = new StringBuilder();
//			while((n = input.read()) != -1){
//				sb.append((char)n);
//			}
//			s = sb.toString();
//		}
//		System.out.println(s);
		
		String s;
		try(InputStream input = new FileInputStream("..")){
			s.readAsString(input);
		}
		
		
	}
	
	//����һ�����ĺ���
	public static String readAsString(InputStream input) throws IOException{
		int n;
		StringBuilder sb = new StringBuilder();
		while((n = input.read()) != -1){
			sb.append((char)n);
		}
		return sb.toString();
	}

	public void readFile() throws IOException{
		InputStream input = null;
		try{
			input = new FileInputStream("src\\" +
					"readme.txt");
			int n;
			while((n = input.read()) != -1){
				System.out.println(n);
			}
		}finally{
			if(input != null ){
				input.close();
			}
		}
		
		//or---try(resource)
		/*try(InputStream input = new FileInputStream("..")){
			int n;
			while((n = input.read()) != -1){
				System.out.println(n);
			}
		}*/
		
	}
	//�ļ����������
	public void fileOutputStream(){
		File file = new File("..");
		FileOutputStream out = null;
		try{
			if(!file.exists()){
				//�õ��ϼ�Ŀ¼
				file.getParentFile().mkdir();
				file.createNewFile();
			}
			//�����ļ������
			out = new FileOutputStream(file);
			//���ַ���ת�����ֽ�
			byte[] byteArr = "FileInputStream Test".getBytes();
			out.write(byteArr);
			out.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}


