package Classes;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UC3 extends UC2 {
	// editing contact
	public void editExisting() {
		System.out.print("Enter Full name to edit - ");
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.nextLine();
		contact.map.remove(getUserInput);
		add();

	}
}
