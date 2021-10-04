package If;
/*  주사위(dice) 1~6 눈을 가진 주사위*/
public class RandomNumberExam {
	public static void main(String[] args) {
		
		
		// 0.0<= Math.random()출력범위 <1 . 난수 출력
		// 0.0*10<= Math.random()*10 <1*10 . 
		// 0.0 <=Math.random()*10 < 10
		// (int)(0.0) <= (int)(Math.random()*10) < (int)10
		
		//double ran = Math.random();
		//System.out.println(ran);
		
		//double ran = Math.random()*10;
		//System.out.println(ran);
		
		double ran = (int)(Math.random()*10); // 0.0<= 범위 < 10(9.9999...)
		System.out.println(ran);
		
		//자연수 범위의 난수 출력시
		//(int)(Math.random()*범위)+1
		int ranI = (int)(Math.random()*10)+1;// 0+1 <= 범위 +1 < 10 +1 : 0~9 => 1~10
		System.out.println(ranI);
		
		/*
		int num =5;
		//자동으로 실행될때마다 랜덤하게 값을 받고 싶다.면
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {//if(num==6) {
			System.out.println("6번이 나왔습니다.");
		}
		*/
		
		
	}

}
