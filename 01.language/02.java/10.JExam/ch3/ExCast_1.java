//package
package a.b.c.ch3;

//import

public class ExCast_1 {

	//���
	//�������
	//������

	//�Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) 
	{//TODO Auto-generated method stub.

		/*
		ĳ���� ������ ()
		�ڹٿ����� ���Կ����� '='�� �������� ������ Ÿ���� �����ؾ���
		�¿��� ������Ÿ���� �������� ������ ĳ���� ������ '()'�� ���
		*/

		//�����ڷ���(byte) �������� b�� �����ϰ� 10���� �ʱ�ȭ
		byte b = 10;

		//�����ڷ���(int) �������� i�� �����ϰ� ���� b�� �ʱ�ȭ
		int i = (int)b;

		//int i = b; <- ������ ����ȯ
		//byte�� int�� ǥ��
		//byte < int �̱� ������ �������� ����ȯ�� �Ͼ
		//ĳ���� ������ () �� ��� ��

		//���� b�� i ���� �ֿܼ� ���
		System.out.println(b);
		System.out.println(i);

		//�����ڷ���(int) �������� i1�� �����ϰ� 20���� �ʱ�ȭ
		int i1 = 20;

		//�����ڷ���(float) �������� f�� �����ϰ� ���� i1�� �ʱ�ȭ
		float f = (float)i1;

		//float f = i1;<- ������ ����ȯ
		//int(������)�� float(�Ǽ���)���� ǥ�� 
		//int < float �̱� ������ ������ ����ȯ�� �Ͼ
		//ĳ���� ������ ()�� ��� ��

		//���� i1�� f ���� �ֿܼ� ���
		System.out.println(i1);
		System.out.println(f);


		//������ i �� �Ǽ��� f �� ���� �Ǽ��� d�� ���
		//int < float < double �̱� ������
		//������� �Ǽ������� ���´�.
		// �� ū������ ���� ������ ������ ����ȯ�� �Ͼ

		//�����ڷ��� d�� ����
		//�� ���� i�� f�� ���� ����
		double d;
		d = i + f;
		
		System.out.println(d);

	}//end of main �Լ�
}//end of ExCast_1 Ŭ����
