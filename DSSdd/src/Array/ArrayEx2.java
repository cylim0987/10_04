package Array;

public class ArrayEx2 {

	public static void main(String[] args) {
		//����Ÿ�� 4���� ������ ����� ���� ��� ���ϱ�
		int s1 = 10;
		int s2 = 14;
		int s3 = 5;
		int s4 = 7;
	
		//�迭����
		//Ÿ��(int) [] ������ = new Ÿ��(int) [�����ҿ䱸����];
			int[] scores = new int[4];
			//����Ÿ���� ���� ������� �����ؼ� �����.
			//�迭�� index������ 0����.
			scores[0] = 10;
			scores[1] = 14;
			scores[2] = 5;
			scores[3] = 7; //�迭�� �������� (�������� ���� - 1) ���� index��ȣ.
			
			int sum = 0;
			for(int i=0; i<4; i++) {
				sum = sum + scores[i]; //�迭�� ����� ��� ���� - �迭������[index��ȣ]
			}
			double avg = sum/(double)4;
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
