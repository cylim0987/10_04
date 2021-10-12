package ch07_initialBlock;

public class Init1Ex {

	public static void main(String[] args) {
	//로컬변수 i1 선언.
		Init1 i1 = new Init1();
		int[] b = i1.a; //i1.a;. 이것은 i1객체의 배열 정보를 b가 받음(얕은 복사)
		for(int i: b) { 
			
			// i1.a는 무엇인가? i1이 참조하고 있는 a(아래있는거). // 5개 랜덤나옴. 배열의 값이 들어가 있음. 생성자 없이 블럭만으로 초기화
			// b로 변경.하면 위에 int[] b= i1.a;. 이것은 i1객체의 배열 정보를 b가 받음(얕은 복사)
			
			System.out.println(i);
		}
	}
}

class Init1{
	//필드
	int[] a = new int[5];
	//초기화 블럭. 앞에 인스턴스 초기화 불럭. {초기화 내용} // 가끔 생성자 없이 블럭에다가 초기화를 넣는다.
	{
		for(int i=0; i<a.length; i++) {
			int k=(int)(Math.random()*10);
			a[i] = k;
		}
	}
}



