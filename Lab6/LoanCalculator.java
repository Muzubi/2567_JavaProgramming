import java.util.*;
public class LoanCalculator {
	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails (String pdName,double pdPrice,double interastRate,int years) {
		productName =pdName;
		price=pdPrice;
		interestRate = interastRate;
		years = years;
	}
	public double calculateMonthlyPayment() {
		double total;
		total = price*interestRate*(1+interestRate)*
		return total;
	}
	
	
	
	
	
}
