package Array;

public class A {
	//Ÿ��[] ������;
	//String[] args
	//main() �޼ҵ���
	//�Ű������κ�()�� ���� �迭 String[] args
	//�� ���̰� �������������� �迭
	//�ڹ����α׷� ����� argument�� �����ؼ� �����Ѵ�.
	//argument�� ������ŭ String[] �迭�� �����Ǿ ����.
	//java A hello world my name is �浿
	//=> String[] args={hello,world,my,name,is,�浿};
	public static void main(String[] args) {
		//���α׷� ���� �� (argument,����, �Ű�����(StringŸ���Ǻ���))�� �༭ ���ϴ� ����� �������. args�� �迭�̴�.
		
		System.out.println("�迭�� ����:" + args.length);
		System.out.println("�迭�� ù��° ��:" + args[0]);
		System.out.println("�迭�� �ι�° ��:" + args[1]); //null �ƴ�.
		
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
		
	}

}