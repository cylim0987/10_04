package ch02;

public class Button {
//필드 - 사용
	OnclickListener listener;

	public void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick(); //이게 없어서 console값이 안나왔음.
	}

//내부인터페이스	- 선언 //버튼은 이벤트를 처리해주는 기능을 가진..
	interface OnclickListener {
		void onClick();
	}

}
