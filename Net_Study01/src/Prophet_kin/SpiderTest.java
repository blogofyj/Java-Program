package Prophet_kin;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
/*
 * ���棺
 * 1.URL
 * 2.����
 * 
 * html:�Ǽ�		css:����		js:��̬(����ʹjava�����ܹ�������)
 * 
 * InputStreamReader:���ֽڵ��ַ�������
 * 
 * 1.InputStream  OutputStream �ֽ���
 * 2.Writer  Reader �ַ���
 *  ֵ��˵�����ǣ��������ֵȼ������£�����һ������
	InputStreamReader��OutputStreamWriter�������InputStream��Reader���������OutputStream��Writer�����䡣
	��inputStreamReader(inputStream);����reader���ַ���
	
	reader = new InputStreamReader��new FileInputStream��File file����
	
	BufferedReader br = new BufferedReader(new FileReader("abc.txt"))
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(OutputStream os))
 */

public class SpiderTest {

	public static void main(String[] args) throws Exception {
		//��ȡURL
		URL url = new URL("https://www.baidu.com/");
		//������Դ
		InputStream is = url.openStream();
		//�ֽ������ַ���Ҫת��һ��
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		
		String msg = null;
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
		
		br.close();
		
		//����
		//����
	}
}
