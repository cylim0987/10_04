package ch05_constructor_03;

public class Car {

		//������ �����ε�
		//signature(�ñ״�ó)-����ΰ� �ٸ��� �ٸ� �����ڷ� �ν�(jvm) 
		//�Ű������� Ÿ��,����,���� �� �ٸ��� �ٸ� ������
		Car(){}
		Car(String model){}
		Car(String model, String color){} // String, String
		//Car(String color, String model){} - �����ε� �ƴ� String, String
		Car(String model,String color, int maxSpeed){}//String, String, int
		Car(int maxSpeed,String model,String color){}//int, String, String

		//String str = new String("ȫ�浿");
	}
	// ������ �����ε� - �̸��� ���� �����ڰ� ������ �ִ�.

	/*
	//������ �����ε�
	//signatur(�ñ״�ó) - ����ΰ� �ٸ��� �ٸ� �����ڷ� �ν�(jvm)
	//�Ű������� Ÿ��, ����, ����
	Car(){}
	Car(String model){}
	Car(String model, String color){} // String, String
	//Car(String color, String model){} - �����ε� �ƴ� String, String
	Car(String model, String, int maxSpeed){} // String, String, int
	Car(int maxSpeed, String model, String color){}//int, String, String
	
	
	
	
	
}
 */
	