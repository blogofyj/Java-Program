package GoogleSource;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo07StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("the ");
		sb.append("beautiful ");
		sb.append("world!");
		System.out.println(sb);
		
		List<String> str = new ArrayList<String>() {
			{
				add("hi");
				add("boy");
			}
		};
		System.out.println(str);
		str.add("Morning");
//		
//		for (String string : str) {
//			System.out.print(string + " ");
//		}
//		System.out.println();
//		
//		for (Iterator<String> iterator = str.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
//		
//		for (int i = 0; i < str.size(); i++) {
//			String j = str.get(i);
//			System.out.println(j);
//		}
		
		str.remove(1);//删掉
		System.out.println(str);
		
		str.set(1, "Bigo");//重置
		System.out.println(str);
		
		sb = new StringBuffer(new Scanner(System.in).nextLine());
		
		
		
		
//		System.out.println(sb.charAt(1));
//		
//		System.out.println(sb.indexOf("the"));
//		
//		System.out.println(sb.length());
//		
//		System.out.println(sb.substring(6));
//		
//		System.out.println(sb.delete(6, 9));
//		
//		System.out.println(sb.deleteCharAt(0));
//		
//		System.out.println(sb.insert(22, 999));
//		
//		System.out.println(sb.reverse());
//		
//		System.out.println(sb.capacity());
//		
//		System.out.println(sb.reverse().toString());
//		
//		sb.trimToSize();
	}
	
	public static int binaryFind(int[] num, int value) {
		int min = 0;
		int max = num.length - 1;
		int mid = (min + max) / 2;
		while(num[mid] != value) {
			if(num[mid] < value) {
				min += 1;
			}
			else if(num[mid] > value) {
				max -= 1;
			}
			mid = (min + max) / 2;
			if(min > max) {
				return -1;
			}
		}
		return mid;
	}
	
//	public static void showSort() {
//		List<User> userList = new ArrayList<User>();
//		           buildData(userList);
//		           for(User u : userList){
//		                System.out.println(u.toString());
//		           }
//		           System.out.println("<-----------我是华丽的分割线------------>");
	
	
//		
//		           userList.sort(new Comparator<User>(){
//		                @Override
//		                public int compare(User arg0, User arg1) {
//		                     //这里是根据ID来排序，所以它为空的要剔除掉
//		                     if(arg0.getId()==null || arg1.getId()==null) return 0;
//		                     
//		                     return arg0.getId().compareTo(arg1.getId());//这是顺序
//		                }               
//		           });  
	
	
//		
//		           for(User u : userList){
//		                System.out.println(u.toString());
//		           }
//		
//	}
//}



class User{
	private int id;

	public User(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
