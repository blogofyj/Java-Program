package GoogleSource;

/*1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。

2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。

3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。

4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。

5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。*/

public class AbstractDemo {
	
	public static void main(String[] args) {
		
	}

}

abstract class Employee{
	private String name;
	private String address;
	private int number;
	
	public abstract double computePay();
	//Abstract 关键字同样可以用来声明抽象方法，抽象方法只包含一个方法名，而没有方法体
	
}

//如果一个类包含抽象方法，那么该类必须是抽象类。
//任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
//继承抽象方法的子类必须重写该方法。否则，该子类也必须声明为抽象类。
//最终，必须由子类实现该抽象方法，否则，从最初的父类到最终的子类都不能用来实例化对象。
class Salary extends Employee{

	private double salary;
	
	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		System.out.println("Compute salary pay for ");
		return 0;
	}
	
}
