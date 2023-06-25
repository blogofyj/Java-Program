package GoogleSource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Demo05ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("KaiLa");
		list.add("July");
		list.add("KourHor");
		System.out.println(list);
		
		addRandomNum();
		
//		Demo05ArrayList.arrayListReturn innerclass = new Demo05ArrayList.arrayListReturn();
		Demo05ArrayList.arrayListReturn.selectSmallList();
	}

	public static void printArrayList(ArrayList<String> list) {//按指定格式打印
		System.out.println("{");
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (i == list.size() -1 ) {
				System.out.println(name + "}");
			} else {
				System.out.print(name + "@");
			}
		}
	}
	
	public static void addRandomNum() {//添加随机数字
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int num = new Random().nextInt(10) + 1;
//			boolean add = new ArrayList<>().add(num);
			list.add(num);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer num1 = (Integer) iterator.next();
			System.out.println(num1); 
		}
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	
	public static void addArrayListStudent() {//添加Student类
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Tom", 19));
		//or
//		Student one = new Student("Tom", 19);
//		list.add(one);
		
		for (int i = 0; i < list.size(); i++) {
//			 Student stu = list.get(i);
//			 System.out.println("Name: " + stu.getName() + "Age: " + stu.getAge());
			System.out.println("Name: " + list.get(i).getName() + "Age: "+ list.get(i).getAge());
		}
	}
	
	
//	public static void arrayListReturn() {
//		ArrayList<Integer> bigList = new ArrayList<>();
//		
//	}
//	
	
	//内部类的调用方法
//	Demo05ArrayList.arrayListReturn innerclass = new Demo05ArrayList.arrayListReturn();
	
	
	
	//static修饰类只能在内部类中
	public static class arrayListReturn{
		public arrayListReturn() {
			System.out.println("这是一个内部类arrayListReturn");
		}
		
		public static void selectSmallList() {
			ArrayList<Integer> bigList = new ArrayList<>();
			Random random = new Random();
			for (int i = 0; i < bigList.size(); i++) {
				int num = random.nextInt(100) + 1;
				bigList.add(num);
			}
			
			ArrayList<Integer> smallList = getSmallList(bigList);
			for (int i = 0; i < smallList.size(); i++) {
				System.out.println(smallList.get(i)); 
			}
		}
		
		public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
			ArrayList<Integer> smallList = new ArrayList<>();
			for (int i = 0; i < bigList.size(); i++) {
				int num = bigList.get(i);
				if (num % 2 == 0) {
					smallList.add(num);
				}
			}
			return smallList;
		}
		
	}
}
 

class Student{
	private int age;
	private String name;
	public Student(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 
}
