package ch06_methods_ValuePassingVs_ReferencePassing_02;
public class ReferencePassing {
	public static void main(String[] args) {

		//Circle��ü ����
		Circle pizza = new Circle(10);
		
		//�Ű������� ��ü�� ����
		increase(pizza);
	
		//���?
		System.out.println(pizza.radius); //11
	}

	static void increase(Circle m) { // Ʋ�� �κ��� �� ã�� ���� ctrl + F�� Ȱ���غ���. ���� ã�ҳ�...
		m.radius++; //11
	}
}

class Circle{
	//�ʵ�
	int radius;
	
	//������
	Circle(int r){
		radius = r;
	}
}


