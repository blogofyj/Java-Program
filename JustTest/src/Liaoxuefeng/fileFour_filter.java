package Liaoxuefeng;
import java.io.*;

public class fileFour_filter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] data = "hello, world!".getBytes("UTF-8");
		try(CountInputStream input = new CountInputStream(new ByteArrayInputStream(data))){
			int n;
			while((n = input.read()) != -1){
				System.out.println((char)n);
			}
			System.out.println("Total read " + getBytesRead() + "bytes");
		}
	}

}

class CountInputStream extends FilterInputStream{
	private int count = 0;
	
	CountInputStream(InputStream in){
		super(in);
	}
	
	public int getBytesRead(){
		return this.count;
	}
	
	public int read() throws IOException {
		int n = in.read();
		if(n != -1){
			this.count++;
		}
		return n;
	}
	
	public int read(byte[] b, int off, int len) throws IOException {
		int n = in.read(b, off, len);
		this.count += n;
		return n;
	}
}