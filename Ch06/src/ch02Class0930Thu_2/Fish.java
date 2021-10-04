package ch02Class0930Thu_2;

public class Fish extends Animal{
 String name = "물고기";

@Override
void run() {
	System.out.println(name + "가 헤엄칩니다.");
	//super.run();
}
}
