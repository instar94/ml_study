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

public class Data_1{

	public static void main(String[] args]{
		
		System.out.println(a.b.c.ch2.data.Date_1_Test.TEST_DATA);
		
		a.b.c.ch2.data.Data_1_Test d1 = new a.b.c.ch2.data.Data_1_Test();
		System.out.println(d1.i);
		//System.out.println(a.b.c.ch2.data.Data_1_Test.i)

		di.a();

		a.b.c.ch2.data.Data_1_Test.b();

	}//end of main �Լ�

} // end of Data_1 Ŭ����