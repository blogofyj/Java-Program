package GoogleSource;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>() {
			{
				add("Hello");
				add("the");
				add("World");
			}
		};
		
		//forEach
		for (String string : list) {
			System.out.println(string);
		}
		
		
		//Iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//change list to array
		String[] listarray = new String[list.size()];
		list.toArray(listarray);
//		Object[] a = list.toArray(); 		can't convert Object[] to String[];
		for (int i = 0; i < listarray.length; i++) {
			System.out.println(listarray[i]);
		}
 		
	}

}
