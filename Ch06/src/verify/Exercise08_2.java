package verify;
// 8) �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���϶�(��ø for�� �̿�)

public class Exercise08_2 {
// int num�� ���� ���ߴ�. for �ȿ��� ���� �����Ǿ�� �ϴµ�...
// array.length�� 1���� �迭�� �׸����. 0�ε����� 2��, 1�ε����� 3��, 2�ε����� 5��.
	public static void main(String[] args) {
	
				int[][] array = { //2���� �迭�ε� 1���� �迭�� �׸���� 3��, 0�ε����� 2�� 1�ε����� 3�� 2�ε����� 5��. 
						{ 95, 86 },						// 0 1
						{ 83, 92, 96 },					// 0 1 2
						{ 78, 83, 93, 87, 88 } };		// 0 1 2 3 4
				
				int sum = 0;
				double avg = 0.0;
				
				//count ���� ����. �迭�� �׸� ���� �ϳ��� ������ �� ����. �׷��� ���߿� sum���� count�� �����Ŵ�
				int num = 0; // 
				for(int i=0; i<array.length; i++) { //array.length�� 3. 
					for(int j=0; j<array[i].length; j++) { // j.. 2�� 3�� 5�� ���ƾ��ϴϱ�. array�� i�ε����迭.�� length��ŭ ���ƶ�.
				//		System.out.println(array[i][j]);
					
						sum = sum + array[i][j]; //array i�ε��� ���� j�ε��� ��
				
						num++;
						System.out.println(array[i].length);
						
					}
				}
				avg = (double)sum/num;
				System.out.println("���� : " + sum);
				System.out.println("��� : " + avg);
				System.out.println(array.length);
				
				System.out.println();
				System.out.println(array[0].length);
				System.out.println(array[1].length);
				System.out.println(array[2].length);
				System.out.println();
				System.out.println(array[0][0]);
				System.out.println(array[0][1]);
				System.out.println(array[1][0]);
				System.out.println(array[1][1]);
				System.out.println(array[1][2]);
				System.out.println(array[2][0]);
				System.out.println(array[2][1]);
				System.out.println(array[2][2]);
				System.out.println(array[2][3]);
				System.out.println(array[2][4]);
				
	}
	}