package Arry0930Thu;

public class ArryCopyExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5]; //[null][null][null][null][null]
		
		//	for(int i=0; i<oldStrArray.length; i++)
		//	newStrArray[i]=oldStrArray[i]; //["java"]["array"]["copy"][null][null]복사하는 것.

		//System.arrayCopy() - 깊은 copy, 새로운 배열을 생성한 후에 사용.
		//arraycopy(소스, 소스의시작index, 타겟, 타겟의시작index,복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

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
	
	
	
	}

}
