package ch06;

public class DriveExample {

	public static void main(String[] args) {
		Drive drive = new Drive();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// 매개변수의 다형성 Vehicle vehicle = bus;
		drive.drive(bus);
		drive.drive(taxi);
		drive.drive(new Bus()); // Vehicle vehicle = new Bus();

	}

}
