package Array;

public class Ex007 {

	public static void main(String[] args) {

		//���� for������ �����ؼ� �ִ밪, �ּҰ�, ����� ���Ͻÿ�
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum=0, max=0, min=100;
		
		for(int e:score) {
			sum+=e;
			if(max < e ) max = e;//max������ score���� ũ�� ��ȯ	
		{	
		System.out.println("�ִ밪: " + max);
			
		for(int j:score)
			if(min >j ) min=j; //min������ score���� ������ ��ȯ
		}
			System.out.println("�ּҰ�: " +min);
			System.out.println("�հ�: " +sum);
			System.out.println("���: " +sum/(double)score.length);
		}
	}
}		
