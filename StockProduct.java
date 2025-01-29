import java.util.*;
public class StockProduct {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int numberOfPriduct = 4;
	Product[] productList = new Product[numberOfPriduct];
	
	for(int i=0;i<numberOfPriduct;i++) {
		productList[i] = new Product();
		System.out.print("Input product Id :");
		productList[i].setId(scan.nextLine());
		System.out.print("Input product Unit :");
		productList[i].setUnit(scan.nextInt());
		scan.nextLine();
		System.out.print("Input product Price :");
		productList[i].setPrice(scan.nextInt());
		scan.nextLine();
		 
	
		}
	int totalPrice = 0;
	for(int i=0;i<numberOfPriduct;i++) {
		System.out.println
		("Product ID :"+productList[i].getId()+",Total Price = "+productList[i].calculate()+"baht.");
		totalPrice +=productList[i].calculate();
		}
	
	
	
	System.out.println("Total price of all product is "+totalPrice+"baht.");
	scan.close();	
}		
}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



