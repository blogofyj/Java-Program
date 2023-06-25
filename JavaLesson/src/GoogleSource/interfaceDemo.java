package GoogleSource;

/*�ӿ����������
	�ӿڲ�������ʵ��������
	�ӿ�û�й��췽����
	�ӿ������еķ��������ǳ��󷽷���
	�ӿڲ��ܰ�����Ա���������� static �� final ������
	�ӿڲ��Ǳ���̳��ˣ�����Ҫ����ʵ�֡�
	�ӿ�֧�ֶ�̳С�
�ӿ�����
	�ӿ���ÿһ������Ҳ����ʽ�����,�ӿ��еķ����ᱻ��ʽ��ָ��Ϊ public abstract��ֻ���� public abstract���������η����ᱨ����
	�ӿ��п��Ժ��б��������ǽӿ��еı����ᱻ��ʽ��ָ��Ϊ public static final ����������ֻ���� public���� private ���λᱨ������󣩡�
	�ӿ��еķ����ǲ����ڽӿ���ʵ�ֵģ�ֻ����ʵ�ֽӿڵ�����ʵ�ֽӿ��еķ�����
������ͽӿڵ�����
	1. �������еķ��������з����壬������ʵ�ַ����ľ��幦�ܣ����ǽӿ��еķ������С�
	2. �������еĳ�Ա���������Ǹ������͵ģ����ӿ��еĳ�Ա����ֻ���� public static final ���͵ġ�
	3. �ӿ��в��ܺ��о�̬������Լ���̬����(�� static ���εķ���)�����������ǿ����о�̬�����;�̬������
	4. һ����ֻ�ܼ̳�һ�������࣬��һ����ȴ����ʵ�ֶ���ӿڡ�
*/
public class interfaceDemo {
	
	public static void main(String[] args) {
		Example demo = new Example("Tom", 18);
		System.out.println(demo.showName() + "'s id is: " + demo.showId());
	}

}
abstract interface DemoOfInterface{
	//û�й��췽��
	public static final int num = 3;	//�������巽��
	
	public abstract String showName();	//���巽��
	
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