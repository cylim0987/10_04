package ch01;

//�����ڴ� ��ӿ��� ���ܵ�. �ʵ�� �޼ҵ常 ���.
public class GrandParent {
	public GrandParent() {
		System.out.println("�ֻ��� �θ�����ڴ� ���� ���߿� ȣ�������, ������ ���� ���� �ȴ�.");
	}

}

//��ӵ� Ŭ������ �����Ͻ� �ڽĻ����ڿ� super()�޼ҵ尡 �ڵ��߰���.
class Parent extends GrandParent {
	public Parent() {
			//super();
		System.out.println("�ڽ�Ŭ�����κ��� ȣ��� �� �θ�Ŭ������ ȣ��, �θ�Ŭ���� ���� �� �����.");
	}

}

class Child extends Parent {

	public Child() {
		System.out.println("���� ���� ȣ�������, ������ �θ������ �Ϸ� �� ���� ���߿� �����.");
	}

}
