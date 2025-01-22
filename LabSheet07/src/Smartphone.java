
public class Smartphone {

	private String brand;
	private String model;
	private int storageCapacity;
	private final int MAX_STORAGE_CAPCITY = 512;
	
	Smartphone(String brand,String model,int storageCapacity){
		this.brand =brand;
		this.model =model;
		this.storageCapacity = storageCapacity;}
	
	Smartphone(){
		brand ="Unknow";
		model= "Unknow";
		storageCapacity = 0;}
		


	public String getBrand(){
		return this.brand;}
	public String getModel(){
		return this.model;}
	public int getStorageCapacity(){
		return this.storageCapacity;}
	
	public void setBrand(String brand) {
		if(brand.length()>=2) {
			this.brand=brand;}
		else {System.out.println("Error: Brand must have at least 2 charaters!");}}
	
	public void setModel(String model) {
		if(model.length()>=2) {
			this.model=model;}
		else {System.out.println("Error: Model must have at least 2 charaters!");}}
	
	
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity>=1&&storageCapacity<=512) {
			this.storageCapacity=storageCapacity;}
		else {System.out.println("Error: Storage capacity must between 1 and 512GB!");}}
	
	
	public void increaseStorage(int additionalStorage) {
			
		if(additionalStorage>0&&(storageCapacity+additionalStorage)<=MAX_STORAGE_CAPCITY){
			storageCapacity +=additionalStorage;
		}else if(additionalStorage<=0) {
			System.out.println("Error: Additional storage must be positive!");}
		else {
			System.out.println("Error: Storage capacity cannot exceed "+MAX_STORAGE_CAPCITY+" GB!");}

	}
	
	public int getRemainingStorage(int usedStorage) {
		
		if(usedStorage>0&&usedStorage<=storageCapacity) {
			return storageCapacity - usedStorage;
		}else {
		System.out.println("Error: Used storage must be between 0 and "+storageCapacity+" GB!");
		return -1;}
	}
	
	public void printDetails() {
		System.out.println("Smartphone Details:");
		System.out.println("Brand :"+this.brand);
		System.out.println("Model :"+this.model);
		System.out.println("Storage Capacity:"+this.storageCapacity);
		

	}
	
	
}
