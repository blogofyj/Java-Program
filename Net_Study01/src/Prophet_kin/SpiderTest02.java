package Prophet_kin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/*
 * ���棺
 * 1.URL
 * 2.����
 * (���� + ģ�������)���������еĶ���ץȡ��������Ҫģ�������
 */

public class SpiderTest02 {

	public static void main(String[] args) throws Exception {
		//��ȡURL
		URL url = new URL("https://www.dianping.com");
		//������Դ
		
		//����һ��������
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		
		//ģ�������		͵͵��ƭ�����������Ϊ�����������
		conn.setRequestMethod("GET");//get ��  post ����
		
		conn.setRequestProperty("User-Agent ","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.116 Safari/537.36");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		
		String msg = null;
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
		
		br.close();
		
		//����
		//����
	}
}
