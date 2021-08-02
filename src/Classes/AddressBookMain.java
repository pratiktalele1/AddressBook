package Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		int i=0;
		//creating object
		UC1 uc1=new UC1();
		//adding data to hash map
		uc1.add();
		//printing data from collection
		uc1.print();
		
		UC2 uc2=new UC2();
		do {
			uc2.add();
			System.out.print("0 =>to end && 1=>to again ====> ");
			Scanner scanInput = new Scanner(System.in);
			i = scanInput.nextInt();
			
		}while(i==1);
		
		uc2.print();
	}
}
