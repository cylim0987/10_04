package Array2;

import java.util.Scanner;

public class Exam001 {

	public static void main(String[] args) {
		// 1. id="hong", pwd="1234"
				// id와 pwd를 scanner로 입력받아서 id와 pwd가 둘다 같으면 "login성공",
				// 아니면 "1회 실패하였습니다". 출력
				// 5회 실패하면, "5회 실패하였습니다. 프로그램을 종료 합니다" 출력 후 종료
		Scanner scanner = new Scanner(System.in);

		int count;
		count = 0;

		while (true) {
			System.out.println("id를 입력하세요");
			String id;
			id = scanner.nextLine(); //그냥 next만 해도 된다!

			System.out.println("pwd를 입력하세요");
			String pwd;
			pwd = scanner.nextLine(); //그냥 next만 해도 된다. 없애려면 위에 id랑 같아야됨.

			if (id.equals("hong") && pwd.equals("1234")) {
				System.out.println("login성공");
				break;
			} else {
				count++;
				System.out.println(count + "회 실패하였습니다.");
				if (count == 5) {

					break;
				}

			}
		}

		System.out.println("프로그램을 종료합니다.");
	}
}
