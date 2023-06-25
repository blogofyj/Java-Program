package Prophet_kin;

public class Demo02 {

	public static void main(String[] args) {
		
		//传递Cook接口的匿名内部类对象
		invokeCook(new Cook() {
			@Override
			public void makeFood() {
				System.out.println("吃饭了");
			}
		});
		
		//使用lambda表达式
		invokeCook(() -> System.out.println("吃饭了"));
		
	}
	
	public static void invokeCook(Cook cook) {
		cook.makeFood();
	}
	
}

interface Cook{
	public abstract void makeFood();
}
