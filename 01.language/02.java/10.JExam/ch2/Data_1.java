package a.b.c.ch2;

/*
�ڹ��� ������ Ÿ�� : �ڷ���
- �ڹ� ������ Ÿ���� �ּ� ������ 1byte
- 1byte�� 1bit
- ��ǻ�ʹ� ������ ũ�� �������� ����� ������ �ʴ´�.
= �Ǽ��� �������� ������ ũ��.
	������ ������ �ְ�, �Ǽ��� �����ο� �Ǽ��� �� ���̹Ƿ� ����� �� ŭ
	��) long 8byte ���� float 4byte�� ũ�ٰ� ������

-JVM�� ���ڸ� int�� �ν��� (4byte/32bit)
	int�� �Ѿ�� ������ Ÿ���� �ν����� ����
	=> long, float, double ������ Ÿ���� �ν��ϱ� ���� ǥ���ؾ���
	ex) long l= 12312341231232123L;<-

- ���� �������� ����ȯ

	������ ����ȯ (implcit casting)
	����� ���� ������ Ÿ�Կ��� ū ������ Ÿ���� �����ϸ� �ڵ� ����ȯ �߻�
	����� ����Ȳ (explict casting)
	ū ������ Ÿ�Կ��� ������ ���� ������ Ÿ������ ������ �ϴ� ��� ���Ƿ� ����ȯ�� ���ֿ�����


�����ڷ��� : primitive type

����

	������ : default �� : 0
		byte  1byte(08bit) - 0�� ������ ���� ����
		short 2byte(16bit) - ���� ���� 0 ���� ����
		char  2byte(16bit) - 0�� ������ ���� ����
			-������������ ���ڷ� �����
		int   4byte(32bit) - ���� ���� 0 ���� ����
		long  8byte(64bit) - ���� ���� 0 ���� ����

	�Ǽ��� : default �� : 0.0
		float  4byte(32bit) - ���� �Ǽ� 0 ���� �Ǽ�
		double 8byte(64bit) - ���� �Ǽ� 0 ���� �Ǽ�

���� 
	���� :   char
	���ڿ� : String

��

	boolean : default �� : false
	true
	false



�����ڷ��� : reference type
	     ��Ʈ�� Ŭ���� ex) array, interface ��
	     ����� ���� Ŭ����


�ڹٴ� ��ü�����̸�, High-Level language�̴�.

�ڹٿ��� ����ϴ� ��� �ڿ��� ��ü(object)�̴�.
*������ ���ܴ� '�����ڷ���(primitive type)'

byte		Byte
char		Charcter
short		Short
int		Intger
long		Long
float		Float
double		Double
boolean		Boolean


-> ���� �ڷ����� ����ϸ� java ���������� ����ȯ �Ͽ�
���������� Wrapper class �� ����Ѵ�.

Byte
Charcter
Short
Intger
Long
Float
Double
Boolean

*/

import a.b.c.ch2.data.Data_1_Test;

public class Data_1{

//import:�ٸ� ��Ű���� �ִ� �ڿ��� ��� �� �� Ŭ���� ������ �ҷ����� Ű����
//import�� Ŭ������ ��Ű���� ���� Ŭ���� �̸� ��밡��


	//main�Լ� ����
	public static void main(String[] args){
		
		//Data_1_Test�� TEST_DATA�� �����
		//public static final int TEST_DATA=100; �̹Ƿ� �ܼ� �� ��� ���� 100
		System.out.println(a.b.c.ch2.data.Data_1_Test.TEST_DATA);

		//static�� ���� ���� ���ҽ��� ����ϱ� ���� Data_1_Test�� d1�̶�� ���������� �����ϰ�
		//new Ű���带 ���̰�, �ش� Ŭ������ �����ڷ� ���� 
		//�׸��� d1�� �ִ� i�� �����
		//i�� ���� ���� ������ new Ű����� ���� �ʱ�ȭ �Ǿ� int���� ����Ʈ���� 0�� ��
		//���� �ְܼ��� 0
		a.b.c.ch2.data.Data_1_Test d1 = new a.b.c.ch2.data.Data_1_Test();
		System.out.println(d1.i);
		
		//System.out.println(a.b.c.ch2.data.Data_1_Test.i);
		// ������ �Ͼ : static �� ���� ����

		//d1.a()=Data_1_Test�� �ִ� a�Լ��� �ҷ���
		//a�Լ��� System.out.println("Data_Test void a() �Լ�")
		// ���� �ֿܼ��� Data_Test void a() �Լ� ���� ���
		d1.a();

		
		//import�� a.b.c.ch2.data�� Data_1_Test Ŭ������ ������
		// �׷��� ������ a.b.c.ch2.data�� �����ϰ� �ٷ� Ŭ���� ���� �ᵵ ���� �ִ� �Ͱ� ������ ��� ���� ����
		Data_1_Test d2 = new Data_1_Test();
		System.out.println(d2.i);
		d2.a();

		//b�Լ��� static�� ���� �����̱� ������ newŰ���� ����� �ʿ�ġ ����
		//a.b.c.ch2.data ���丮�� �ִ� Data_1_Test�� b�Լ��� �ҷ���
		//b�Լ��� System.out.println("Data_Test void b() �Լ�");
		// ���� �ֿܼ��� Data_Test void b() �Լ��� ���
		a.b.c.ch2.data.Data_1_Test.b();

	}//end of main �Լ�

} // end of Data_1 Ŭ���� 