package Array;

public class Ex04 {

	public static void main(String[] args) {

		int[] score = {78, 98, 54, 76, 87};
		System.out.println("�迭�� ����: " +score.length);
		//����
		int total = 0;
		for(int i=0; i<score.length; i++) {
			total = total + score[i]; //score[0], score[1], ...
		}
		System.out.println("����: " + total);
		//��� doubleŸ�� ���� ���.
		double avg= 0;
		avg=total/(double)score.length;
		System.out.println("���: " + avg);

	
	total = 0;
	//���� for������ �������ϱ�
	for(int s:score) {
		total +=s; //score[0],score[1],...
	}
	//���
	avg=total/(double)score.length;
	System.out.println("���: " + avg);
	 /* 
			int sum = 0;
			for(int i=0; i<scores.length; i++) {
				sum = sum + scores[i]; //�迭�� ����� ��� ���� - �迭������[index��ȣ]
			}
			double avg = sum/(double)scores.length;
			System.out.println("avg: " + avg);
			
	 * 
	 */
	}
}