// package
package a.b.c.ch3;

// import

// Loop
public class ExFlow_6_1 
{
	// ��� 
	// �������
	int num;
	// ������

	// �Լ�
	public static void numSum(){
		
		int num = 1;
		
		num += 2; // num = num + 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;

		System.out.println("1���� 10������ ���� " + num + "�Դϴ�.");
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
	
		ExFlow_6_1.numSum();

		int num = 1;	
		int sum = 0;

		while (num <= 10)
		{
			sum += num;
			num++;
		}
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
		int num1 = 1;
		int sum1 = 0;
			
		do
		{
			sum1 += num1;
			num1++;
		}
		while (num1 <= 10);

		System.out.println("1���� 10������ ���� " + sum1 + "�Դϴ�.");
	}
}
