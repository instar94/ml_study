//package
package a.b.c.ch3;

//import
public class ExCast_3 {

	//���
	//�������
	//������

	//�Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) 
	{//TODO Auto-generated method stub.
		System.out.println("\nExCast_3.main �Լ� ����>>>>\n");
	
		//�����ڷ��� �������� i ����
		//i�� 10�̶�� ���ͷ��� �ʱ�ȭ
		int i =10;

		//�����ڷ��� �������� b ����
		//b�� i���� ȣ���Ͽ� ������
		//����� ����ȯ�� ���� ĳ���� ������ ()�� ���
		//�����ʿ��� ������ ����
		byte b = (byte) i; //<=����� ����ȯ

		//byte b = i;
		//���� �߻� : ���� ������ byte�� ū ������ int�� �������� ����ȯ�� �ʿ�

		//i�� b�� �ֿܼ� ���
		//Integer.toBinaryString : int�� 2������ �ٲ�
		System.out.println("i>>>>>>>>:"+i);
		System.out.println(Integer.toBinaryString(i));

		System.out.println("b>>>>>>>>:"+b);
		System.out.println(Integer.toBinaryString(b));
		
		//�����ڷ��� �������� int�� i1 ����
		//���� ���ͷ� 1000���� �ʱ�ȭ
		int i1=1000;

		//�����ڷ��� �������� byte�� b1����
		//���� i1�� byte������ ����� ����ȯ��
		//i1�� int���̱� ������ ���� byte���� ū int���� �ֱ� ���� ����� ����ȯ�� �ʿ���
		byte b1 = (byte)i1;

		//�ֿܼ� i1�� ���
		System.out.println("i1>>>>>>>>:"+i1);
		System.out.println(Integer.toBinaryString(i1));
		//�ְܼ�
		//i1>>>>>>>>:1000
		//1111101000
		
		//�ֿܼ� b1�� ���
		System.out.println("b1>>>>>>>>:"+b1);
		System.out.println(Integer.toBinaryString(b1));
		//�ְܼ�
		//b1>>>>>>>>:-24
		//11111111111111111111111111101000
		//1000�̶�� ���ڴ� byte�� �ִ밪�� �Ѿ��� ������ ���� �ٸ� ���ڰ� ����
		//toBinaryString�� �̿��ؼ� ���� ���� �ٸ� ������

		//byte�� �ִ밪 �ּҰ� ���
		System.out.println("Byte�ִ밪>>>>>:"+Byte.MAX_VALUE);
		System.out.println("Byte�ִ밪>>>>>:"+Byte.MIN_VALUE);
		
		//�����ڷ��� ��������(double-�Ǽ���) d ����
		//���� d�� 3.14���� �ʱ�ȭ
		double d = 3.14;

		//�����ڷ��� ��������(int-������) i2 ����
		//i2�� double�� d�� ȣ���ϰ� ���������� �ٲ� �� ����
		//int < double �̱� ������ ����� ����ȯ�� �ʿ�
		//�Ǽ� -> ���� ����ȯ �� ������(�Ҽ��� ����)�� �����Ѵ�.
		int i2 =(int)d;//<-����� ����ȯ
		
		//d�� i2�� �ֿܼ� ���
		System.out.println("d>>>>>>:"+d);
		System.out.println("i2>>>>>:"+i2);
		//�ְܼ�
		//d>>>>>>:3.14
		//i2>>>>>:3 <- �����ΰ� ������

		System.out.println("\nExCast_3.main �Լ� ��>>>>\n");

	}//end of main �Լ�
}//end of ExCast_3 Ŭ����
