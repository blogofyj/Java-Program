package GoogleSource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class ComparatorDemo {
	
//	public static String toString(StudentOne c) {
//		return c.getName() + c.getAge() + c.getScore();
//	}
	
	public static void main(String[] args) {
		
		showComparatorDemo();
		
		StudentOne[] stu = {
				new StudentOne("Tom", 18, 89.0f),
				new StudentOne("Dump", 20, 90.0f),
				new StudentOne("Yumili", 20, 98.0f),
				new StudentOne("Kailiy", 21, 90.0f)
		};
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].getName() + " " + stu[i].getAge() + " " + stu[i].getScore());
		}
		Arrays.sort(stu, new StudentOneComparator());
		
		for (StudentOne one : stu) {
//			System.out.println(one.getName() + " " + one.getAge() + " " + one.getScore());
			
			/*------重！！！-------*/
			System.out.println(one);
		}
		
	}
	
	public static void showComparatorDemo() {
		List<StudentOne> list = new ArrayList<StudentOne>() {
			{
				add(new StudentOne("小明", 22));
				add(new StudentOne("小军", 19));
				add(new StudentOne("小丽", 21));
			}
		};
		
		//------------------重----------------//
		Collections.sort(list, new Comparator<StudentOne>() {

			@Override
			public int compare(StudentOne o1, StudentOne o2) {
				// TODO Auto-generated method stub
				if (o1.getAge() == o2.getAge()) {
					return o1.getName().compareTo(o2.getName());
				} else {
					
					return o1.getAge() - o2.getAge();
				}
			}
			
		});
		for (StudentOne studentOne : list) {
			System.out.println(studentOne.getName() + " " + studentOne.getAge());
		}
		
	}
}

class StudentOneComparator implements Comparator<StudentOne>{

	@Override
	public int compare(StudentOne o1, StudentOne o2) {
		// TODO Auto-generated method stub
		if (o1.getScore() > o2.getScore()) {
			return -1;
		}else if(o1.getScore() < o2.getScore()) {
			return 1;
		}else {
			if (o1.getAge() > o2.getAge()) {
				return 1;
			} else if(o1.getAge() < o2.getAge()){
				return -1;
			}else {
				return 0;
			}
		}
	}
	
}

class StudentOne{
	
	private String name;
	private int age;
	private float score;
	
	
	public StudentOne(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public StudentOne(String name, int age, float score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public String toString() {
		return name + " " + age + " " + score;
	}
	
}