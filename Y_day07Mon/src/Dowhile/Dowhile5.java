package Dowhile;

import java.util.Scanner;

public class Dowhile5 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int ran = (int)(Math.random()*100)+1; // 100 + 1) // 100) +1
	int cnt = 1;
	do {
		System.out.println("1���� 100������ ���� �Է�!");
		int num = scanner.nextInt();
		if(num ==ran) {
			System.out.println("����" + cnt + "�� ���� ������ϴ�.");
			break;//break���� ���ΰ� �ִ� �ݺ��� ���� ����� ��ɹ�;
		}else if(num > ran) {
			System.out.println("�Էµ� ���ڰ� �������ں��� Ů�ϴ�.");
		}else {
			System.out.println("�Էµ� ���ڰ� �������ں��� �۽��ϴ�.");
		}
		cnt++;
	}while(true); //���� �ݺ�
	
 }
}
