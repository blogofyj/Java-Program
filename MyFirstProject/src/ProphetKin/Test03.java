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
		list.parallelStream().forEach(System.out::println);//并行处理，可能无序
		list.parallelStream().forEachOrdered(i -> System.out.println(i));//有序打印
		
		/*
		 * 用于遍历和分区源元素的对象。Spliterator覆盖的元素源可以是数组， 集合Collection，IO通道或生成器函数
		 * 可拆分迭代器”（splitable iterator）
		 * 和Iterator一样，Spliterator也用于遍历数据源中的元素，但它是为了并行执行而设计的
		 * Spliterator可以单独遍历元素（tryAdvance()）或批量顺序遍历元素（forEachRemaining()）。
			Spliterator还可以将它的一些元素（使用trySplit()）进行分区作为另一个Spliterator，以用于可能并行的操作。
			使用无法拆分的Spliterator或以高度不平衡或低效的方式进行操作不太可能从并行性中受益。遍历和拆分至用完元素;
			每个Spliterator仅对单个批量计算有用。
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
