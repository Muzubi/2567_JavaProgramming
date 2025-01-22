
public class Rectangle {
	private float length;
	private float width;
	
	Rectangle(){
		length = 1.0f;
		width = 1.0f;}
	
	Rectangle(float length,float width){
		this.length = length;
		this.width = width;}
	
	
	public float getLangth() {
		return this.length;}
	
	public void setLength(float length) {
		this.length = length;}
	
	public float getWidth(){
		return this.width;}
	
	public void setWidth(float width){
		this.width = width;}
	
	public double getArea() {
		return this.length*this.width;}
	
	public double getParimeter() {
		return 2*(this.length + this.width);}
	
	public String showData() {
		return "Rectangle[length ="+this.length+",width ="+this.width+"]";}
	
	//Method to display using toString
	public String toString() {
		return "Rectangle[length ="+this.length+",width ="+this.width+"]";}
	
	
	
	
	
}
