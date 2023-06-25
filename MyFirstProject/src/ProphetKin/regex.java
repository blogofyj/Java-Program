package ProphetKin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class regex {

	public static void main(String[] args) {
		
		Pattern compile = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
		boolean b = compile.matcher("010-12345678").matches();
		
		Matcher matcher = compile.matcher("010-12345678");
		if(matcher.matches()) {
			String whole = matcher.group(0);
			String firstGroup = matcher.group(1);
			String sencondGroup = matcher.group(2);
			
			
		}
	}
}
