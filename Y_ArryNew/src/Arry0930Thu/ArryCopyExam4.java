package Arry0930Thu;

import java.util.Arrays;

public class ArryCopyExam4 {
// 복사
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5]; //[null][null][null][null][null]

		
		//deep copy
		//Arrays클래스의 copyOf(소스배열, 복사할 길이) => 새로운 배열 객체 생성
		String[] arr2 = Arrays.copyof(oldStrArray,0, oldStrArray.length);//??????????????????????????????
		for(int i=0; i<arr2.length; i++) // 이걸 왜 써야하지???????????????????????????
			System.out.print(arr2[i] + " "); 
		
		System.out.println();
		arr2[0] = "hi";
		for(int i=0; i<arr2.length; i++)
			System.out.print(arr2[i]);
	/*
		for(int i=0; i<newStrArray.length; i++) // 이걸 왜 써야하지???????????????????????????
			System.out.print(newStrArray[i] + " "); 
		
		System.out.println("\n----------------------------");
		//java.lang.ArrayIndexOutOfBoundsException : 소스의 개수가 2개인데 복사할 길이를 3으로 하면 오류 (위1번)
		//java.lang.ArrayIndexOutOfBoundsException : 소스의 개수가 2개인데 타겟배열의 인덱스번호를 초과시 오류 (위2번)
		
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length-1);
		// 							 (위1번)숫자순서	(위2번)타겟의 인덱스 번호
		for(int i=0; i<newStrArray.length; i++) // 이걸 왜 써야하지???????????????????????????
			System.out.print(newStrArray[i] + " ");

		System.out.println();
		int srcPos = 1;
		int num = oldStrArray.length - srcPos;// 3-1=2
		System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
		for(int i=0; i<newStrArray.length; i++) // 이걸 왜 써야하지???????????????????????????
			System.out.print(newStrArray[i] + " ");
	
	*/
	
	}

}
