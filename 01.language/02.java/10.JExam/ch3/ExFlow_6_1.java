//package
package a.b.c.ch3;
//import

public class ExFlow_6_1 {

	//���
	//�������
	//������

	//�Լ�
	//public : ��� ��Ű������ �̿� ������ �Լ�
	//static : �޸𸮿� �ڵ����� ��� -> Ŭ�����̸�.�Լ��̸�()���� ���
	//void : return Ű���� ��� �Ұ���
	public static void numSum(){
		
		//�����ڷ��� �������� ����
		//num�� ���ͷ��� 1�� �ʱ�ȭ
		int num =1;

		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;

		System.out.println("1���� 10������ ����? >>  " + num );
	}//end of numSum �Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
	//TODO Auto-generated method stub.
	
	//numSum�Լ��� ����ϱ� ���� ȣ��
	ExFlow_6_1.numSum();

	//�ݺ����� �̿��ϱ� ���� �����ڷ��� �������� num�� sum�� ���
	//ExFlow_6_1.main�� num�� ExFlow_6_1 numSum�� num�� �ٸ� ������
	// ���� 1�� 0���� �ʱ�ȭ ��Ŵ
	int num = 1;
	int sum = 0;

	//while (���ǹ�) : ���ǹ��� �����ɶ����� �ݺ���
	////�� loop�� num�� 10���� ���ų� �۴ٸ� �ݺ� => 11�� �Ǵ� ���� false�� ��
	while(num <= 10){
		
		//sum���ٰ� num�� ���� ���ϰ�
		//num�� 1�� ����
		//���� num���� 1�̸�, 1�� 10�� �ɶ����� ����
		//sum���� 0�� => 1���� 10���� ���ϴ� ���̵�
		sum +=num;
		num++;
	}//end of while��

	System.out.println("1���� 10������ ����? >>  " + sum);

	//do while ������ �ϱ�
	//�����ڷ��� �������� num�� sum ����
	// ���� 1�� 0���� �ʱ�ȭ ��Ŵ
	int num1 = 1;
	int sum1 = 0;

	//�� loop���� sum1�� num1 ���� ���ϰ�, num1�� 1�� ����
	do{
		sum1 += num1;
		num1++;
	} //�� loop�� num1�� 10���� ���ų� �۴ٸ� �ݺ� => 11�� �Ǵ� ���� false�� ��
	while (num1<=10);

	System.out.println("1���� 10������ ����? >>  " + sum1);

	System.out.println("ExFlow_6_1 main �Լ� ��>>>>>>");
	}//end of main �Լ�
}//end of ExFlow_6_1 Ŭ����
