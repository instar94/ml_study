// package
package a.b.c.ch3;

// import


public class ExOper_2 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// ���� �����ڴ� ������ ����� �� ��(true, false)���� ��ȯ �Ѵ�. 
		System.out.println("���迬�� >>>>>>>>>>>>>>");
		System.out.println( 3 < 5 );
		System.out.println( 3 > 5 );
		System.out.println( 3 <= 5 );
		System.out.println( 3 >= 5 );
		System.out.println( 3 == 5 ); // == : ������ : ������ ���ϴ� ������, 
		System.out.println( 3 != 5);

		boolean bool = false;
		
		bool = 3 < 5;
		System.out.println("3 < 5 = " + bool);
		bool = 3 > 5;
		System.out.println("3 > 5 = " + bool);
		bool = 3 <= 5;
		System.out.println("3 <= 5 = " + bool);
		bool = 3 >= 5;
		System.out.println("3 >= 5 = " + bool);
		bool = 3 == 5;
		System.out.println("3 == 5 = " + bool);
		bool = 3 != 5;
		System.out.println("3 != 5 = " + bool);

		bool = 'a' < 'b';
		System.out.println(bool);
		bool = 'A' < 'B';
		System.out.println(bool);
		bool = 'A' < 40;
		System.out.println(bool);
		bool = 'A' < 0x65; // 0x65 �� 16���� 
		System.out.println(bool);
		
		bool = 'a' < '��';
		System.out.println(bool);

		bool = '��' < '��';
		System.out.println(bool);
		
		//bool = '����' < '����';
		//System.out.println(bool);
		
		//bool = "��" < "��";
		//System.out.println(bool);

		// �� ���� : &&, ||, !
		/*
			T AND T = T
			T AND F = F
			F AND T = F
			F AND F = F

			T OR T = T
			T OR F = T
			F OR T = T
			F OR F = F
		*/
		System.out.println("������ >>>>>>>>>>>>>>");
		// �������� ���迬���� ��������� ������ �Ѵ�. 
		boolean bVal = 5 > 3 && 5 > 2;
		boolean bVa11 = 5 > 3;
		System.out.println(bVa11);
		boolean bVa12 = 5 > 2;
		System.out.println(bVa12);
		System.out.println(bVal);
		boolean bVal3 = true && true;
		System.out.println(bVal3);

		boolean bV  = 5 > 3 || 5 > 2;
		boolean bV1 = 5 > 3;
		System.out.println(bV1);
		boolean bV2 = 5 > 2;
		System.out.println(bV2);
		System.out.println(bV);
		boolean bV3 = true && true;
		System.out.println(bV3);

		// �ڹ� �������� ������ : short-circuit ����
		System.out.println("�ڹ� �������� ������ : short-circuit >>>>>>>>>>>>>>");
		int num1 = 10;
		int i = 2;

		boolean v = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) < 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v);
		System.out.println(num1);
		System.out.println(i);

		boolean v1 = ((num1 = num1 + 10) > 10) && ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) > 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v1);
		System.out.println(num1);
		System.out.println(i);

		boolean v2 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) > 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v2);
		System.out.println(num1);
		System.out.println(i);

		boolean v3 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) < 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v3);
		System.out.println(num1);
		System.out.println(i);


		// ���� ���� ������
		System.out.println("���� ���� ������ >>>>>>>>>>>>>>");
		int s = 10;
		System.out.println(s += 10);
		System.out.println(s -= 10);
		System.out.println(s *= 10);

		// ���� ������ : ���� ������ 
		System.out.println("���� ������ : ���� ������ >>>>>>>>>>>>>>");
		// (���ǽ�) ? ���1 : ���2;

		int n = (5 > 3) ? 10 : 20;
		System.out.println(n);

		int n1 = (5 < 3) ? 10 : 20;
		System.out.println(n1);

		boolean b = (true) ? true : false;
		System.out.println(b);
		
		boolean b1 = (false) ? true : false;
		System.out.println(b1);

		

	}
}
