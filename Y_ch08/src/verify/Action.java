//5. ������ Action �������̽��Դϴ�.
//work () �߻� �޼ҵ�� ��ü�� �۾��� ���۽�ŵ�ϴ�.
package verify;

public interface Action {
	void work();
}

class BookAction implements Action {

	@Override
	public void work() {
		System.out.println("������ ���");
	}

}

class CheckOutAction implements Action {

	@Override
	public void work() {
		System.out.println("������ �뿩");

	}
}

class CheckInAction implements Action{

	@Override
	public void work() {
		System.out.println("������ �ݳ�");
		
	}
	
}






