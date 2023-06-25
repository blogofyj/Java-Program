package Liaoxuefeng;

import java.util.PriorityQueue;

public class priorQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<User> q = new PriorityQueue<>(new UserComparator());
        // ���3��Ԫ�ص�����:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,��Ϊ����Ϊ��
	}

}

class UserComparator implements Comparator<User>{
	public int compare(User u1, User u2){
		if(u1.number.charAt(0) == u2.number.charAt(0)){
			return u1.number.compareTo(u2.number);
		}
		if(u1.number.charAt(0) == 'V'){
			//���ȼ���
			return -1;
		}else{
			return 1;
		}
	}
}

class User{
	public final String name;
	public final String number;
	public User(String name, String number) {
		//super();
		this.name = name;
		this.number = number;
	}
	public String toString(){
		return name + "/" + number;
	}
	
}
