import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		Product pd1 = new Product();

		
		System.out.print("Enter product Name:");
		String pdName1 = scan.nextLine();
		System.out.print("Enter product price:");
		double pdPrice1 = scan.nextDouble();
		System.out.print("Enter VAT rate(%):");
		double pdVatRate1 = scan.nextDouble();
		pd1.setProductDetails(pdName1, pdPrice1, pdVatRate1);
		
		pd1.displayProductDetails();
		

		scan.close();
	}

}
