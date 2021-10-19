package ch01_generics;

public class ObjectEx {

	public static void main(String[] args) {
		A a = new A(10);
		a.method(10);

		a.method(20);
	}
// ??????????????????????????????????¿Ö ¿À·ù°¡ ¶ßÁö
//	Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//	at ch01_generics.A.method(ObjectEx.java:22)
//	at ch01_generics.ObjectEx.main(ObjectEx.java:7)

}

class A {
	Object field;

	A(Object field) {
		this.field = field;
	}
//°´Ã¼ -> Object -> casting
	void method(Object var) {
		System.out.println(Integer.parseInt((String)field)//String
				+ Integer.parseInt((String)var));//Integer
	}
}