package ch05_constructor_03_02;

public class Car {
	//�ʵ�
	String model;
	String color;
	int maxSpeed;
	
	//������	
		Car(){
			this("�׷���","���");
		}
			//���� Ŭ���������� �ٸ� ������ ȣ���
		//this()�޼ҵ�� ȣ��
		//���ǻ��� - �ݵ�� ȣ���ϴ� �������� ù ���ο� �����ؾ���.
		Car(String model){
			 //default������ ȣ��
			this.model=model;
			System.out.println("�� ���� �������?");
			
		}
		Car(String model, String color){
			//Car(model); �̷��Դ� �� �ȴ�.
			this(model);
			this.color=color;
			System.out.println("�Ű����� �ΰ�¥�� �������?");
		
		} // String, String

		Car(String model,String color, int maxSpeed){
			//Car(model,color);
			this(model,color);
			this.maxSpeed=maxSpeed;
			System.out.println("�Ű����� ����¥�� �������?");
		}//String, String, int

	//�޼ҵ�	
		
	}
	