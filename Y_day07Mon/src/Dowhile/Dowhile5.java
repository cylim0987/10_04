package Dowhile;

import java.util.Scanner;

public class Dowhile5 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int ran = (int)(Math.random()*100)+1; // 100 + 1) // 100) +1
	int cnt = 1;
	do {
		System.out.println("1부터 100까지의 숫자 입력!");
		int num = scanner.nextInt();
		if(num ==ran) {
			System.out.println("정답" + cnt + "번 만에 맞췄습니다.");
			break;//break문을 감싸고 있는 반복문 블럭을 벗어나는 명령문;
		}else if(num > ran) {
			System.out.println("입력된 숫자가 랜덤숫자보다 큽니다.");
		}else {
			System.out.println("입력된 숫자가 랜덤숫자보다 작습니다.");
		}
		cnt++;
	}while(true); //무한 반복
	
 }
}
