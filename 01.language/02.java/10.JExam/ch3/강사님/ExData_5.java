/*
	ExData_5 Ŭ�������� 
	�������� �ְ�, static Ű���� ���� �Լ� addMethod()�� ���� 
	�Ű����� int x, int y�� �޾Ƽ� 
	���ϱ� ����� return Ű���� ��� ������ �����

	���� �Լ����� adMethod()�� 
	�������� int�� x, y �� ������ �� 10, 20���� �ʱ�ȭ �ؼ� 
	�ƱԸ�Ʈ�� ���� �ؼ� 
	int sum ���������� ��� ���� �����ؼ� 
	�ֿܼ� ��� �Ͻÿ�.
*/

// package
package a.b.c.ch3;

// import


public class ExData_5 
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	public int addMethod(int x, int y){
		System.out.println("ExData_5.addMethod() �Լ� ���� >>> : \n");
		System.out.println("ExData_5.addMethod() x >>> : " + x);
		System.out.println("ExData_5.addMethod() y >>> : " + y);

		int sum = x + y;
		System.out.println("ExData_5.addMethod() sum >>> : " + sum);

		System.out.println("\nExData_5.addMethod() �Լ� �� >>> : ");
		return sum;

		// return x + y;
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExData_5.main() �Լ� ���� >>> : \n");

		// ��������
		int x = 10;
		int y = 20;

		ExData_5 ed5 = new ExData_5();
		System.out.println("ed5 �ּҰ� >>> : " + ed5);
		int sum = ed5.addMethod(x, y);
		System.out.println("ExData_5.main() sum >>> : " + sum);

		// �ϱ� ȣ�� ����� �˰� �� ����
		System.out.println("ExData_5 >>> : " + new ExData_5().addMethod(x, y));

		int sum1 = new ExData_5().addMethod(x, y);
		System.out.println("ExData_5.main().addMethod() sum >>> : " + sum);
		
		System.out.println("\nExData_5.main() �Լ� �� >>> : ");
	}
}
