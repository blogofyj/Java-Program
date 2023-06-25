package GoogleSource;

/*接口与类的区别：
	接口不能用于实例化对象。
	接口没有构造方法。
	接口中所有的方法必须是抽象方法。
	接口不能包含成员变量，除了 static 和 final 变量。
	接口不是被类继承了，而是要被类实现。
	接口支持多继承。
接口特性
	接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）。
	接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（并且只能是 public，用 private 修饰会报编译错误）。
	接口中的方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法。
抽象类和接口的区别
	1. 抽象类中的方法可以有方法体，就是能实现方法的具体功能，但是接口中的方法不行。
	2. 抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是 public static final 类型的。
	3. 接口中不能含有静态代码块以及静态方法(用 static 修饰的方法)，而抽象类是可以有静态代码块和静态方法。
	4. 一个类只能继承一个抽象类，而一个类却可以实现多个接口。
*/
public class interfaceDemo {
	
	public static void main(String[] args) {
		Example demo = new Example("Tom", 18);
		System.out.println(demo.showName() + "'s id is: " + demo.showId());
	}

}
abstract interface DemoOfInterface{
	//没有构造方法
	public static final int num = 3;	//变量定义方法
	
	public abstract String showName();	//定义方法
	
	int showId();
}

class Example implements DemoOfInterface{
	
	private String name;
	private int id;

	public Example(String name, int id) {
//		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String showName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int showId() {
		// TODO Auto-generated method stub
		return id;
	}
	
}