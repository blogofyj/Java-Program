package GoogleSource;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumDemo {

	public static void main(String[] args) {
		
//		Enumeration<String> days;
		
		Vector<String> dayNames = new Vector<String>();
		
		dayNames.add("Sunday");
	    dayNames.add("Monday");
	    dayNames.add("Tuesday");
	    dayNames.add("Wednesday");
	    dayNames.add("Thursday");
	    dayNames.add("Friday");
	    dayNames.add("Saturday");
	    
	    Enumeration<String> days = dayNames.elements();
	    
	    while(days.hasMoreElements()) {
	    	
	    	System.out.println(days.nextElement());
	    }
		
	}
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {	//����
		  T max = x; // ����x�ǳ�ʼ���ֵ
	      if ( y.compareTo( max ) > 0 ){
	         max = y; //y ����
	      }
	      if ( z.compareTo( max ) > 0 ){
	         max = z; // ���� z ����           
	      }
	      return max; // ����������
	}
	
	public static <T extends Comparable> T min(List<T> t) {
		T m = t.get(0);
		for (int i = 0; i < t.size(); i++) {
			if((m.compareTo(t.get(i))) > 0 ) {
				m = t.get(i);
			}
		}
		return m;
	}
	
}
