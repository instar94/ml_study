// package
package a.b.c.ch3;

// import

// ExFlow_7_1 Ŭ���� ���� �Լ����� for �� ����ؼ�
// �ȳ��ϼ��� ���ڿ��� �ֿܼ� 10�� ����Ͻÿ�.

public class ExFlow_7_1 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// ���α׷����� ��� �����ʹ� �� ���������� ��´�. 
		// ������ : ��Ŀ��, �迭, Array 
		// ������ �������� : 0 �Ǵ� 1 
		// ���� ���� ��� : ��Ŀ��, �迭, Array �ε���(÷��) 0 ���� �����Ѵ�. 
		// ��Ȥ �����ͺ��̽����� : �迭�� 1 ���� �����Ѵ�. : Oracle �迭 1 ���� �����Ѵ�. 
		// for ���� �׽� �迭�� ���� ����Ѵ�. 
		System.out.println("for �� >>> : ");
		for (int i=0; i < 10; i++)
		{
			System.out.println("�ȳ��ϼ��� " + i);
		}

		System.out.println("while �� >>> : ");
		int i = 0;
		while (i < 10)
		{
			System.out.println("�ȳ��ϼ��� " + i);
			i++;
		}
	}
}
