package ch01;

import java.awt.Toolkit;

//�̱۾������� . ����������
public class BeepPrintExample {
	public static void main(String[] args) {
		// beep�� ��¿밴ü ����
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // �Ҹ��� ����!
			try {
				Thread.sleep(500); // 0.5�ʰ� ����
			} catch (Exception e) {
			}
		}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%////

		for (int i = 0; i < 5; i++) {
			System.out.println("��"); // �Ҹ��� ���� �︮�� �� �Ŀ� ��µȴ�.
			try {
				Thread.sleep(500); // 0.5�ʰ� ����
			} catch (Exception e) {
			}

		}

	}

}
