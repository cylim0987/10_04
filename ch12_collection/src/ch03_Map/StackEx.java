package ch03_Map;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println(stack.peek()); // 5
		System.out.println("---------------------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println(stack.pop()); // 저장할때는 12345순으로 했는데 출력은 54321

		}

	}
}
