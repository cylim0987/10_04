package ch06.copy;

public class Drive {

	public void drive(Vehicle vehicle) {// 메소드의 매개변수에 Vehicle
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}

		vehicle.run();

	}
}
