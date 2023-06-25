package Prophet_kin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * java.util.Properties����extends Hashtable<k, v> implements Map<k, v>
 * 
 * Properties���ʾһ���־õ����Լ��������Ա��������л�����м���
 * 
 * properties������һ��Ψһ��IO�����ϵļ���
 * 		����ʹ��properties�����е� store�������Ѽ����е���ʱ���ݣ��־û�д�뵽Ӳ���д洢
 * 		����ʹ��properties�����еķ���load����Ӳ���б�����ļ�����ֵ�ԣ� ����������ʹ��
 * �����б���ÿ���������Ӧ��ֵ���� һ��  �ַ��� 
 * properties��˫�м��ϣ�key ,value�� �����ַ���
 * 
 * properties����һЩ�����ַ��������з���
 * 		object setProperty(String key, String value) ����Hashtable�ķ��� put
 * 		String getProperty(String key) �ҵ�valueֵ�� �ȼ���Map��get(key)
 * 		Set<String> stringPropertyNames() ���ش������б�ļ������ü������Ӧ��ֵ���ַ���
 */

public class PropertiesDemo {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("Tom", "middle school");
		
		Set<String> set = prop.stringPropertyNames();
		
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key + " " + value);
		}
	}
	
	
	/*
	 * 1.����properties���϶����������
	 * 2.�����ֽ������/�ַ���������� ���췽���а�Ҫ�����Ŀ�ĵ�
	 * 3.ʹ��properties�����еķ���store���Ѽ����е���ʱ���ݣ��־û�д�뵽Ӳ����
	 * 4.�ͷ���Դ
	 */
	public static void show01() throws IOException {
		
		Properties prop = new Properties() {
			{
				setProperty("Tom", "Middle school");
				setProperty("Lily", "High school");
				setProperty("Lisa", "Junior school");
			}
		};
		
		FileWriter fw = new FileWriter(".");
		
		prop.store(fw, "save data");
		
		fw.close();
		
		//�ֽ��������ġ�������
		prop.store(new FileOutputStream("."), "save data");
	}
	
	
	/*
	 * Load����
	 * 1.����properties���϶���
	 * 2.ʹ��Load��������ȡ�����ֵ���ļ�
	 * 3.����properties����
	 * 	ע�⣺�洢��ֵ�Ե��ļ��У�����ֵĬ�ϵ����ӷ��ſ���ʹ��=���ո��������ţ�
	 * 		�洢��ֵ�Ե��ļ��У�������# ����ע�ͣ������ٱ���ȡ
	 * 		�洢��ֵ�Ե��ļ��У�����ֵĬ�϶����ַ����������ټ�����
	 */
	public static void show02() throws FileNotFoundException, IOException {
		 
		Properties prop = new Properties();
		
		prop.load(new FileReader("."));
		
		Set<String> set = prop.stringPropertyNames();
		
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key + " " + value);
		}
	}
}
