package Continue;

import java.util.Scanner;

public class Continue4 {

	public static void main(String[] args) {

	// 5개의 정수를 키보드로부터 입력받고 그 중 양수들만 합한 결과 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요: ");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt(); //키보드에서 정수 입력
			if(n<0) 
			  continue; //양수가 아닌 경우 다음 반복으로 진행
			else
				sum+=n; //양수인 경우 더하기
		}
		System.out.println("양수의 합은: " + sum);
	}

}
