package Array;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조타입(String) 1차원 배열
		String[] snake = {"구렁이", "8렁이", "7렁이", "6렁이", "5렁이"};
		
		for(int i=0; i<snake.length; i++)
			System.out.print(snake[i] + " ");
		System.out.println();
	
		for(int i=(snake.length-1); i>=0; i--)
			System.out.print(snake[i] + " ");
		System.out.println();

		//향상된 for문을 이용하여 출력 - 어떻게 해야하나?
		for(String n:snake)// 이렇게..
			System.out.print(n + " ");
		
			
			
	}

}
