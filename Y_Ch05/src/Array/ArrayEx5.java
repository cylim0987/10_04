package Array;

public class ArrayEx5 {

	public static void main(String[] args) {
		//����Ÿ�� 4���� ������ ����� ���� ��� ���ϱ�
		int s1 = 10;
		int s2 = 14;
		int s3 = 5;
		int s4 = 7;
	
		//�迭����
		//Ÿ��(int) ������ [] = {�ʱⰪ1, �ʱⰪ2, �ʱⰪ3, �ʱⰪ4, ... };
		//�迭�� ������ ������ �ʱⰪ�� �˰� ���� ���� �ʱⰪ���� �迭�� �ٷ� �ʱ�ȭ�ϸ鼭 ��������.	
		//������ scores.length�� {}�� ����� ������ �ʱ�ȭ��.
		int scores [] = {10, 14, 5, 7};
		System.out.println(scores.length);
				
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
				sum = sum + scores[i]; //�迭�� ����� ��� ���� - �迭������[index��ȣ]
			}
			double avg = sum/(double)scores.length;
			System.out.println("avg: " + avg);
			
			
			
	/**		
		
		//�������� for�� �Ұ�
		int sum = 0;
		int cnt = 0;
		sum = sum + s1;
		cnt++;
		sum+=s2;
		cnt++;
		sum+=s3;
		cnt++;
		sum+=s4;
		cnt++;
		
		double avg = sum/(double)cnt;
		System.out.println("���: "+ avg);
**/
	
	
	}

}
