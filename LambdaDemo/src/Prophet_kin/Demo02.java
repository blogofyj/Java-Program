package Prophet_kin;

public class Demo02 {

	public static void main(String[] args) {
		
		//����Cook�ӿڵ������ڲ������
		invokeCook(new Cook() {
			@Override
			public void makeFood() {
				System.out.println("�Է���");
			}
		});
		
		//ʹ��lambda���ʽ
		invokeCook(() -> System.out.println("�Է���"));
		
	}
	
	public static void invokeCook(Cook cook) {
		cook.makeFood();
	}
	
}

interface Cook{
	public abstract void makeFood();
}
