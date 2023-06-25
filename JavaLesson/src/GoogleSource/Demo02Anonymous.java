package GoogleSource;

import java.util.Scanner;

public class Demo02Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "Tom";
		p.showName();
		System.out.println("========================");
		
		//Anonymous class
		new Person().name = "Lily";
		new Person().showName();//My name is null ,匿名对象只能使用唯一一次 
		
		int num = new Scanner(System.in).nextInt(); 
		
		Scanner sc = new Scanner(System.in);
		methodParam(sc);//使用一般写法传入参数
		
		methodParam(new Scanner(System.in));//使用匿名对象来传参
		
		Scanner scc = methodReturn();
		int num1 = scc.nextInt();
		System.out.println("The num of input is :" + num1);
	}
	
	public static void methodParam(Scanner sc) {
		int num = sc.nextInt();
		System.out.println("The num of input is :" + num);
	}

	public static Scanner methodReturn() {
		return new Scanner(System.in);
	}
}


class Person{
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void showName() {
		System.out.println("My name is " + name);
	}
}