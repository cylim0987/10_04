package Ch04Exercise;

import java.util.Scanner;

public class Ch04Exercise7 {
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
	
		int menuNum = scanner.nextInt();
	
		switch(menuNum) {
		case 1:
			System.out.println("���ݾ�> ");
			balance += scanner.nextInt();
			break;
		case 2:
			System.out.println("��ݾ�> ");
			int money = scanner.nextInt();
			if(balance - money >0) 
			balance -= money;
			break;
			
		case 3:
			System.out.print("�ܰ�> ");
			System.out.println(balance);
			break;
		case 4:
			run = false; //run = !run;
			break;
		}//switch��
		System.out.println();
	
	}//while��
		
	System.out.println("���α׷� ����");
	
	}

}