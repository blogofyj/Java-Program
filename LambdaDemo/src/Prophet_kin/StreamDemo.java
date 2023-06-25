package Prophet_kin;
/**
 * Stream
 * ��ע������ʲô ��������ô��
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StreamDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		Collections.addAll(list, "Tom", "Ruby", "Kily", "Horton");
		
		list.stream()
				.filter(name -> name.startsWith("T"))
				.filter(name -> name.length() == 3)
				.forEach(name -> System.out.println(name));
	}
	
	//��ͳ���Ϲ��˷���
	public static void show01() {
		
		List<String> list = new ArrayList<>();
		
		Collections.addAll(list, "Tom", "Ruby", "Kily", "Horton");
		
		//�ҵ���T��ͷ������
		List<String> list2 = new ArrayList<String>();
		for (String str : list2) {
			if(str.startsWith("T")) {
				list2.add(str);
			}
		}
		//�ҵ���������Ϊ3��
		List<String> list3 = new ArrayList<>();
		for (String str : list3) {
			if(str.length() == 3) {
				list3.add(str);
			}
		} 
	}
}
