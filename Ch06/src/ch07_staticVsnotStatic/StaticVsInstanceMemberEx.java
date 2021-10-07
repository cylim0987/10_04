package ch07_staticVsnotStatic;

public class StaticVsInstanceMemberEx {

	public static void main(String[] args) {

		//static�� this�� �� ���� ����.-. �� this���Ұ��ΰ�? ���� : 
			//instance�� Ŭ������ �ƴϴ�, �ν��Ͻ��� ��ü, Ŭ������ ���赵.
			// new a>0�� ���Ŀ� this�� �� �� �ִ�. instance�� ������ ������ �ֱ� ����.
		
		//static�� Ŭ������. �ν��Ͻ��� �ƴ϶�. static�� ���� ��������� instance�� �ڿ� ��������� ������. ������� ���Ŀ� . 
		//static instance. 
		
		
		
	}

}

class A1 {
	// �ν��Ͻ� �ʵ�� �޼ҵ�
	static int field1; 
	void method1() { // �տ� static.
	}

	// ���� �ʵ�� �޼ҵ�
	static int field2;
	static void method2() {}

	// �ν��Ͻ� �޼ҵ忡�� ���� Ŭ�������� static���, instance��� ��� ����(ȣ��) ����.
	// �ν��Ͻ� �޼ҵ忡�� ���� Ŭ�������� static���, instance��� ��� ����(ȣ��) ����.
	// �ν��Ͻ� �޼ҵ忡�� ���� Ŭ�������� static���, instance��� ��� ����(ȣ��) ����.
	void method4() {
		this.field1 = 0; // �ν��Ͻ� �ʵ�
		field2 = 10; // static �ʵ�
		this.method1(); // �ν��Ͻ� �޼ҵ�
		method2(); // static �޼ҵ�
	}

	// static �޼ҵ� ������ static���� ����� ���(�ʵ�� �޼ҵ�)�� ���� ����
	static void method3() { 
		//field1=0; // �ν��Ͻ� �ʵ�
		//this.field1=10; //this Ű���� ���Ұ�.
		field2=10; // static �ʵ�
		//method1(); // �ν��Ͻ� �޼ҵ�
		//this.method1(); //this.Ű���� ���Ұ�.
		method2(); // static �޼ҵ�
}
// �ν��Ͻ��� ������µ� static���� �̷� ������ �߻�.
}
