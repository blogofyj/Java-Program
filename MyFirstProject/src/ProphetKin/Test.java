package ProphetKin;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		
//		method("Yom", name -> System.out.println(name));
		method("Yom", (String name) -> {
			
			//���ַ�����ת
			String reName = new StringBuffer(name).reverse().toString();
			System.out.println(reName);
		});
	}
	
	public static void method(String name, Consumer<String> con) {
		con.accept(name);
	}
}
