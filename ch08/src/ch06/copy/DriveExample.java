package ch06.copy;

public class DriveExample {

	public static void main(String[] args) {
		Drive drive = new Drive();
/*
		Vehicle vehicle;
		Taxi taxi = new Taxi();
		
		Bus bus = new Bus();
		vehicle = taxi;
		taxi = (Taxi)vehicle;
		taxi.checkFare();
		
		vehicle = bus;
		bus = (Bus)vehicle;
		bus.checkFare();
		...
	*/	
		
		//�Ű������� ������
		drive.drive(new Bus());
		drive.drive(new Taxi());

	}

}
