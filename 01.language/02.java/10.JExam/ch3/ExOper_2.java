//package
package a.b.c.ch3;
//import

public class ExOper_2{
	//���
	//�������
	//������
	
	//�Լ�
	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		
		//���迬���� : ������ ����� �� ��(boolean)���� ��ȯ
		//boolean : true of false
		System.out.println(3<5);
		System.out.println(3>5);
		System.out.println(3<=5);
		System.out.println(3<=5);

		//== : ������ cf) = : ���Կ�����
		System.out.println(3==5);
		//!: �ݴ�� != ���� ������
		System.out.println(3!=5);

		//�����ڷ���(boolean) �������� bool ����
		//bool�� false�� �ʱ�ȭ��
		boolean bool = false;

		bool = 3 < 5;
		System.out.println("3 < 5 :"+bool);

		bool = 3 > 5;
		System.out.println("3 > 5 :"+bool);

		bool = 3 <= 5;
		System.out.println("3 <= 5 :"+bool);

		bool = 3 >= 5;
		System.out.println("3 >= 5 :"+bool);

		bool = 3 == 5;
		System.out.println("3 == 5 :"+bool);

		bool = 3 != 5;
		System.out.println("3 != 5"+bool);


		//���� ��Һ�
		bool = 'a' < 'b';
		System.out.println("a < b" +bool);

		bool = 'A' < 'B';
		System.out.println("A < B" +bool);

		bool = 'A' < 40;
		System.out.println("A < 40 "+bool);

		bool = 'A'< 0x65;
		System.out.println("A < 0x65" +bool);

		bool= 'a' < '��';
		System.out.println("a < �� " +bool);
		
		bool= '��' < '��';
		System.out.println("�� < �� " +bool);

		/*
		
		���迬���ڴ� �����ڷ����� ����
		
		���ڿ��̶� �Ұ���
		bool= '����' < '����';
		System.out.println("���� < ���� " +bool);

		"��"�� ���������̼�(���ڿ�)�� �����ؼ� �Ұ���
		bool= '��' < "��";
		System.out.println("�� < �� " +bool);
		*/

		/*
		�������� : &&,||,!
		T AND T = T
		T AND F = F
		F AND T = F
		F AND F = F

		T OR T = T
		T OR F = T
		F OR T = T
		F OR F = F
		*/
		System.out.println("������ >>>>>>>>\n");

		boolean bVal = 5 > 3 && 5 > 2;
		boolean bVal11 = 5 > 3;
		System.out.println(bVal11);
		boolean bVal12 = 5 > 2;
		System.out.println(bVal12);
		boolean bVal13 = true && true;
		System.out.println(bVal13);

		boolean bv = 5 > 3 || 5 > 2;
		boolean bv1 = 5 > 3;
		System.out.println(bv1);
		boolean bv2 = 5 > 2;
		System.out.println(bv2);
		boolean bv3 = true || true;
		System.out.println(bv3);

		//�ڹ� �������� ������ : short-circuit
		//�������� ��� ���� ����ϴ� ���� �ƴ϶� �ϳ��� ���� �Ǵ�
		//ex) F and T �� F and F �� ó���� F�� ��ǻ� false�̱� ������ �ݸ� ���� ������ ǰ

		int num1 = 10;
		int i = 2;

		//num1 = 30 / i =4 
		//false and true
		//������ �����򰡷� ���� i�� 2���� ������
		boolean v = ((num1= num1 + 10)) < 10 &&((i = i + 2)< 10);
		System.out.println(v);//�ְܼ� : fasle
		System.out.println(num1);//�ְܼ� : 20 
		System.out.println(i);//�ְܼ� : 2 <- ����������

		//num1 = 30 / i = 4
		//true or true
		// �Ѵ� true
		//������ ���� �򰡷� ���Ͽ� num1�� 30�� ���Ե�����
		//i�� 4�� �ƴ� 2�� ������
		v = ((num1 = num1 + 10) > 10) || ((i = i + 2)< 10);
		System.out.println(v);//�ְܼ� : true
		System.out.println(num1);//�ְܼ� : 30
		System.out.println(i); //�ְܼ� : 2 <-������ ����

		v = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(v);
		System.out.println(num1);
		System.out.println(i);

		v = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(v);
		System.out.println(num1);
		System.out.println(i);


		//���� ���Կ�����
		//�� ���� �����ڸ� ���ļ� ���ο� �ǹ̷� ����ϴ� ������
		System.out.println("���մ��� ������ >>>>>>>>>>");
		
		//�����ڷ���(int) �������� s ����
		// s�� ���ͷ� 10���� �ʱ�ȭ
		int s = 10;
		//s�� ȣ���ϰ� 10�� ����
		//+= ���ʿ� �ִ°ſ� ���� ����
		System.out.println(s +=10);
		//-=:���ʿ� �ִ� ���� ������ ���� ��
		System.out.println(s -=10);
		//*=: ���ʿ� �ִ� ���� ������ ���� ����
		System.out.println(s*=10);

		//���� ������ : ���� ������
		System.out.println("���� ������ : ���� ������ >>>>>>");
		//(���ǽ�) ? ���1 : ���2

		//5 > 3�� true�� 10 // false 20
		int n = (5 > 3) ? 10 : 20;
		System.out.println(n);

		int n1 = (5 < 3) ? 10 : 20;
		System.out.println(n1);

	}//end of main �Լ�
}//end of ExOper_2
