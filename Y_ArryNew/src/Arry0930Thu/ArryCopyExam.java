package Arry0930Thu;

public class ArryCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5]; //[null][null][null][null][null]
		
	//	for(int i=0; i<oldStrArray.length; i++)
		//	newStrArray[i]=oldStrArray[i]; //["java"]["array"]["copy"][null][null]복사하는 것.

		//System.arrayCopy()
		//arraycopy(소스, 소스의시작index, 타겟, 타겟의시작index,복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		System.out.println("\n----------------------------");

		for(int i=0; i<newStrArray.length; i++) // 이걸 왜 써야하지???????????????????????????
			System.out.print(newStrArray[i] + " "); 
		
		System.out.println("\n----------------------------");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++) // 이걸 왜 써야하지???????????????????????????
			System.out.print(newStrArray[i] + " ");
	}

}
