package NetStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class LiaoTcpServer01 {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(6666);
		System.out.println("server is running");
		
		for(;;) {//�÷�����һֱ���ּ���״̬
			Socket socket = server.accept();
			System.out.println("Connected from:" + socket.getRemoteSocketAddress());
			
			Thread t = new Handler(socket);//�����̣߳���ߴ���Ч��
			t.start();
		}
	}
}
class Handler extends Thread{
	Socket socket;
	
	public Handler(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try(InputStream input = this.socket.getInputStream()){
			try(OutputStream output = this.socket.getOutputStream()){
				handle(input, output);
			}
		} catch (Exception e) {
			try {
				this.socket.close();
			} catch(IOException e2) {
				
			}
			System.out.println("Client disconnected");
		}
	}
	
	private void handle (InputStream input, OutputStream output) throws IOException {//�ֽڵĶ�д����
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
		writer.write("hello\n");
		writer.flush();
		
		for(;;) {
			String s = reader.readLine();//��һ��
			if(s.equals("bye")) {
				writer.write("bye\n");
				writer.flush();
				break;
			}
			writer.write("Ok: " + s + "\n");
			writer.flush();
		}
	}
}
