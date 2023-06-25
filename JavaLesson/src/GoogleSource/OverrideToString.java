package GoogleSource;

public class OverrideToString {
	
	private String name;
	private int age;

	public OverrideToString() {
		super();
		// TODO Auto-generated constructor stub
	}



	public OverrideToString(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
		
		OverrideToString p1 = new OverrideToString("Allean", 18);
		OverrideToString p2 = new OverrideToString("Pet", 20);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
	
}

class DemoPrint{
	public void println(Object x) {
		String s = String.valueOf(x);
		synchronized (this) {
			print(s);
			newLine();
		}
	}
	private static void print(String x) {
		System.out.print(x);
	}
	
	private static void newLine() {
		System.out.println();
	}
	
	public static String valueOf(Object obj) {
		return (obj == null) ? "null" : obj.toString();
	}
	
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}