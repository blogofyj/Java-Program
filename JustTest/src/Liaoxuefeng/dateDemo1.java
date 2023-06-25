package Liaoxuefeng;
import java.text.SimpleDateFormat;
import java.util.*;

public class dateDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		SimpleDateFormat var = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(var.format(date));
		
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		
		int m = c.get(Calendar.MONTH) + 1;
		
		int d = c.get(Calendar.DAY_OF_MONTH);
		
		int w = c.get(Calendar.DAY_OF_WEEK);
		
		int hh = c.get(Calendar.HOUR_OF_DAY);
		
		int mm = c.get(Calendar.MINUTE);
		
		int ss = c.get(Calendar.SECOND);
		
		int ms = c.get(Calendar.MILLISECOND);
		
		System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);
	}

}
