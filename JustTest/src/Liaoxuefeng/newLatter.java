package Liaoxuefeng;
import java.util.*;
import java.util.ArrayList;

import java.util.List;
//1.初始化对象（匿名类）


public class newLatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//method one
		List<String> list = new ArrayList(){
			{//new 对象后的大括号内可以对公开的成员变量，以及属性赋值
				add("a");
				add("b");
			}
		};
		
		//method two
		Object ob = new Object(){
			//@override 可以重写某个方法
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









