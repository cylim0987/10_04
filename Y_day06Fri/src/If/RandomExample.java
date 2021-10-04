package If;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수를 이용하여
		// 61~70사이의 무작위의 값 출력, ((int) 61, 62, 63 ~ 70)
		// 61 +0, 
		
		int ran = (int)Math.random()+61;
		System.out.println(ran);
		
		int num = (int)(Math.random()*10); // 0<= <10
		System.out.println(61+num);
		
		
	}

}
