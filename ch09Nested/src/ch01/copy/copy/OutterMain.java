package ch01.copy.copy;

public class OutterMain {
	public static void main(String[] args) {
	
		//�ν��Ͻ� ��ü ����
		A a = new A();
		A.B b = a.new B();
		b.print();
		
		
		
	}
}
/*
		//�ν��Ͻ� ��ü ����
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();


		//Ŭ����. static����� ���� 
		A.C c = new A.C();
		//C�� �ν��Ͻ� ���
		c.field1 = 3;
		c.method1();
		//C�� static ���
		A.C.field2 = 3;
		//A.class.method2();
		
	}

}

*/

