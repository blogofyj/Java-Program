package Liaoxuefeng;

public class Thirteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new int[] {1,2,3,78,34,32,1});
		System.out.println(java.util.Arrays.sort(new int[] {1,2,3,78,34,32,1}));
		
		System.out.println("\n" + java.util.Arrays.toString(reverse(new int[] {1,2,3,78,34,32,1})));
	}

	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	
	public static int[] reverse(int[] list){
		int[] result = new int[list.length];
		
		for(int i = 0, j = result.length-1; i < list.length; i++, j--){
			result[j] = list[i];
		}
		return result;
	}
}
