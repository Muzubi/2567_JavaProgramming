
public class Director {
	private String name;
	private String email;
	private char gender;
	
	Director(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	Director(String name,String email){
		this(name,email,' ');
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName(){
		if(this.gender =='m'||this.gender =='M') {
			return "Male";
		}
		else if(this.gender =='f'||this.gender =='F') {
			return "Female";
		}
		else return "null";
	}
	public String toString() {
		return this.getName()+"("+this.getEmail()+";"+this.getGenderName();
	}
	
	
	
}
