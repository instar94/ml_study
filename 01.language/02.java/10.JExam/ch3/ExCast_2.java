//package
package a.b.c.ch3;
//import

public class ExCast_2 {

	//���
	//�������
	//������

	//�Լ�
	
	//�Լ� : int�� ��������� �Լ� aM()
	//�Ű����� : byte�� x1�� y2
	//x1�� y2�� ���� �� = byte����
	//�Լ��� int �������� �Ű������� byte����
	public int aM(byte x1, byte y2){

		System.out.print("\nExCast_2.aM �Լ� ���� >>>>>:\n");
		//sum�� byte����
		byte sum = (byte)(x1 + y2);

		//byte�� sum�� return���� ��
		//return�� �Լ����� �����ؾ���
		//return(byte)�� int aM�� �ִ� ���̱� ������ ������ ����ȯ �߻�

		System.out.print("\nExCast_2.aM �Լ� �� >>>>>:\n");
		return sum;

	}//end of aM()�Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) 
	{//TODO Auto-generated method stub.
		
		System.out.print("\nExCast_2.main �Լ� ���� >>>>>:\n");
		//�����ڷ��� ���� x�� y�� �����ϰ�
		//���� 1�� 2 ������ �ʱ�ȭ
		byte x = 1;
		byte y = 2;

		//�Ϲ��Լ� aM�� �̿��ϱ����� �������� ����
		ExCast_2 ec2 = new ExCast_2();

		//int�� sum�� ec2.aM �Լ� ���� ����
		int sum = ec2.aM(x,y);

		//sum ���� �ֿܼ� �����
		System.out.println("sum >>>>>>>:"+sum);

		System.out.print("\nExCast_2.main �Լ� �� >>>>>:\n");
	}//end of main �Լ�
}//end of ExCast_2 Ŭ����
