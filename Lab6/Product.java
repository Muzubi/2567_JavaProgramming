import java.util.*;
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails (String pdName,double pdPrice,double pdVatRate) {
		name =pdName;
		price=pdPrice;
		vatRate=pdVatRate;
	}
	public double calculateTotalPrice() {
		return (price*vatRate)+price;
	}
	public void displayProductDetails() {
		System.out.println("Product Details: ");
		System.out.println("Product Name: "+ name);
		System.out.println("Price(Before VAT):"+price);
		System.out.println("Price(After VAT): "+calculateTotalPrice());
	}
	
	
	
}
