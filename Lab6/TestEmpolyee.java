
public class TestEmpolyee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.setEmployeeDetails("Natcha",45,20.0);
		emp2.setEmployeeDetails("Natcha",45,20.0);
		
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		System.out.println("Employee 2 Details");
		emp2.displayEmployeeDetails();
	}

}
