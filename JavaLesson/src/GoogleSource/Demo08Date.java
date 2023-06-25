package GoogleSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo08Date {
	
	public static void main(String[] args) {
		
		dateDemo();
		simpleDateFormatDemo();
		testTime();
	}
	
	public static void dateDemo() {
		  Date date = new Date( );
	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	 
	      System.out.println("当前时间为: " + ft.format(date));
	      
	      System.out.printf("全部日期和时间信息：%tc%n",date);          
	      //f的使用  
	      System.out.printf("年-月-日格式：%tF%n",date);  
	      //d的使用  
	      System.out.printf("月/日/年格式：%tD%n",date);  
	      //r的使用  
	      System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
	      //t的使用  
	      System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
	      //R的使用  
	      System.out.printf("HH:MM格式（24时制）：%tR",date); 
	}
	
	public static void simpleDateFormatDemo() {//解析字符串为时间
		  SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		  
		  String[] args = null;
		 
	      String input = args.length == 0 ? "1818-11-11" : args[0]; 
	 
	      System.out.print(input + " Parses as "); 
	 
	      Date t; 
	 
	      try { 
	          t = ft.parse(input); 
	          System.out.println(t); 
	      } catch (ParseException e) { 
	          System.out.println("Unparseable using " + ft); 
	      }
	}
	
	public static void testTime() {
		try {
	         long start = System.currentTimeMillis( );//系统当前时间
	         System.out.println(new Date( ) + "\n");
	         Thread.sleep(5*60*10);					//休眠时间
	         System.out.println(new Date( ) + "\n");
	         long end = System.currentTimeMillis( );
	         long diff = end - start;
	         System.out.println("Difference is : " + diff);
	      } catch (Exception e) {
	         System.out.println("Got an exception!");
	      }
	}
	
	public static void showCalendar() {
		/*
		 * 如何才能设置和获取日期数据的特定部分呢，比如说小时，日，或者分钟? 
		 * 我们又如何在日期的这些部分加上或者减去值呢? 答案是使用Calendar 类。
		 */
		Calendar c1 = Calendar.getInstance();
		// 获得年份
		int year = c1.get(Calendar.YEAR);
		// 获得月份
		int month = c1.get(Calendar.MONTH) + 1;
		// 获得日期
		int date = c1.get(Calendar.DATE);
		// 获得小时
		int hour = c1.get(Calendar.HOUR_OF_DAY);
		// 获得分钟
		int minute = c1.get(Calendar.MINUTE);
		// 获得秒
		int second = c1.get(Calendar.SECOND);
		// 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
		int day = c1.get(Calendar.DAY_OF_WEEK);
	}
}

class GregorianCalendarDemo{
	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr","May", "Jun", "Jul", "Aug","Sep", "Oct", "Nov", "Dec"};
		
		int year;
		
		GregorianCalendar gcalendar = new GregorianCalendar();
		/**
		 * 通常我们想要的结果是能够人为的设定一个时间
		 * getTime()是取出GregorianCalendar 对象中的时间，setTime()是设置GregorianCalendar 对象中的时间，均作用Date对象
		 * GregorianCalendar对象中的时间均可任意取出
		 * 
		 */
		gcalendar.set(2008, 9, 11);
		
		Date date = gcalendar.getTime();
		
		gcalendar.setTime(new Date());
		
		int year1 = gcalendar.get(Calendar.YEAR);
		int month = gcalendar.get(Calendar.MONTH) + 1;
		int day = gcalendar.get(Calendar.DAY_OF_MONTH);
		
		
		  System.out.print("Date: ");
//		  System.out.println(gcalendar.get(Calendar.MONTH));
	      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
	      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
	      System.out.println(year = gcalendar.get(Calendar.YEAR));
	      System.out.print("Time: ");
	      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
	      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
	      System.out.println(gcalendar.get(Calendar.SECOND));
	      
	      // 测试当前年份是否为闰年
	      if(gcalendar.isLeapYear(year)) {
	         System.out.println("It's LeapYear");
	      }
	      else {
	    	  System.out.println("It's not LeapYear");
	      }
	}
}