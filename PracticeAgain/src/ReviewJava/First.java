package ReviewJava;

import java.util.Arrays;

import com.supermap.data.Workspace;

public class First {

	public static void main(String[] args) {
		
		
		Workspace wp = new Workspace();
		
		int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
		for(int[] bb : scores) {
			double sum = 0;
			int i = 0;
			for(int b : bb) {
				sum += b;
				i++;
			}
			double average = sum / i;
			System.out.printf("%.2f", average);
			System.out.println();
		}
		
	}
}
