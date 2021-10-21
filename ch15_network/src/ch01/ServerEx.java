package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999); // cmd / netstat -aon ���� �Ⱦ���.
			System.out.println("������ ��ٸ��� �ֽ��ϴ�....");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			// ��� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// ����Ÿ �ְ�ޱ�
			while (true) {
				String inputMessage = in.readLine(); // Ŭ���̾�Ʈ�κ��ͺ��� �� �྿ �б�
				// ���� ����
				if (inputMessage.equalsIgnoreCase("bye")) {// Bye, bYe, bYE ,BYE
					System.out.println("Ŭ���̾�Ʈ�κ��� bye�� ������ �����մϴ�.");
					break;// ���� ����
				}
				System.out.println("Ŭ���̾�Ʈ: " + inputMessage);
				System.out.print("������>>");
				String outputMessage = scanner.nextLine(); // Ű����κ��� �� �྿ ������
				out.write(outputMessage + "\n"); // ���پ� �޵��� ����
				out.flush(); // ���ۿ� �����ִ� ����Ÿ �о��

			}

		} catch (Exception e) {

		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();

			} catch (Exception e) {// ����ó��....
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ���� �߻�");
			}
		}
	}
}
