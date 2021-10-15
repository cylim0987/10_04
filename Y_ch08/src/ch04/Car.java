package ch04;

public class Car { //이걸 배열로 바꿔보라. 
	Tire fLTire = new HankookTire();
	Tire fRTire = new HankookTire();
	Tire bLTire = new KumhoTire();
	Tire bRTire = new KumhoTire();
	
	void run() {
		fLTire.roll();
		fRTire.roll();
		bLTire.roll();
		bRTire.roll();
	}


public static void mian(String[] args) {
	Car myCar = new Car();
	myCar.run();
}
}


