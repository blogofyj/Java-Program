package GoogleSource;

/*1. �����಻�ܱ�ʵ����(��ѧ�ߺ����׷��Ĵ�)�������ʵ�������ͻᱨ�������޷�ͨ����ֻ�г�����ķǳ���������Դ�������

2. �������в�һ���������󷽷��������г��󷽷�����ض��ǳ����ࡣ

3. �������еĳ��󷽷�ֻ�������������������壬���ǲ����������ľ���ʵ��Ҳ���Ƿ����ľ��幦�ܡ�

4. ���췽�����෽������ static ���εķ�������������Ϊ���󷽷���

5. ������������������������еĳ��󷽷��ľ���ʵ�֣����Ǹ�����Ҳ�ǳ����ࡣ*/

public class AbstractDemo {
	
	public static void main(String[] args) {
		
	}

}

abstract class Employee{
	private String name;
	private String address;
	private int number;
	
	public abstract double computePay();
	//Abstract �ؼ���ͬ�����������������󷽷������󷽷�ֻ����һ������������û�з�����
	
}

//���һ����������󷽷�����ô��������ǳ����ࡣ
//�κ����������д����ĳ��󷽷���������������Ϊ�����ࡣ
//�̳г��󷽷������������д�÷��������򣬸�����Ҳ��������Ϊ�����ࡣ
//���գ�����������ʵ�ָó��󷽷������򣬴�����ĸ��ൽ���յ����඼��������ʵ��������
class Salary extends Employee{

	private double salary;
	
	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		System.out.println("Compute salary pay for ");
		return 0;
	}
	
}
