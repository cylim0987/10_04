package For;

import java.util.Scanner;

public class ForExam4 {
	public static void main(String[] args) {
//구구단
	Scanner scanner = new Scanner(System.in);
	System.out.println("보고 싶은 구구단은?");
	int num = scanner.nextInt();
	System.out.println("구구단 " + num + "단");
	for (int i = 1; i <= 99999; i++) {
		System.out.println(num + " * " + i + "=" + num * i);
	}
		
	}
}
	
