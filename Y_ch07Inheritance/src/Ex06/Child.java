package Ex06;

public class Child extends Parent {
	private String name;

	public Child() {
		this("홍길동");
		System.out.println("Child() call"); //4
	}

	public Child(String name) {
		super(); // Parent쪽으로
		this.name = name;
		System.out.println("Child(String name) call"); //3

	}
}