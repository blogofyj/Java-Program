package Liaoxuefeng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seven{
	
	public static void main(String[] args){
		
		final int start = 10;
		final int end = 20;
		List<Integer> list = new ArrayList();
		for(int i = start; i <= end; i++){
			list.add(i);
		}
		
		Collections.shuffle(list);
		Integer[] array = list.toArray(new Integer[10]);
		for(int i : array){
			System.out.print(i + " ");
		}
	
	}
	
}