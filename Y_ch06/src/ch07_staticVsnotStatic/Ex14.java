package ch07_staticVsnotStatic;

public class Ex14 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.printCarNo();
		Car2 c2 = new Car2();
		c2.printCarNo();
		Car2 c3 = new Car2();
		c3.printCarNo();
		
		System.out.println(Car2.seq);
	
	}

}

class Car2 {
	//static ¸â¹ö
	static int seq;
	//non - static ¸â¹ö
	int no;
	//»ý¼ºÀÚ
	Car2(){
		no=seq++;
	}
	void printCarNo() {
		System.out.println(no);
	}
	
}


