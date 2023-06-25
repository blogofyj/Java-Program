package GoogleSource;

public class DuotaiExample {

	public static void main(String[] args) {
		
		Salary s = new Salary("员工 A", "北京", 3, 3600.00);
		Employee e = new Salary("员工 B", "上海", 2, 2400.00);
		System.out.println("使用 Salary 的引用调用 mailCheck -- ");
		s.mailCheck();
		System.out.println("\n使用 Employee 的引用调用 mailCheck--");
		e.mailCheck();
		
	}
	
}

class Employee{
	
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public String toString() {
		return name + " " + address + " " + number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void mailCheck() {
		System.out.println("寄支票给：" + this.name + " " + this.address);
	}
	
}

class Salary extends Employee{
	
	private double salary;

	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		if(newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public void mailCheck() {
		System.out.println("Salary类的mailCheck方法");
		System.out.println("寄支票给：" + getName() + ",工资为：" + salary);
	}
	
	public double computPay() {
		System.out.println("Comput the paycheck,give:" + getName());
		return salary / 52;
	}
}