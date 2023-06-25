package GoogleSource;

import java.util.List;

public class FanxinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new Double[] {2.1, 4.56, 56.4});
		
		try {
		String a = maxNum(new String("hello"), new String("the"), new String("world"));
		int b = maxNum(Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(2));
		int c = maxNum(Integer.parseInt("42"), Integer.parseInt("56"), Integer.parseInt("29"));
		System.out.println(a + " " + b + " " + c);
		
		double d = maxNum(new Double(10.1).doubleValue(), new Double(10.1), new Double(10.1));
		System.out.println(d);
		maxNum(new Integer(3), new Integer(5), new Integer(1));
		maxNum(new Character('a'), new Character('h'), new Character('d'));
		maxNum("bear", "apple", "banana");
		}catch(Exception e) {
			System.out.println("Some error had happen!");
		}
	}
	
	//泛型方法
	public static <E> void printArray(E[] inputArray) {
		for (E e : inputArray) {
			System.out.println(e);
		}
		System.out.println();
	}

	//有界的类型参数(泛型方法)
	//Comparable 1.equals方法	2.comparaTo()方法
	public static <T extends Comparable<T>> T maxNum(T x, T y, T z) {//<T extends A & B & C>
		T max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
	
	//泛型参数
	public static void getNum(List<?> nums) {
		System.out.println(nums.get(0));
	}
	public static void getBigNum(List<? extends Number> data) {//只能是Number的子类
		System.out.println(data.get(0));
	}
	
	public static void getSmallNum(List<? super Number> data) {//只能接受Number及三层父类
		System.out.println(data.get(0));
	}
	
//	interface Collection<V> {
//		boolean addAll(Collection<? extends V>);
//		}
	
//	public static<T> List<T> getRecords(Class<T> c, Selector s) {
//		// Use Selector to select rows
//		List<T> list = new ArrayList<T>();
//		for (/* iterate over results */) {
//		    T row = c.newInstance();
//		    // use reflection to set fields from result
//		    list.add(row); 
//		}
//		return list;
//		}
	
//	public class Collections { 
//		public static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type ) { 
//		    return new CheckedCollection<E>(c, type); 
//		}
//		private static class CheckedCollection<E> implements Collection<E> { 
//		    private final Collection<E> c; 
//		    private final Class<E> type;
//		    CheckedCollection(Collection<E> c, Class<E> type) { 
//		      this.c = c; 
//		      this.type = type; 
//		    }
//		    public boolean add(E o) { 
//		      if (!type.isInstance(o)) 
//		        throw new ClassCastException(); 
//		      else
//		        return c.add(o); 
//		    } 
//		} 
//		}
 }

//泛型类
class Car<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	/**
	 * Car<String> car1 = new Car<String>();
	 * baoshijie.setT(new String("pajiani"));
	 */
}