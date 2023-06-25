package Prophet_kin;

public class Demo04 {

	
	public static void main(String[] args) {
		
		invokeCalc(10, 20, new Calculator() {

			@Override
			public int calc(int a, int b) {

				return a + b;
			}
			
		});
		
		
		//ʹ��lambda �����������ڲ���
		 invokeCalc(10,20, (int a, int b) -> {return a + b;});
	}
	
	public static void invokeCalc(int a, int b, Calculator c) {
		int sum = c.calc(a, b);
		System.out.println(sum);
	}
}

interface Calculator{
	public abstract int calc(int a, int b);
}