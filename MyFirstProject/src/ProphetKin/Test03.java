package ProphetKin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Vector;
import java.util.stream.Stream;

/**
 * Byte Character Integer Long Float Double
 * Short Boolean 
 * @author asus
 *
 */
public class Test03 {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.addAll(new ArrayList<Integer>() {
			{
				add(2);
				add(3);
			}
		});
		
		vector.forEach(i -> System.out.println(i));
		vector.forEach(System.out::println);
		
		Iterator<Integer> it = vector.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
			it.forEachRemaining(i -> System.out.println(i));
		}
		
		vector.stream()
			.filter(x -> x > 2)
			.distinct()
			.forEach(System.out::println);
		
		Stream<Integer> stream = vector.parallelStream();
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		list.parallelStream().forEach(System.out::println);//���д�����������
		list.parallelStream().forEachOrdered(i -> System.out.println(i));//�����ӡ
		
		/*
		 * ���ڱ����ͷ���ԴԪ�صĶ���Spliterator���ǵ�Ԫ��Դ���������飬 ����Collection��IOͨ��������������
		 * �ɲ�ֵ���������splitable iterator��
		 * ��Iteratorһ����SpliteratorҲ���ڱ�������Դ�е�Ԫ�أ�������Ϊ�˲���ִ�ж���Ƶ�
		 * Spliterator���Ե�������Ԫ�أ�tryAdvance()��������˳�����Ԫ�أ�forEachRemaining()����
			Spliterator�����Խ�����һЩԪ�أ�ʹ��trySplit()�����з�����Ϊ��һ��Spliterator�������ڿ��ܲ��еĲ�����
			ʹ���޷���ֵ�Spliterator���Ը߶Ȳ�ƽ����Ч�ķ�ʽ���в�����̫���ܴӲ����������档�����Ͳ��������Ԫ��;
			ÿ��Spliterator���Ե��������������á�
		 */
		Spliterator<Integer> sl = list.spliterator();
		sl.tryAdvance(System.out::println);
		sl.forEachRemaining(i -> System.out.println(i));
		
		Enumeration<Integer> elements = vector.elements();
		while(elements.hasMoreElements()) {
			Integer nextElement = elements.nextElement();
			
		}
		
	}
}
