import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inpot a sentence :");
		String sentenceW = scan.nextLine();
		
		while (!sentenceW.endsWith(".")) {
			System.out.print("Input a sentence,agian:");
			sentenceW = scan.nextLine();
			if(sentenceW.endsWith(".")== true) {
				break;
			}
		}
		int spacebar = 0;
		for(int i=0;i<sentenceW.length();i++) {
			if(sentenceW.charAt(i) ==' ') {
				spacebar++;
			}
		}
		
		int word =  spacebar+1;
		
		
		
		System.out.println("This sentence has "+spacebar+" spacebar.");
		System.out.println("This sentence has "+word+" word.");
		
		
		
		
		
	}
}
