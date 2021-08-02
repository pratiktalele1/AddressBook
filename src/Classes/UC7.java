package Classes;

public class UC7 extends UC6{
 public boolean checkForNew(String str) {
	 //returning data present or not
	return Contact.map.containsKey(str);
}
}
