// package
package a.b.c.ch3;

// import


public class ExFlow_7 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		
		//for (/* �ʱ�ȭ�� */; /* ���ǽ� */ ; /* ������ */)
		//{
			// ���� : ���๮
		//}

		/*
			1. �ʱ�ȭ�� ���� 
			2. ���ǽ� : ������ ����� �������� �´�. true, false
			3. ���๮ : ���ǽ��� true �� �� ����
			4. ������ ���� 
			2. ���ǽ����� �ٽ� ���� : ���ǽ��� true 
			3. ���๮ : ���ǽ��� true �� �� ����
			4. ������ ���� 
			�̰��� �ݺ� �ϴµ� 2. ���ǽ��� false �� �� ���� 	
		*/

		int i;
		int sum;
		for (i=1, sum=0; i <= 10; i++ )
		{
			System.out.println("for >>> : " + i);
			sum += i; // sum = sum + i
			System.out.println("for sum >>> : " + sum);
		}

		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		System.out.println("i >>> : " + i);

	}
}
