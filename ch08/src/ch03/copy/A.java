package ch03.copy;

public class A implements MyInterface {

	@Override
	public void method1() {
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		MyInterface.super.method4();
	}

}

class B implements MyInterface {
	@Override
	public void method1() {
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

}

class C implements MyInterface {
	@Override
	public void method1() {
	}


	@Override
	public void method3() {
		// TODO Auto-generated method stub

	}

}
