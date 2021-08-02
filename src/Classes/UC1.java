package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UC1 {
	Contact contact = new Contact();

	public void add() {
		//creating list object
		List<String> list = new ArrayList<String>();
		System.out.print("enter Full name - ");
		Scanner scanInput = new Scanner(System.in);
		contact.FullName = scanInput.nextLine();
		UC7 uc7=new UC7();
		if(uc7.checkForNew(contact.FullName)==false) {
		System.out.print("enter address - ");
		contact.address = scanInput.nextLine();

		System.out.print("enter city - ");
		contact.cityName = scanInput.nextLine();

		System.out.print("enter state - ");
		contact.stateName = scanInput.nextLine();

		System.out.print("enter zip - ");
		contact.zipCode = scanInput.nextLine();

		System.out.print("enter phone - ");
		contact.phoneNumber = scanInput.nextLine();

		System.out.print("enter email - ");
		contact.emailAddress = scanInput.nextLine();

		//adding data to list
		list.add("full name ::" + contact.FullName);
		list.add("address ::" + contact.address);
		list.add("city::" + contact.cityName);
		list.add("state::" + contact.stateName);
		list.add("zip::" + contact.zipCode);
		list.add("phone::" + contact.phoneNumber);
		list.add("email::" + contact.emailAddress);
		//adding data to address book hash map
		contact.map.put(contact.FullName, list);
		}else {
			System.out.println("duplicate data");
		}
	}

	public void print() {
		//printing total data from address book
		for (Map.Entry<String, List<String>> entry : contact.map.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

}
