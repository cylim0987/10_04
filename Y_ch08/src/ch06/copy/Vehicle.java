package ch06.copy;
/*
import ch06.Vehicle;

public class Drive {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
*/


public interface Vehicle {
	public void run();//추상메소드 실행이없는
}
