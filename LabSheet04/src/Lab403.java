import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String fullName;
		String firstName;
		
		System.out.println("Please enter your name,seperated by a space");
		System.out.println(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' ');
		firstName = fullName.substring(0,space);
		System.out.println(abbreviatName(fullName));
		input.close();
	}
	public static String abbreviatName(String fName) {
		String initailLetter="";
		for(int i=0;i<fName.length();i++) {
			if(fName.charAt(i)==' ') {
				initailLetter = (initailLetter+fName.charAt(i+1)).toUpperCase();
				initailLetter = initailLetter+".";
			}
		}
		return initailLetter;
	}
}
