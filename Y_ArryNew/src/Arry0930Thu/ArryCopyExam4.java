package Arry0930Thu;

import java.util.Arrays;

public class ArryCopyExam4 {
// ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5]; //[null][null][null][null][null]

		
		//deep copy
		//ArraysŬ������ copyOf(�ҽ��迭, ������ ����) => ���ο� �迭 ��ü ����
		String[] arr2 = Arrays.copyof(oldStrArray,0, oldStrArray.length);//??????????????????????????????
		for(int i=0; i<arr2.length; i++) // �̰� �� �������???????????????????????????
			System.out.print(arr2[i] + " "); 
		
		System.out.println();
		arr2[0] = "hi";
		for(int i=0; i<arr2.length; i++)
			System.out.print(arr2[i]);
	/*
		for(int i=0; i<newStrArray.length; i++) // �̰� �� �������???????????????????????????
			System.out.print(newStrArray[i] + " "); 
		
		System.out.println("\n----------------------------");
		//java.lang.ArrayIndexOutOfBoundsException : �ҽ��� ������ 2���ε� ������ ���̸� 3���� �ϸ� ���� (��1��)
		//java.lang.ArrayIndexOutOfBoundsException : �ҽ��� ������ 2���ε� Ÿ�ٹ迭�� �ε�����ȣ�� �ʰ��� ���� (��2��)
		
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length-1);
		// 							 (��1��)���ڼ���	(��2��)Ÿ���� �ε��� ��ȣ
		for(int i=0; i<newStrArray.length; i++) // �̰� �� �������???????????????????????????
			System.out.print(newStrArray[i] + " ");

		System.out.println();
		int srcPos = 1;
		int num = oldStrArray.length - srcPos;// 3-1=2
		System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
		for(int i=0; i<newStrArray.length; i++) // �̰� �� �������???????????????????????????
			System.out.print(newStrArray[i] + " ");
	
	*/
	
	}

}
