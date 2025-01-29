import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many student in classroom:");
		int numberOfStudent = scan.nextInt();
		scan.nextLine();
		Student[] students = new Student[numberOfStudent];
		
		for(int i=0;i<numberOfStudent;i++) {
			students[i]=new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT"+(i+1));
			Line();
				
			System.out.print("Input student name:");
			String stdName = scan.nextLine();
			students[i].setName(stdName);
			
			while(true) {
				System.out.print("Input student score: ");
                int score = scan.nextInt();
                scan.nextLine(); 
                students[i].setScore(score);
                
			if(students[i].checkScore()) {
				break;}
			else {
				System.out.println("Input score,agian:");
				}
		}
	}
		System.out.println("\nLIST OF PASS STUDENT (>=50):");
		Line();
		for(Student student:students) {
			if(student.isPass()) {
				String grade = findGrade(student.getScore());
				System.out.println(">> "+student.getName()+" ("+student.getScore()+") get grade "+grade);
			}
		}
		scan.close();
	}
	public static void Line() {
		for(int i=1;i<60;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public static String findGrade(int score) {
		if (score<=100&&score>=80) {return "A";}
		else if(score<=79&&score>=75) {return "B+";}
		else if(score<=74&&score>=70) {return "B";}
		else if(score<=69&&score>=65) {return "C+";}
		else if(score<=64&&score>=60) {return "c";}
		else if(score<=59&&score>=55) {return "D+";}
		else if(score<=54&&score>=50) {return "D";}
		else return "F";
	}
}
