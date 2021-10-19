package ch01_generics;

public class MyClassMain {
	public static void main(String[] args) {
		// 컴파일시 T -> Integer로 변환
		MyClass<Integer> s = new MyClass<>();// 마이클래스 화살표괄호에 Integer생략해도 됨.
		// s.set("hello"); //Integer로 했는데 문자열이 들어가서 오류.
		s.set(10);// 10-> Integer10으로 autoBoxing되어 들어감
		s.set(new Integer(10));
		System.out.println(s.get());// 10

		//컴파일시 T -> String으로 변환
		MyClass<String> s1 = new MyClass<String>();
		//s1.set(10); //String인데 숫자갇 들어가서???
		s1.set("hello");
		System.out.println(s1.get());
		
		MyClass<Double> s2 = new MyClass<Double>();// 마이클래스 화살표괄호에 Double생략해도 됨.
		s2.set(10.0);
		s2.set(new Double(10.0));
		System.out.println(s2.get());
		
		
	}
}
