package Literal;

public class VariableToBinaryExam {
// 2진수 바꾸는 방법
	public static void main(String[] args) {
		/*
		int v1 = 10;
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary2(24));

	}
	public static String toBinary(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() <32) {
			str = "0" + str;
		}
		return str;
	}
	
	public static String toBinary(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() <64) {
			str = "0" + str;
		}
		return str;
	}	
}
*/
int v1 = 24;// 
//long l2 = 24;

System.out.println(toBinary(v1));
System.out.println(toBinary2(24));
}

public static String toBinary(int value) {
String str = Integer.toBinaryString(value);
while(str.length() <32) {
	str = "0" + str;
}
return str;
}

public static String toBinary2(int value) {
String str = Integer.toBinaryString(value);
while(str.length() <64) {
	str = "0" + str;
}
return str;
}
}
