package ch06_methods_01;

public class Ex02 {

	public static void main(String[] args) {

		B1 b1 = new B1();
		int result = b1.add(10, 20);
		System.out.println(result);
		float res2 = b1.add2(10, 20);
		System.out.println(res2);
		
	}
}




class B1{
	//1����
	int add(int x, int y) {
		return x+y;
	}
	//1���� �Ű����� �޴� ���� ������ �޾Ƽ� ó�� �� ����� floatŸ������ ��ȯ�ؼ� ����
	//int -> float �ڵ� ����ȯ
	float add2(int x, int y) {
		return x+y;
	}
}