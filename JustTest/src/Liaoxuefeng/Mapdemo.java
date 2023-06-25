package Liaoxuefeng;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Mapdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>(){
			{
				new Student("Bob", 78);
				new Student("Alice", 85);
				new Student("Brush", 66);
				new Student("Newton", 99);
			}
		};
			Students holder = new Students(list);
			
			System.out.println(holder.getScore("Bob") == 78 ? "≤‚ ‘≥…π¶" : "≤‚ ‘ ß∞‹");
			System.out.println(holder.getScore("Alice") == 85 ? "≤‚ ‘≥…π¶!" : "≤‚ ‘ ß∞‹!");
	        System.out.println(holder.getScore("Tom") == -1 ? "≤‚ ‘≥…π¶!" : "≤‚ ‘ ß∞‹!");
		}
}
class Students{
	List<Student> list;
	Map<String, Integer> cache;
	
	Students(List<Student> list){
		this.list = list;
		cache = new HashMap();
	}
	//find in map
	int getScore(String name){
		Integer score = this.cache.get(name);
		if(score == null){
			return -1;
		}
		return score == null ? -1 : score.intValue();
	}
	//find in list
	Integer findInList(String name){
		for (Student ss : this.list) {
			if(ss.name.equals(name)){
				return ss.score;
			}
		}
		return null;
	}
}

class Student{
	String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
}
