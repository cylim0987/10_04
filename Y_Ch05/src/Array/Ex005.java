package Array;

public class Ex005 {

	public static void main(String[] args) {

		double[] scores = {72.5, 32.4, 48.5, 99.8, 55.4};
		//����
		double total = 0;
		for(double i=0; i<scores.length; i++) {
		total += scores[i]; //score[0], score[1], ...
		}
		System.out.println("����: " + total);
			
		//���� for���� �̿��Ͽ�
		//�հ� ��� ���
		double total;
		for(int s:scores) {
		total =+s;
		}
		double avg= 0;
		avg=total/(double)scores.length;
		System.out.println("���: " + avg);
	
	}

}

/*],...
}
//���
avg=total/(double)score.length;
System.out.println("���: " + avg);

*/