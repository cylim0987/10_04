package ch02;

public class Button {
//�ʵ� - ���
	OnclickListener listener;

	public void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick(); //�̰� ��� console���� �ȳ�����.
	}

//�����������̽�	- ���� //��ư�� �̺�Ʈ�� ó�����ִ� ����� ����..
	interface OnclickListener {
		void onClick();
	}

}
