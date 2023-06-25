import java.util.Date;


public class testFormat {

	/**
	 * @param args
	 */
	//Define the overload
	public static int add(int a, int b ){
		return a+b;
	}
	//Define uncertain length overload
	public static int add(int... a){
		int s = 0;
		for(int i = 0; i < a.length; i++){
			s += a[i];
		}
		return s;
	}
//	public static void main(String[] args){
//		System.out.println(add(3,5));
//		System.out.println(add(3,4,5,7,2,5,6,7));
//		
//	}
	//_______________________________________________
	//construct method
//	class Person{
//		private String name;
//		private int age;
//		
//		public Person(String name,int age){
//			this.age = age;
//			this.name = name;
//		}
//		public String getName(){
//			return this.name;
//		}
//		public int getAge(){
//			return this.age;
//		}
//		
//	}
//	public class Main{
//		public static void main(String[] args){
//			Person p = new Person("john",18);
//			System.out.println(p.age + p.name);
//			
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date time = new Date();
		System.out.printf("The time is: %tT%n", time);
		System.out.printf("%4.2f%n", 2.345345);
		
		System.out.printf("hours %tH: minutes %tM: seconds %tS:", time,time,time);
		
//		System.out.println(time);
		System.out.printf("\n%,d%n", 20000);//to format our number with the thousands separator,
		System.out.printf("%C%n",'s');
		
		System.out.printf(" '%10s' %n","cuteboy");
		
		//Output the year
		System.out.printf("%1$tA,%1$tB,%1$tY %n",time);
		System.out.printf("%1$td,%1$tm,%1$ty %n",time);
	}

}
