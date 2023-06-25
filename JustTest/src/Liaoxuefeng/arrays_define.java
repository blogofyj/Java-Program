package Liaoxuefeng;
import java.util.List;
import java.util.ArrayList;
//import java.awt.*;

public class arrays_define {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class InitialArray{
	char[] b = {'1', '2', '3' };
	char[] c = new char[] {'1', '2', '3' };
	char[] d = new char[3];
	
	
	
	Character e = new Character('A');
}
class initInteger{
	int[] a = new int[5];
	int[] b = {1,2,3,4};
	int[] c = new int[] {1,2,3,4};
	//int[] d = new int[5]{1,2,3,4,5};不允许同时使用
	
	Integer e = new Integer(23);
	Integer f = Integer.valueOf(89);
	
}
class initString{
	String[] cats = new String[]{"Tom","Sam","Mini"};
	//else just like above
	
	//two dimension define
	static{
		int[][] arr = new int[3][4];
		arr[0][0] = 1;
	}
	static String[][] str1 = new String[][] {{"a","b","c"},{"d","e","f",},{"g","h","i"}};
	String[][] str2 = {{"a","b","c"},{"d","e","f",},{"g","h","i"}};
	//arrays to outPut
	static{
		
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				System.out.println("str[" + i + "][" + j + "]=" + str1[i][j]);
			}
		}
		//else
		for (String[] row : str1) {
			for(String s : row){
				System.out.println(s);
			}
		}
		//else
		System.out.println(java.util.Arrays.deepToString(str1));
	}
}
class initList{
	static{
		List<String> list = new ArrayList();
		list.add("apple");
		//method 2
		List<String> list2 = new ArrayList(){
			{
				this.add("pear");
				add("banana");
			}
		};
		//method three
		List<Integer> list3 = java.util.Arrays.asList(1,3,3,4);
		List<String> list4 = java.util.Arrays.asList("a","b");
		//method four
		List<String> list5 = Lists.newArrayList("Hi", "jack");
		
		//outPut method
		//forEach;	iterator;	list.get(index)
	}
	
	
}












