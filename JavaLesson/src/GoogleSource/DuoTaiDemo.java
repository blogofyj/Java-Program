package GoogleSource;

public class DuoTaiDemo {

	public static void main(String[] args) {
		
		show(new Cat());
		show(new Dog());
		
		Animal a = new Cat();//upcasting 子类转化为父类
		a.eat();
		
		Cat c = (Cat) a;//downcasting 将父类转化为子类
		c.work();
		
	}
	
	public static void show(Animal a) {
		a.eat();
		//类型判断
		if (a instanceof Cat) {//猫做的事
			Cat c = (Cat) a;
			c.work();
		}
		else if(a instanceof Dog) {//狗做的事
			Dog c = (Dog) a;
			c.work();
		}
	}
	
	
	
//	Java 中的instanceof 运算符是用来在运行时指出对象是否是特定类的一个实例
//	instanceof通过返回一个布尔值来指出，这个对象是否是这个特定类或者是它的子类的一个实例。 
//	result = object instanceof class
//	如果 object 是 class 的一个实例，则 instanceof 运算符返回 true。
//	如果 object 不是指定类的一个实例，或者 object 是 null，则返回 false。
	static {
		String str="123";
        Long a=1L;
        
        int b =a instanceof Long?1:2;
        System.out.println(b);	//1
        
        if(str instanceof String){
            System.out.println(str);
        }
        
        if(a instanceof Long){
            System.out.println(a);
        }
	}
	
}

abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating fish");
	}
	
	public void work() {
		System.out.println("Catching mouse");
	}
	
}

class Dog extends Animal{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating bone");
	}
	
	public void work() {
		System.out.println("Guarding house");
	}
	
}

/*-------------------------向上向下转型-------------------------------*/
//	经过了这个过程，子类实例已经赋值给了父类引用（即完成了向上转型），但很遗憾的丢失了子类扩展的方法。 
//	很好的是Java语言有个向下转型的特性，让我们可以重新获得丢失的方法，即强转回子类 
//	所以我们需要用到子类实例的时候，就从那个父类集合里拿出来向下转型就可以了，一样可以使用子类实例对象
class Father{
	
	String name = "Dad";
	
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
}

class Son extends Father{
	
	String name = "Son";
	
	public void p() {
		System.out.println(name + " is Playing game.");
	}
}

class UpCasting{
	
//	public static void main(String[] args) {
//		
//	}
//	
	public static void upcast() {
		
		Father f = new Son();
		f.sleep();//Dad is sleeping
		
		//if f.p(), this will occur wrong, because p() is not the Father's method
	}
	
	public static void downCast() {
		
		Father f = new Son();
		((Son)f).p();	//Son is Playing game.
		
		//是不是很惊喜？父类转化为子类，又恢复了子类独有的方法。
		
		
		//else example
		Father ff = new Father();
		ff.sleep();	//compile correct
		
		((Son)ff).p();	//compile wrong
		
		/*-----------重要!!!!---------------*/
//		向上转型可以当做隐藏自身的方法，所以，再转回来（向下转型）方法就会恢复原状。该是你的还是你的。
//		直接向下转型，父类不具有子类的独有方法，所以即使转化成功，也是个残废儿子，还不如不转，所以直接报错转化失败。不是你的你想都别想。
		
	}
	
	
	/*
	 * 假设Person有个dance()跳舞方法。
	 * 
	 * Man extends Person      Women extends Person
	 * 
	 * 此时Man和Women都重写了Person的dance();
	 * 
	 * 当 Person p = new Man(); p.dance(); //这个时候就是调用男人跳舞的dance方法 当 Person p = new
	 * Woman(); p.dance();// 这个时候就是调用女人的跳舞的dance方法
	 */	
	
}