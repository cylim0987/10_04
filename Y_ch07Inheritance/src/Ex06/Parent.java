/*6. Parent Ŭ������ ��ӹ޾� Child Ŭ������ ������ ���� �ۼ��߽��ϴ�.
 ChildExample Ŭ����
�� �������� �� ȣ��Ǵ� �� Ŭ������ �������� ������ �����ϸ鼭
 ��� ����� �ۼ��غ�����.*/

package Ex06;

public class Parent {
	public String nation;

	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call"); //2
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call"); //1
	}

}
