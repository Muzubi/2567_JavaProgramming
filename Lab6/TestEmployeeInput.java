import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Enter details for Employee1:");
		System.out.print("Name:");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked:");
		int empHourWorked1 = scan.nextInt();
		System.out.print("Hourly Rate:");
		double empHourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHourWorked1, empHourlyRate1);
		Line('-');
		emp1.displayEmployeeDetails();
		Line('*');
		
		
		scan.nextLine();
		
		System.out.println("Enter details for Employee2:");
		System.out.print("Name:");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked:");
		int empHourWorked2 = scan.nextInt();
		System.out.print("Hourly Rate:");
		double empHourlyRate2 = scan.nextDouble();

		emp2.setEmployeeDetails(empName2, empHourWorked2, empHourlyRate2);
		Line('-');
		emp2.displayEmployeeDetails();
		Line('*');
		
		
		scan.close();
	}
	public static void Line(char symbol) {
		//System.out.println("--------------------------------------");
		for(int i=1;i<50;i++) {
			System.out.print(symbol);
		}
	}

}
