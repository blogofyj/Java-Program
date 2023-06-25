package Liaoxuefeng;

import java.math.BigDecimal;


public class Three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Bob", "Alice", "Grace"};
//		StringBuilder sb = new StringBuilder();
//		sb.append("Hello ");
//		for(String name : names){
//			sb.append(name).append(",");
//			
//		}
//		System.out.println(sb.length());
//		
//		sb.delete(sb.length() - 1, sb.length());
//		sb.append("!");
//		System.out.println(sb.toString());
//		BigDecimal d1 = new BigDecimal("123.450000");
//		System.out.println(d1.scale());
//		System.out.println(d1.stripTrailingZeros());
		Person people = new Person();
		people.setName("xiaoming");
		System.out.println(people.getName());
		people.setAnotherName("xiaoming" ,"lijun" , "liujuan");
		System.out.println(people.getAnotherName());
		
		
		
		
		
	}

}
class Person{
	private int age;
	private String name;
	private float score;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
//		this.name = name;
		if(name == null || name.isEmpty()){
			throw new IllegalArgumentException("invalid name");
		}
		this.name = name.trim();
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		if(age < 0 || age > 100){
			throw new IllegalArgumentException("invalid age");
		}
		this.age = age;
	}
	public float getScore(){
		return this.score;
	}
	public void setScore(float score){
		if(score < 0 || score > 100){
			throw new IllegalArgumentException("invalid score");
		}
		this.score = score;
	}
	private String[] names;
	public void setAnotherName(String... names){
		this.names = names;
	}
	private String s = "";
	public String getAnotherName(){
		for(int i = 0; i < names.length -1; i++ ){
			s = s + names[i] + ",";
		}
		return s + names[names.length-1];
//		return this.names[0] + " " + this.names[1] + " " + this.names[2];
	}
}
