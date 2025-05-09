package a.b.c.ch3;

// ���� �ڷ��� �����ϱ� : primitive type
//  jvm �� ���ڸ� int �� �ȴ�, int �� �ƴ� ���� double ����. 
// 1byte : 8bit : 00000000 : 0, 00000001 : 1 : ����� ���� 2������ ����. 
/*
����
	byte : 1byte(8bit) : 0
	char : 2byte(���������� 16bit) : ' ', '\u0000'
	short : 2byte(16bit) : 0
	int : 4byte(32bit) : 0
	long : 8byte(64bit) : 0 : long l = 0l;
	float : 4byte(32bit) : 0.0 : float f = 0.0f;
	double : 8byte(64bit) : 0.0 : double d = 0.0d;
���� : �ڹٿ��� ���ڴ� ���ڷ� ����. :  char
�� boolean : 1byte : false 

ĳ���� ������ : ()
--------------> ������ ����ȯ : implicit casting 
byte < char < short < int < long < float < double 
      <------------- ����� ����ȯ : explicit casting
*/

public class ExData_1 {
	//  ExData_1 Ŭ���� ���� �����ڷ��� byte �ڷ�����(������ Ÿ��) ������� ���� �ߴ�. 
	// ��������� �����ڰ� �ʱ�ȭ �ϱ� ������ ����� ���ÿ� ���� �ʱ�ȭ ���� �ʴ´�.
	// b �������� ��ȿ����(��������) Ŭ���� �� ��ü�̴�.
	// �Լ� ���ȿ��� ����� �����Ѵ�. ��. static, new �̿��ؼ� 
	byte b;

	public static void main(String[] args) {
		// �����Լ� ���� �����ڷ��� byte �ڷ�����(������ Ÿ��) ���������� ���� �ߴ�.
		// b ��������  byte b = 0; ���� �������� ��밡���ϰ� �� ��ȿ������ main() �Լ� �� �� ����.
		byte b = 0;
		// "" ���ڿ��� + �����ڷ� �����ڷ��� �����͸� ���� ������ �� �ִ�. 
		System.out.println("b >>> : " + b);


		// b = 128;
		b = 127;
		System.out.println("b >>> : " + b);
		/*
			Ŭ���� �ڿ� = ���� + �Լ� + Ŭ����(��Ʈ�� Ŭ����, ����� ���� Ŭ����)
			1. Ŭ���� : ��Ʈ�� Ŭ����, ������� Ŭ���� : ��Ű���� �ٸ��� import Ű���� ���
			2. ���� : ������� : static (Ŭ�����̸�.�����̸�), static ���°�(��������.�����̸�) 
					 �������� : static�� ����, new ������� �ʴ´�.(�����ڷ���)
			3. �Լ� : static �ִ� �� : Ŭ�����̸�.�Լ��̸�()
					 static ���� �� : ��������.�Լ��̸�()
		*/
		/*
			Byte : java.lang.Byte : �ڹٿ��� java.lang.* ��Ű���� �ִ� Ŭ������ 
									�ҽ����� import ���� �ʾƵ� 
									�ڹٿ��� import �� �ڵ����� ���ش�. 
			MAX_VALUE : ���(constant) : public static final byte MAX_VALUE = 127;
			MIN_VALUE : ���(constant) : public static final byte MAX_VALUE = -128;
		*/
		System.out.println("Byte.MAX_VALUE >>> : " + Byte.MAX_VALUE);
		System.out.println("Byte.MIN_VALUE >>> : " + Byte.MIN_VALUE);


	} // end of main �Լ� 

} // end of ExData_1 Ŭ���� 