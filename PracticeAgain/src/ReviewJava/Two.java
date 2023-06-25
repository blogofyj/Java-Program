package ReviewJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Two {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
		coll.add("Lily");
		
		Iterator<String> it = coll.iterator();
		boolean b = it.hasNext();
		  
	}
	
}

class Phone{
	String brand;
	double price;
	String color;
	
	public void call(String who) {
		System.out.println();
	}
	
	public void sendMessage() {
		System.out.println();
	}
}

