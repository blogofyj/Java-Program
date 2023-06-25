
public class User {
	public String firstName;
	public String lastName;
	
	public void outPut(int times){
		for(int i=0;i<times;i++){
			System.out.println("Hi my name is:"+ firstName + " " + lastName+".");
		}
	
	}
	public String getFirstName(){
		return "Hi,my surname is:"+firstName.toUpperCase();
	}
	public void setName(String name1){
		firstName=name1;
	}
	
	public String getLastName(){
		return lastName;
	}
	public String getFullName(){
		return firstName + lastName;
	}
	
}