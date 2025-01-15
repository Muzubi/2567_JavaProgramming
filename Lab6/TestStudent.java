
public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.setStudentDetails("nonnatee",new double[] {85.0,78.0,92.0});
		student2.setStudentDetails("wipawee",new double[] {100.0,100.0});

		
		System.out.println("Student 1 details:");
		student1.displayStudentDetails();
		System.out.println("\nStudent 2 details:");
		student2.displayStudentDetails();
	}

}
