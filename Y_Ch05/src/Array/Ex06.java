package Array;

public class Ex06 {

	public static void main(String[] args) {

		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
	//max������ �迭�� ���麸�� �����ϰ� ������ �����Ͽ� ����
	//min������ �迭�� ���麸�� �����ϱ� ū �� �����Ͽ� ����
		int sum=0, max=0, min=100;
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
			if(max < score[i]) max=score[i];//
		}
		System.out.println("�ִ밪: " + max);	

		for(int i=0; i<score.length; i++) {
			if(min >score[i]) min=score[i];
		}
		System.out.println("�ּҰ�: " + min);

		System.out.println("�հ�: " + sum);
		System.out.println("���: " + sum/(double)score.length);
	
	}

}
