package ch05;

public class ReferencesNullExam {

	public static void main(String[] args) {
		String str1 = new String("ȫ�浿");
		System.out.println(str1);
		//���
		str1=null;
		System.out.println(str1);//null
	}

}
