package Liaoxuefeng;

import java.io.*;
//import java.io.OutputStream;

public class fileStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			byte by[] = { 11, 21, 3, 40, 5 };
			OutputStream os = new FileOutputStream("test.txt");
			for(int x = 0; x < by.length; x++){
				os.write(by[x]);
			}
			os.close();
			
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			
			for(int i = 0; i < size; i++ ){
				System.out.print((char) is.read() + " ");
			}
			is.close();
		}catch (IOException e){
			System.out.print("Exception");
		}
	}

}
