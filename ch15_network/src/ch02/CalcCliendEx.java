package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcCliendEx {

	public static void main(String[] args) {
		// 통신에 필요한 객체 선언
		BufferedReader in = null; // in out을 안 넣으니까 import가 안나왔음. 객체 선언이 무엇인지 다시 찾아봐라.
		BufferedWriter out = null;
		// ServerSocket listener = null;//클라이언트는 서버 소켓은 필요 없음. 지워도 됨.
		Socket socket = null;
		Scanner scanner = new Scanner(System.in); // 키보드로부터 값을 입력받아야 하기 때문에 scanner가 필요
		try {
			// 서버와 연결
			socket = new Socket("172.17.17.65", 9999);
			// 스트림 얻기
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 서비스 요청
			while (true) {
				System.out.println("계산식(빈칸으로 띄어 입력, 예: (24 + 42)>>");
				String outputMessage = scanner.nextLine(); // 키보드에서 수식 읽기
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n"); //"bye"전송
					out.flush(); ////// 데이타 밀어내기
					break;//종료
				}
				//수식전달
				out.write(outputMessage+ "\n");
				out.flush();
				//결과 받기
				String inputMessage = in.readLine(); //서버로부터 결과를 한 줄씩 수신
				System.out.println("계산 결과: " + inputMessage);
			
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
				System.out.println("서버와 통신 중 오류 발생");
			}
		}

	}

}
