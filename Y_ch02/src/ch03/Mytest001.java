package ch03;

public class Mytest001 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		
		double y = 13.3;
		System.out.println(y);
		
		System.out.println(x+y);
		
		// x + y�� �Ҽ����� ���� ����� ������ �Ϸ��� ��� �ؾ��ϳ�?
		
		//(int x + double y); - ����.. �̷��� ���°� �ƴ�
		
		long z = 17; //long�� ����������.
		System.out.println(y+z);

		
	// ���� + ������ ���� ����� ������ ���. -> ������ ���� Ÿ�԰� ������ ���� Ÿ���� ��������. ������ ���� Ÿ������ ����� �ȴ�.
		int a = 10;
		double b = 15.2;
		// x + y�� �Ҽ����� ���� ����� ������ �Ϸ��� ��� �ؾ��ϳ�? - 
		//doubleŸ���� ���� y�� ������ int(����)Ÿ������ ��ȯ
		// ����ȯ->(casting)
		int result = a +(int)b;
		System.out.println(a+b);
		System.out.println(result);
		// 10 -> 10.0(���� -> �Ǽ�), 10.0 + 15.2 = 25.2
		
	// ���� + �Ǽ��� ���� ����� �Ǽ��� ������� ���.
		int a2 = 5; //����
		double b2 = 2.0; //�Ǽ�
		System.out.println(a2+b2); 
		// 5 -> 5.0(���� -> �Ǽ�:jvm���������� �ڵ� ó����.), 5.0 + 2.0 = 7.0;
		
	}

}
