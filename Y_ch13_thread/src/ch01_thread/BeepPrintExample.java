package ch01_thread;

import java.awt.Toolkit;

//싱글쓰레드방식 . 순차적으로
public class BeepPrintExample {
	public static void main(String[] args) {
		//Runnable인터페이스 객체 생성
		//2.Runnable 인터페이스 객체 생성
		Runnable beep task = new BeepTask();
		//3.Thread의 생성자로 전달하여 Thread객체 생성
		Thread thread = new Thread(beepTask);
		//4.생성된 
		
		
		// beep음 출력용객체 생성
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 소리가 난다!
			try {
				Thread.sleep(500); // 0.5초간 정지
			} catch (Exception e) {
			}
		}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%////

		for (int i = 0; i < 5; i++) {
			System.out.println("띵"); // 소리가 먼저 울리고 난 후에 출력된다.
			try {
				Thread.sleep(500); // 0.5초간 정지
			} catch (Exception e) {
			}

		}

	}

}
