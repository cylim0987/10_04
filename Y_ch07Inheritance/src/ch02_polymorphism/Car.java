package ch02_polymorphism;

public class Car {
 //필드 초기화 int i=10;
	
 //Tire tire = new tire();
 //Tire tire = new HankookTire();
	Tire tire = new KumhoTire();
}
class Tire{
	void run() {}
	
}
class HankookTire extends Tire{}
class KumhoTire extends Tire{}
