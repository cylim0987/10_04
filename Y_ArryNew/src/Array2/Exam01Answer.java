package Array2;


public class Exam01Answer {
	public static void main(String[] args) {
		// ������ ���� ����

		int a = 10;
		int b = 10;
		System.out.println(a == b ? "����Ÿ�� ����a�� ����Ÿ�� ���� b�� ���� �����ϴ�" : "����Ÿ�� ���� a�� ����Ÿ�� b�� ���� �ٸ���");
		System.out.println(a != b ? "����Ÿ�� ����a�� ����Ÿ�� ���� b�� ���� �ٸ���" : "����Ÿ�� ���� a�� ����Ÿ�� b�� ���� ����");

		/// ����Ÿ�� �� �� //��ü�� �ϳ� ���鋚���� new���� ��ü�� ����� �Ǵµ�, str1��ü, str2��ü�� ���������. ���� ���� �ٸ� ��ü��.
		// hello��� ������ ����. 
		String str1 = new String("hello");
		String str2 = new String("hello"); //���� �񱳴� equal������.//// == �̰Ŵ� �ּҰ� ���������� ��. 
		
		System.out.println(str1 == str2 ? "str1�� �����ϴ� �ּҿ� str2�� �����ϴ� �ּҰ� �����ϴ�" 
									: "str1�� �����ϴ� �ּҿ� str2�� �����ϴ� �ּҰ� �ٸ��ϴ�."); //�ܼ� : str1�� �����ϴ� �ּҿ� str2�� �����ϴ� �ּҰ� �ٸ��ϴ�.�� ���. ���� �����ΰ�?
		System.out.println(str1.equals(str2) ? "str1�� ����� str2�� ������ �������� �����մϴ�."
									: "str1�� ����� str2�� ������ �������� �������� �ʽ��ϴ�."); //str1�� ����� str2�� ������ �������� �����մϴ�.

		

	}
}

/*
 * // TODO Auto-generated method stub //1. id="hong", pwd="1234" // id�� pwd��
 * scanner�� �Է¹޾Ƽ� id�� pwd�� �Ѵ� ������ "login����", // �ƴϸ� "1ȸ �����Ͽ����ϴ�". ��� // 5ȸ �����ϸ�,
 * "5ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�" ��� �� ���� Scanner scanner = new Scanner(System.in);
 * int cnt=0; while(true) { String id,pwd; if(cnt==5) {//�⺻����Ÿ Ÿ���� �� ��
 * System.out.println(cnt+"ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�"); break; }
 * System.out.println("���̵�� �н����带 �Է��ϼ���."); System.out.println("���̵�>");
 * id=scanner.next(); System.out.println("�н�����>"); pwd=scanner.next();
 * if("hong".equals(id) && "1234".equals(pwd))//������ü�� �� �� �������� {"�α��� ����";
 * break;} //���н� System.out.println(cnt++ +"ȸ �����Ͽ����ϴ�."); }
 * System.out.println("���α׷� ����"); } }
 * 
 */