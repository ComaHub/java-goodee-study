package sec02.exam03;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); => 호출 불가!
		
		Bus bus = (Bus) vehicle;
		bus.checkFare();
	}
}
