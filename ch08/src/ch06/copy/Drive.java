package ch06.copy;

public class Drive {

	public void drive(Vehicle vehicle) {// �޼ҵ��� �Ű������� Vehicle
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}

		vehicle.run();

	}
}
