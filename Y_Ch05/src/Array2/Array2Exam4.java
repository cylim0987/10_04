package Array2;

/*2�� 3���� 2���� �迭 ����
* 1,2, 4,5,6
* 1,2
* 4,5,6
*/

public class Array2Exam4 {

	public static void main(String[] args) {
			//�ʱⰪ���� 2���� �迭 ����, 1�����迭 �ΰ��� 2���� �迭 �ϳ� ����
			//Ÿ��[][] ���� = new Ÿ�� [][] {{},{}};
		int[][] scores = new int [][] {{1,2},{4,5,6}};
		
		scores[0][0]=1; scores[0][1]=2; 
		scores[1][0]=4; scores[1][1]=5; scores[1][2]=6;
		//2�������� length�� ���� 1���� �迭�� ���� �ǹ�
		System.out.println("1�����迭�� ����:" + scores.length);//2
		
		System.out.println("�� 1�����迭�� ����� ��: " + scores[0].length);
		System.out.println("�� 1�����迭�� ����� ��: " + scores[1].length);
		
		//���
		for(int i=0; i<scores.length; i++) {//i�� scores.length�� 1�����迭�� ����//1���� ���� ����
			for(int j=0; j<scores[i].length; j++) {//j�� �� ���� 1���� �迭�� ��Ҽ�
			System.out.print(scores[i][j] + " ");			
			}
			System.out.println();

		//���� for���� �̿��Ͽ� 2���� �迭�� ��ҵ������ ����ϼ���.
		// int ->int[] -> int[][] -> int[][][]
		for(int[] s1:scores) {
			for(int s:s1) {
				System.out.println(s);
			}
			System.out.println();
		}
			
		}
	}
}