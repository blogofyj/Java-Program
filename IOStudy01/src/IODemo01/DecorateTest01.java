package IODemo01;
/**
 * װ��
 * ʵ�ַŴ����������ķŴ�
 * @author asus
 *
 */

public class DecorateTest01 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.say();
		Amplifier af = new Amplifier(p);
		af.say();
		
	}
}
interface Say{
	void say();
}
class Person implements Say{

	private int voice = 10;
	
	@Override
	public void say() {
		System.out.println("�˵�����Ϊ��" + this.getVoice());
	}

	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}
	
	
}
class Amplifier implements Say{

	private Person p;
	
	public Amplifier(Person p) {
		this.p = p;
	}


	@Override
	public void say() {
		System.out.println("�˵�������" + p.getVoice()*10);
		System.out.println("��������");
	}
	
}