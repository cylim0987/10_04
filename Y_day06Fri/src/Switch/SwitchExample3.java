package Switch;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {

		//������, ȭ, ��, ��, ��, ��, ��
		//��~����� : ������ �����մϴ�.
		//�ݿ��� : ������ �մϴ�
		//��~�Ͽ��� : ������ ���ϴ�.
		
		// : : : : �� ����ϱ�.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է����ּ���(ex:������)");
		String weekDay = scanner.next();
		switch(weekDay) {
		
		//random()�� �̿��ؼ� ���� ���
		// int weekDay = (int)(Math.random()*7); // 0<=7;
	
		case "������": 
		case "ȭ����":
		case "������":
		case "�����": System.out.println("������ �����մϴ�.");
			break;
		case "�ݿ���" : System.out.println("������ �����մϴ�.");
			break;
		case "�����":
		case "�Ͽ���" : System.out.println("������ �մϴ�");
			break;
		default : System.out.println("�߸��� �����Դϴ�.");	
		}
		
	}

}
