package Arry0930Thu;

public class ArryCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5]; //[null][null][null][null][null]
		
	//	for(int i=0; i<oldStrArray.length; i++)
		//	newStrArray[i]=oldStrArray[i]; //["java"]["array"]["copy"][null][null]�����ϴ� ��.

		//System.arrayCopy()
		//arraycopy(�ҽ�, �ҽ��ǽ���index, Ÿ��, Ÿ���ǽ���index,������ ����)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

		System.out.println("\n----------------------------");

		for(int i=0; i<newStrArray.length; i++) // �̰� �� �������???????????????????????????
			System.out.print(newStrArray[i] + " "); 
		
		System.out.println("\n----------------------------");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++) // �̰� �� �������???????????????????????????
			System.out.print(newStrArray[i] + " ");
	}

}
