package a.b.c.ch3;

/*
�����ڷ���
1byte = 8bit : ����� ���� 2������ ��
jvm�� ���ڸ� int, int�� �ƴ� ���� double�� ����
����
	byte  :1byte : 0
	char  :2byte : ' ', \u0000
	short :2byte : 0
	int   :4byte : 0
	long  :8byte : 0.0
	float :8byte : 0.0f
	double:8byte : 0.0d
		float�� double�� ���� ǥ�ø� ���־�� ��

���� : char : �ڹٿ��� ���ڴ� ����
�� : 
	boolean:1byte

ĳ���� ������ : ()
------> ������ ����ȯ (implict casting)
byte < char < short< int < long < float < double
	   <---------����� ����ȯ (explict casting)
*/
public class ExData_1{
	//Ex_Data_1Ŭ���� ���� �����ڷ��� byte �ڷ����� (������Ÿ��) ������� ����
	// ��������� �����ڰ� �ʱ�ȭ �ϱ� ������ ����� ���ÿ� �ʱ�ȭx
	//b �������� ��ȿ���� �������� Ŭ���� �� ��ü�̴�.
	byte b;

	public static void main(String[] args){
	//�����Լ� ���� �����ڷ��� byte �ڷ����� (������ Ÿ��) ���������� ����
	// b�������� byte=0; ���� �������� ��� �����ϰ� �� ��ȿ������ main()�Լ� �� ������
	byte b =0;

	System.out.println("b>>>>>>>"+b);

	//b=128;
	//���� �߻�
	//���� ���� : byte�� 127���� �ۿ� ǥ�� ����
	b = 127;

	//MAX_VALUE : �ش� �ڷ����� ǥ�� �� �� �ִ� �ִ�ġ
	//A constant holding the maximum value a byte can have, 2^7-1.
	//MIN_VALUE : �ش� �ڷ����� ǥ�� �� �� �ִ� ����ġ
	System.out.println("b>>>"+b);
	/*
	Ŭ���� �ڿ� = ����+�Լ�+Ŭ����(��Ʈ�� Ŭ����, ����� ���� Ŭ����)
	1. Ŭ���� : ��Ʈ�� Ŭ����, ����� ���� Ŭ����(��Ű���� �ٸ� �� import Ű���� ���)
	2. ���� : �������: static, static �ִ� ��
		      �������� : static ����, new�� ��� ���� ����(���� �ڷ���)
	
	Byte : java.lang.byte : �ڹٿ��� java.lang ��Ű���� �ִ� Ŭ����
	�ҽ����� import���� �ʾƵ� �ڹٿ��� �˾Ƽ� import��
	MAX_VALUE : ��� = public static final byte MAX_VALUE =127;

	MIN_VALUE : ��� = public static final byte MAX_VALUE =-128;
	*/
	System.out.println("Byte.Max_VALUE>>>"+Byte.MAX_VALUE);
	System.out.println("Byte.MIN_VALUE>>>"+Byte.MIN_VALUE);

	}//end of main �Լ�1
}//end of ExData_1Ŭ����