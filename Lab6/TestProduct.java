import java.util.*;
public class TestProduct {
	public static void main(String[] args) {
		Product pd1 = new Product();
		Product pd2 = new Product();

		pd1.setProductDetails("Smartphone",30000.0,0.07);
		
		System.out.println("Product Details:");
		pd1.displayProductDetails();
		
		
	}
}
