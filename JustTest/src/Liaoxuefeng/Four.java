package Liaoxuefeng;
public class Four{
	public static void main(String[] args){
		Student s = new Student("xiao ming", 12, 89);
		Person p = new Student();
		
		if(p instanceof Student){
			Student ss = (Student) p;
		}
		Object obj = "Hello";
		if(obj instanceof String){
			String b = (String) obj;
			System.out.println(b.toUpperCase());
		}
	}
}
class Person{
	protected String name;
	protected int  age;
	
	public Person(){
		
	}
	public Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
}
class Student extends Person{
	protected int score;
	
	public Student(){
		
	}
	public Student(String name, int age, int score){
		super(name,age);
		this.score = score;
	}
	public int getScore(){
		return this.score;
	}
}
class PrimaryStudent extends Student{
	protected int grade;
	public PrimaryStudent(){
		
	}
	public PrimaryStudent(String name, int age, int score, int grade){
		super(name,age,score);
		this.grade = grade;
	}
	public int getGrade(){
		return this.grade;
	}
	
	
	
	
}