//package
package a.b.c.ch3;
//import

public class ExOper {
	//flow control : if , switch, while , do while
	//���
	//�������
	//������
	
	//�Լ�
	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		
		//�����ڷ���(int) �������� num ����
		//num�� 10���� �ʱ�ȭ
		int num=10;

		//��ȣ ������
		System.out.println(num);

		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);

		num = -num;
		
		System.out.println(num);

		//��� ������

		// - �����ڴ� ������ �߿�(�տ��� �ڸ� ��)
		System.out.println(5-3);
		System.out.println(3-5);

		//% : �������� ���ϴ� ������ (������ �ƴ�) (�տ��� �ڸ� ��)
		System.out.println(5%3);
		System.out.println(3%5);

		//++i : ���� �� ��� ��
		//i++ : ���� �� �� => while.for. if������ count(����)�� ����, ���� ��ų �� �ַ� ���
		//�����ڷ���(int) �������� gameScore����
		//gameScore�� 150 ���ͷ��� �ʱ�ȭ
		int gameScore = 150;

		//++ ���� : gameScore�� ���� 1�� ����, �׸��� lastScore�� ����
		//++ ���� : ������ ����� ���� ����
		int lastScore= ++gameScore;
		System.out.println(lastScore);

		//--���� : gameScore�� ���� 1�� ��, �׸��� lastScore�� ����
		//-- ���� : ������ ����� ���� ����
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		//�����ڷ���(int) �������� gameScore1����
		//gameScore1�� 150 ���ͷ��� �ʱ�ȭ
		int gameScore1 = 150;

		//lastScore�� ���� gameScore�� �����ϰ� 1�� ������Ŵ
		//���� ++ : �����ϱ� �� ���� ���� ����
		//lastScore11 =150
		//gameScore1 : 151
		int lastScore11 = gameScore1++;
		System.out.println(lastScore11);

		//lastScore12�� ���� gameScore�� �����ϰ� 1�� ������Ŵ
		//���� -- : �����ϱ� �� ���� ���� ����
		//lastScore12 =151
		//gameScore1 : 150
		int lastScore12 = gameScore1--;
		System.out.println(lastScore12);

	}//end of main �Լ�
}//end of ExOper Ŭ����
