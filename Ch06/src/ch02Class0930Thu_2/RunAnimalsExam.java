package ch02Class0930Thu_2;

public class RunAnimalsExam {

	public static void main(String[] args) {
		Fish fish = new Fish();
		Bird bird = new Bird();
		Dog dog = new Dog();
		
		System.out.println(fish.name);
		System.out.println(bird.name);
		System.out.println(dog.name);
		fish.run();
		bird.run();
		dog.run(); //저장 안해서 오류떴음.;
			
	}

}
