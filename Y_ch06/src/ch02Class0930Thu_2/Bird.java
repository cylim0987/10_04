package ch02Class0930Thu_2;

public class Bird extends Animal{
	String name = "새";

	@Override
	void run() {
		System.out.println(name + "가 날아갑니다.");
		//super.run();
	}
	
}
