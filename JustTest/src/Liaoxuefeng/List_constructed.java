package Liaoxuefeng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class List_constructed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//method one
		
		//List<Integer> list = new ArrayList(java.util.Arrays.asList(1, 2, 3));
		
		//method two
		/*List<Integer> list = new ArrayList(){
			{
				this.add(1);
				add(2);
				add(3);
				add(4);
			}
		};*/
		//list.forEach(System.out::println);  java8µÄÌØÐÔ
		//method three;
		/*ArrayList<Integer> obj = new ArrayList();
		List list = Arrays.asList('1','2','3');
		obj.addAll(list);
		*/
		List<String> list = Arrays.asList("A", "B", "C");
		System.out.println(list.contains("C"));
		System.out.println(list.indexOf("C"));
		
		System.out.println(list.contains(new String("C")));
		
		//List<Person> list1 = new ArrayList(Arrays.asList(new Person("xiaoming")));
		
		List<Person1> list1 = new ArrayList<Person1>(){
			{
				new Person1("xiaoming");
				new Person1("xiaohong");
				new Person1("bob");
			}
		};
		String[] str = list1.toArray(new String[list1.size()]);
		//another method
		//Object[] array = list1.toArray();
 		for(String name : str){
			System.out.println(name);
		}
 		
 		for(Person1 people : list1){
 			System.out.println(people);
 		}
 		//method of output
 		for(java.util.Iterator<Person1> per = list1.iterator(); per.hasNext();){
 			Person1 s = per.next();
 			System.out.println(s);
 			
 		}
	}

}
class Person1{
	String name;
	public Person1(String name){
		this.name = name;
	}
}
