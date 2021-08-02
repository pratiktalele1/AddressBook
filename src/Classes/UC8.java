package Classes;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC8 extends UC1 {
	public void checkContact() {
		//creating flag to display match value
		int flag=0;
		System.out.print("Enter city or state name - ");
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.nextLine();
		
		for (Map.Entry<String, List<String>> entry : contact.map.entrySet()) {
		List<String> list=entry.getValue();
		//System.out.println(list.get(0));
		Pattern pattern=Pattern.compile(getUserInput);
		Matcher matcher=pattern.matcher(list.get(2));
		if(matcher.find()) {
			flag=1;
		}
		
		if(flag==1) {
			System.out.println(list.get(0));
			flag=0;
		}
		}
	}
}
