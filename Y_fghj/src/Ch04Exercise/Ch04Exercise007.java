package Ch04Exercise;

import java.util.Scanner;

public class Ch04Exercise007 {
public static void main(String[] args) {

	//�ݺ�ó���� ���ǹ�Ȯ�� ����
	boolean run = true;
	//����ݾ� ����
	int balance = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	
	while(run) { //run�� trueó�����ͽ���ȴ�.(?)

		System.out.println("------------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("------------------------------");
		System.out.println("����> ");
	
		int menu = scanner.nextInt();
		
		if(menu==1) {
			System.out.print("���ݾ�>");
			balance = balance + scanner.nextInt();

		}else if(menu==2) {
			System.out.print("��ݾ�>");
			balance = balance - scanner.nextInt();
		
		}else if(menu==3) {
			System.out.println("�ܰ�>" + balance);
		}else if(menu==4) {
			run = !run;
		}else {
			System.out.print("�޴���ȣȮ��-");
		
		}
	}
		
	System.out.println("���α׷� ����");
	
	}

}