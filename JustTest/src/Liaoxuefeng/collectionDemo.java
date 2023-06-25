package Liaoxuefeng;

import java.util.Collections;
import java.util.List;

public class collectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Collections.emptyList();
		//Collections.emptyMap
		//Collections.emptySet
		
		List<String> list2 = (List<String>) Collections.singleton("apple");
		
		Collections.sort(list);
		
		Collections.shuffle(list2);
		
		List<String> mutable = new ArrayList<>();
		mutable.add("apple");
		mutable.add("pear");
		
		List<String> immutable = Collections.unmodifiableList(mutable);
		immutable.add("orange");
		
		
		
		
		
	}

}
