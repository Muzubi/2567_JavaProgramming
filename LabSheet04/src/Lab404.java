import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();
		
	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		
		String stuIDInput ,subIDInput;
		
		while(true){
			System.out.print("Enter Student Id:");
			stuIDInput = scan.nextLine();
			System.out.print("Enter Subject Id:");
			subIDInput = scan.nextLine();
			if(isLength(stuIDInput,10) && isLength(subIDInput,7)) {
				break;
			}
		}
		
		displayData(isITStudent(stuIDInput),isITSubject(subIDInput),(stuIDInput));
		
		scan.close();
	}
	public static boolean isLength(String input , int len) {
		if(input.length() == len) return true;
		else return false;
	}
	public static boolean isITStudent(String input) {
		if (input.substring(0,6)=="241311") {
			return true;
		}else return false;
	}
	public static boolean isITSubject(String input) {
		if (input.substring(0,2)=="21"&&input.charAt(4)=='1') {
			return true;
		}else return false;
	}
	public static void displayData(boolean idinput , boolean itsubject,String stuIDInput) {
		if (idinput) {
			System.out.println("Student id:"+stuIDInput+" 1st year student in IT ");
		}else {
			System.out.println("Student id:"+stuIDInput+" is not 1st year student in IT ");
		}
		if
	}
}
