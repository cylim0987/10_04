package ch03.copy;

public interface MyInterface {
	void method1();

	//�������̽� ���� ��ü�� �ִ� �޼ҵ�, ������ ������ ���ʿ�(���ص���)
	default void method2() {} //default�� �ٿ� ��ü �޼ҵ�� ����.

	default void method3() {}
	
	default void method4() {}
}

