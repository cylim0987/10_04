package ch06;

public class DriveExample {

	public static void main(String[] args) {
		Drive drive = new Drive();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// �Ű������� ������ Vehicle vehicle = bus;
		drive.drive(bus);
		drive.drive(taxi);
		drive.drive(new Bus()); // Vehicle vehicle = new Bus();

	}

}
