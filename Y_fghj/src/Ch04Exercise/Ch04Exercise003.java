package Ch04Exercise;

public class Ch04Exercise003 {
public static void main(String[] args) {
		/*
		int sum = 0;
		for(int i=0; i<=100; i+=3) {
			sum = sum+i;
		}

		System.out.println("3의 배수의 합: " + sum);
		
		
	}
}
*/

//누적합을 위한 정수 타입 변수 선언
	int sum =0;
	for(int i=1; i<=100; i++) {
		if(i%3==0) { // ; ; ; ; ; ; ; ; ; ; ; ;
		sum += i; //sum=sum+i;
		
		}
		
	}
	System.out.println("3의 배수의 합: " + sum);
}

}