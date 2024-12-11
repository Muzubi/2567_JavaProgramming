import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("Input number :");
			int num = input.nextInt();
			if(num<count) {
				break;
			}
			count = num;
		}
	}

}
