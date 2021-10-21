package ch01_02;

public class Ex02 {
	public static void main(String[] args) {
		MyFunctionalInterface fi = new MyFuctionalInterface() {
			@Override
			public void method(int x) {
				;

				System.out.println(x);
			}

		};
		fi.method(10);

		// ¶÷´Ù½Ä
		fi = (int x) -> {
			System.out.println(x);
		};
	}

}
