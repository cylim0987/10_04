package Array;

public class A {
	//타입[] 변수명;
	//String[] args
	//main() 메소드의
	//매개변수부분()에 들어가는 배열 String[] args
	//는 길이가 정해져있지않은 배열
	//자바프로그램 실행시 argument로 나열해서 전달한다.
	//argument의 개수만큼 String[] 배열이 생성되어서 전달.
	//java A hello world my name is 길동
	//=> String[] args={hello,world,my,name,is,길동};
	public static void main(String[] args) {
		//프로그램 실행 때 (argument,인자, 매개변수(String타입의변수))를 줘서 원하는 결과를 얻기위함. args도 배열이다.
		
		System.out.println("배열의 길이:" + args.length);
		System.out.println("배열의 첫번째 값:" + args[0]);
		System.out.println("배열의 두번째 값:" + args[1]); //null 아님.
		
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
		
	}

}