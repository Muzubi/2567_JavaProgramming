
public class DemoCar {

	public static void main(String[] args) {
		
		Car car = new Car("Chevrolet","cruze",2009,150000.0);
		car.showData();
		System.out.println();
		
		System.out.println("Updated Car Details:");
		car.setCompanyName("Toyota");
		car.setmodelName("Corolla");
		car.setyear(2015);
		//car.setyear(1000);
		//car.setmodelName(" T o yot a ");
		car.showData();
		car.setyear(1000);
		car.setmodelName("");
	}

}
