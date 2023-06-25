package Liaoxuefeng;

public class Six {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student();
		p.run();
		try{
			String s = processFile("C:\\test.txt");
		}catch(FileNotFoundException e){
			//file not found;
		}catch(SecurityException e){
			//no read permission
		}catch(IOException e){
			//io error
		}catch(Exception e){
			//other error
		}
	}

}
abstract class Person{
	public abstract void run();
}

class Student extends Person{
//	@override
	public void run(){
		System.out.println("Student run");
	}
}
//interface
interface stragePerson{
	void run();
	String getName();
}
class strageStudent implements stragePerson{
	private String name;
	
	public strageStudent(String name){
		this.name = name;
	}
	//override
	public void run(){
		System.out.println();
	}
	//override
	public String getName(){
		return this.name;
	}
}