package ProphetKin;

import java.util.LinkedList;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		System.out.println(getObject(() -> "abc"));
		//create a new object
		getObject(SupplierTest::new);
		
		
	}
	
	public static <T> T getObject(Supplier<T> supplier) {
		return supplier.get();
		
	}
}
