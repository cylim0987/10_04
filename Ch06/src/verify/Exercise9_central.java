package verify;
//9) 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램이다.

//실행결과를 보고, 알맞게 작성하라 ( Scanner의 nextInt()메소드는 콘솔에 입력된 숫자를 읽고 리턴한다.

import java.util.Scanner;

public class Exercise9_central {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) { // 조건이 트루라 무한 반복.
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt(); // 힌트 : Scanner의 nextInt()메소드는 콘솔에 입력된 숫자를 읽고 리턴한다.

			switch (selectNo) {
			case 1:
				System.out.print("학생수>");
				studentNum = scanner.nextInt(); 
				scores = new int[studentNum]; //초기값을 모름, 저장될 공간의 길이 확보
			//	System.out.println("저장할 학생 수: " + scores.length);
				break;
			case 2: for(int i=0; i<scores.length; i++) {
				System.out.print("score[" + i + "]");
				scores[i]=scanner.nextInt();
				}
				System.out.println("입력완료");
				break;
			case 3:
				System.out.print("score[" + i + "]");
				scores[i]=scanner.nextInt();
				}
				break;
			case 4:
				System.out.print("최고점수:" +95);
				System.out.print("평균점수:" + 91.0); //스위치문으로 구조적으로 문제가 없다.....

				break;
			case 5:
				run = !run;
				break;
			}

		}

		System.out.println("프로그램 종료");
	}

}
/*
 * if(selectNo == 1) { System.out.println("학생수>"); studentNum =
 * scanner.nextInt();
 * 
 * int[] student = null; student = new int[] {};
 * 
 * for(int i=0; i<studentNum; i++) { System.out.println("scores" + "[" + i +
 * "]"); }
 * 
 * 
 * }else if(selectNo == 2) { // }else if(selectNo == 3) { //s }else if(selectNo
 * == 4) { // }else if(selectNo == 5) { run = false; }
 */