package Array;

public class Ex13CopyExam {
	public static void main(String[] args) {

		//1. �迭�� ������� �迭�� ���̸� ���� �� �����Ұ�
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10}; // index��ȣ 0,1,2,3,4
		//�� ���� �迭�� ��ġ���� ��� �ؾ��ϴ°�?
		//�� ���� �� ������ �� �ִ� ũ���� ���ο� �迭�� �����ؾ� �Ѵ�.
		int[] arr3 = new int[arr1.length + arr2.length];
		//ù��° �迭 ���� ����
		for(int i=0; i<arr1.length; i++) arr3[i] = arr1[i]; // [1][2][3][4][5][0][0][0][0][0]
		//�ι�° �迭 ���� ����
		//ù��° �迭 ���� �� �ι�° �迭 ����ÿ��� �����index��ȣ ���ĺ��� ����
		//ù��° ����� ���� = 5.
		for(int i=0; i<arr2.length; i++) arr3[arr1.length + i] = arr2[i];
		// [6][7][8][9][10][0][0][0][0][0] -> //[1][2][3][4][5][6][7][8][9][10]
	//	System.out.println(arr3[7]);
		for(int a:arr3)
			System.out.print(a + " ");
		
	}
}

