package verify;

//SoundableExample 클래스에서 printSound() 메소드는 Soundable 인터페이스 타입의 매개
//변수를 가지고 있습니다. main() 메소드에서 printSound()를 호출할 때 Cait과 Dog 객체를 주
//고 실행하면 각각 “야옹”과 “멍멍”이 출력되도록 Cat과 Dog 클래스를 작성해보세요.
public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}  

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}