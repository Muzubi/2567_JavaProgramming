
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car(){
	companyName ="Unknow";
	modelName= "Unknow";
	year = 2000;
	mileage = 0.0;}

	Car(String companyName,String modelName,int year,double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		this.year = year>=1886?year:2000;
		this.mileage = mileage;}
	
	public void setCompanyName(String companyName) {
		if(companyName != null&& !companyName.trim().isEmpty()) {
			this.companyName=companyName;}
		else {System.out.println("Error: Invalid company or madel name");}}
	
	public void setmodelName(String modelName) {
		if(modelName != null&& !modelName.trim().isEmpty()) {
			this.modelName=modelName;}
		else {System.out.println("Error: Invalid company or madel name");}}
	
	public void setyear(int year) {
		if(year>=1886) {this.year=year;}
		else {System.out.println("Error: Invalid year!");}}
		
	public double getMileage() {
		return this.mileage;}
	
	
	public void showData() {
		System.out.println("Company Name :"+this.companyName);
		System.out.println("Modle Name :"+this.modelName);
		System.out.println("Year :"+this.year);
		System.out.println("Mileage :"+this.mileage);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}