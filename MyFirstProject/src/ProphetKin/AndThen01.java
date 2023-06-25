package ProphetKin;

import java.util.function.Consumer;

/**
 * ��Ҫ����consumer�ӿڣ����԰�������ϵ�һ�𣬶����ݽ�������
 * @author asus
 *
 *con1.andThen(con2).accept(s);��ǰ���������
 */
public class AndThen01 {

	public static void main(String[] args) {
		//One
		method("hello", t -> {
			System.out.println(t.toUpperCase());
		},
				t -> {
					System.out.println(t.toLowerCase());
				});  
		
		
		//Two
		String[] arr = {"Yom,male", "Kila,female", "Horton,male"};
		//method2(arr,() -> {}, () -> {} );
		method2(arr,(message) -> {
			//����Ϣ�����и�
			String name = message.split(",")[0];
			System.out.print("Name: " + name);
		}, (message) -> {
			String age = message.split(",")[1];
			System.out.println("Name: " + age);
		} );
	}
	
	public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
		con1.accept(s);
		con2.accept(s);
		
		//or
		con1.andThen(con2).accept(s);//��ִ��con1������ִ��con2����
	}
	
	public static void method2(String[] arr, Consumer<String> con1, Consumer<String> con2) {
		for(String message : arr) {
			con1.andThen(con2).accept(message);
		}
	}
}
