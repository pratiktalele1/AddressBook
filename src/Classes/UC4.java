package Classes;

import java.util.Scanner;

public class UC4 extends UC3 {
	public void deleteContact() {
		System.out.print("Enter name- ");
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.nextLine();
		contact.map.remove(getUserInput);
	}
}
