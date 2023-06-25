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
	 
	      System.out.println("��ǰʱ��Ϊ: " + ft.format(date));
	      
	      System.out.printf("ȫ�����ں�ʱ����Ϣ��%tc%n",date);          
	      //f��ʹ��  
	      System.out.printf("��-��-�ո�ʽ��%tF%n",date);  
	      //d��ʹ��  
	      System.out.printf("��/��/���ʽ��%tD%n",date);  
	      //r��ʹ��  
	      System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",date);  
	      //t��ʹ��  
	      System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",date);  
	      //R��ʹ��  
	      System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR",date); 
	}
	
	public static void simpleDateFormatDemo() {//�����ַ���Ϊʱ��
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
	         long start = System.currentTimeMillis( );//ϵͳ��ǰʱ��
	         System.out.println(new Date( ) + "\n");
	         Thread.sleep(5*60*10);					//����ʱ��
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
		 * ��β������úͻ�ȡ�������ݵ��ض������أ�����˵Сʱ���գ����߷���? 
		 * ��������������ڵ���Щ���ּ��ϻ��߼�ȥֵ��? ����ʹ��Calendar �ࡣ
		 */
		Calendar c1 = Calendar.getInstance();
		// ������
		int year = c1.get(Calendar.YEAR);
		// ����·�
		int month = c1.get(Calendar.MONTH) + 1;
		// �������
		int date = c1.get(Calendar.DATE);
		// ���Сʱ
		int hour = c1.get(Calendar.HOUR_OF_DAY);
		// ��÷���
		int minute = c1.get(Calendar.MINUTE);
		// �����
		int second = c1.get(Calendar.SECOND);
		// ������ڼ���ע�⣨�����Date���ǲ�ͬ�ģ���1���������ա�2��������1��3�������ڶ����Դ����ƣ�
		int day = c1.get(Calendar.DAY_OF_WEEK);
	}
}

class GregorianCalendarDemo{
	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr","May", "Jun", "Jul", "Aug","Sep", "Oct", "Nov", "Dec"};
		
		int year;
		
		GregorianCalendar gcalendar = new GregorianCalendar();
		/**
		 * ͨ��������Ҫ�Ľ�����ܹ���Ϊ���趨һ��ʱ��
		 * getTime()��ȡ��GregorianCalendar �����е�ʱ�䣬setTime()������GregorianCalendar �����е�ʱ�䣬������Date����
		 * GregorianCalendar�����е�ʱ���������ȡ��
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
	      
	      // ���Ե�ǰ����Ƿ�Ϊ����
	      if(gcalendar.isLeapYear(year)) {
	         System.out.println("It's LeapYear");
	      }
	      else {
	    	  System.out.println("It's not LeapYear");
	      }
	}
}