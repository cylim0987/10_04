package ch05_constructor_02;

//��� - �ʵ�, ������, �޼ҵ�
public class Korean { //�ڸ��� Ŭ����
	// �ʵ�
	String name; //�̸�
	String sno; // �ֹι�ȣ
	//������ - 
	// default �����ڰ� �ƴ� �Ű����� 2��¥�� ������ ���� (irum, jumin)
	public Korean(String irum, String jumin)	{
		name = irum;
		sno = jumin;
	}
}

/*
������ ��
public class Korean { //�ڸ��� Ŭ����
	// �ʵ�
	String name; //�̸�
	String sno; // �ֹι�ȣ
	//������ -
	  ����. public class Korean(){}
	 



*/