package Array;

public class Ex05 {

	public static void main(String[] args) {

		double[] scores = { 72.5, 32.4, 48.5, 99.8, 55.4 };
		// ����
		double total = 0;
		for (int i = 0; i < scores.length; i++)
			total = total + scores[i]; // score[0], score[1], ...
		total = 0;

		for (double k : scores) {
			total += k;
		}

		System.out.printf("����:%.2f\n ", total);
		System.out.println("�հ�: " + ((int) (total * 100) / 100.0));
		// ���� for���� �̿��Ͽ�
		// �հ� ��� ���

		double avg = 0;
		avg = total / (double) scores.length;
		System.out.println("���: " + avg);
		System.out.printf("%.3f", avg);

	}

}

/*
 * ],... } //��� avg=total/(double)score.length; System.out.println("���: " +
 * avg);
 * 
 */