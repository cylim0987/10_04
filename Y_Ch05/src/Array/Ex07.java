package Array;

public class Ex07 {

	public static void main(String[] args) {

		//���� for������ �����ؼ� �ִ밪, �ּҰ�, ����� ���Ͻÿ�
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		System.out.println("�迭�� ����" + score.length);
		
		
		for(int k:score) {
			System.out.println();
		}
			
/*
		int[] n = {12,20,67,567,21};
		System.out.println("�迭�� ����: " +n.length);
		
		for(int i=0; i<n.length; i++)
			System.out.println("["+i+"]=" +n[i]);
	
		System.out.println("���� for��");
		//���� for��
		for(int k:n) {
			System.out.println(k);	
	*/	
			
			
			
			
			
	}
}
		
	/*	
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
		*/