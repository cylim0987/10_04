package ch07_initialBlock;

public class Init3Ex {

	public static void main(String[] args) {
		System.out.println("�ʱ�ȭ �׽�Ʈ");
		Block b1 = new Block(); //��� b123 �ּ����� �����鼭 �ֶܼ�����.
		Block b2 = new Block();
//		Block b3 = new Block();
	}

}

//���� ���� - static�ʱ�ȭ -> �ν��Ͻ� �ʱ�ȭ -> ������
//static�� instance���� ������! ��� ������ ���.
class Block{
	{//�ν��Ͻ� �ʱ�ȭ ��
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
	}
	//static�� Ư�� - uniqueƯ�� - ���� Ŭ���� �ε�� �ѹ��� ����.
	static {//static �ʱ�ȭ ��
		System.out.println("Ŭ����-static �ʱ�ȭ ��");
	}
	//������
	Block(){
		System.out.println("������");
	}
}





