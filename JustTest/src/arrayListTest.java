import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class arrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
//		allGrades.add(Arrays.asList(3,4,6,2,5));
//		allGrades.add(Arrays.asList(3,5,3,5,6));
//		allGrades.add(Arrays.asList(323,4,5,6,23)); 
//		
//		for(List<Integer> grades:allGrades){
//				System.out.print(grade + " ");
//			}
//			System.out.println();
//		}
//		List<Integer> allGrades = Arrays.asList(4,5,2,4,6);
//		int[] grades = new int[allGrades.size()];
//		
//		for(int i =0; i< allGrades.size(); i++){
//			grades[i]=allGrades.get(i);
//		}
//		System.out.println(Arrays.toString(grades));
//		
//		List<Integer> number=new ArrayList<Integer>();
//		number.add(4);
//		number.add(78);
//		number.add(0, 12);
//		//method 1
//		
//		Object[] objects=number.toArray();
//		for(Object num:objects){
//			System.out.println(num +" ");
//		}
//		//method 2
//		Integer[] me2=new Integer[number.size()];
//		me2=number.toArray(me2);
//		
//	
//		for(Integer num1:number){
//			System.out.println(num1);
//		}
		/*List<Integer> allGrades=Arrays.asList(4,5,12,1,3);
		Collections.sort(allGrades);
		Collections.reverse(allGrades);
		
		for(int grade:allGrades){
			System.out.println(grade);
		}*/
		User user= new User();
		user.firstName="Sub";
		user.lastName="Tim";
		System.out.println(user.firstName);
		user.outPut(3);
		try{
			System.out.println(5%0);
		}catch(Exception e){
			System.out.println(user.firstName);
		}
		
	} 
}