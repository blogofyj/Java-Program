package Liaoxuefeng;
import java.util.*;
import java.util.ArrayList;

import java.util.List;
//1.��ʼ�����������ࣩ


public class newLatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//method one
		List<String> list = new ArrayList(){
			{//new �����Ĵ������ڿ��ԶԹ����ĳ�Ա�������Լ����Ը�ֵ
				add("a");
				add("b");
			}
		};
		
		//method two
		Object ob = new Object(){
			//@override ������дĳ������
			public void handMessage(int num){
				
				switch(num){
				case 6:
					System.out.println("that's number six");
					break;
				case 4:
					System.out.println("that's nnumber four");
					break;
				default:
					System.out.println("Please input again");
				
				}
			}
		};
	}

}









