// package
package a.b.c.ch3;

// import


public class ExData_4 
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	// �������� ����, ����ƽ Ű���� ����, �Ű����� 2���ִ� �Լ� 
	public void add_0(int x, int y){
		System.out.println("ExData_4.add_0() �Լ� ���� >>> : \n");
		System.out.println("�Ű����� �������� int x �� �ƱԸ�Ʈ x�� �Ѿ�� ���� ���� int x = x >>> : " + x);
		System.out.println("�Ű����� �������� int y �� �ƱԸ�Ʈ y�� �Ѿ�� ���� ���� int y = y >>> : " + y);
		
		// �Ű����� �������� int x �� add_0() �Լ� ������ ���
		// �Ű����� �������� int y �� add_0() �Լ� ������ ���
		// x + y ���� ����� �ֿܼ� ���
		System.out.println(x + y);
		
		System.out.println("\nExData_4.add_0() �Լ� �� >>> : ");
	}

	// �������� ����, ����ƽ Ű���� ����, �Ű����� 2���ִ� �Լ�
	public void add_1(int x, int y){
		System.out.println("ExData_4.add_1() �Լ� ���� >>> : \n");
		System.out.println("�Ű����� �������� int x �� �ƱԸ�Ʈ x�� �Ѿ�� ���� ���� int x = x >>> : " + x);
		System.out.println("�Ű����� �������� int y �� �ƱԸ�Ʈ y�� �Ѿ�� ���� ���� int y = y >>> : " + y);
		
		// �Ű����� �������� int x �� add_1() �Լ� ������ ���
		// �Ű����� �������� int y �� add_1() �Լ� ������ ���
		// x + y ���� ����� int�� �������� sum �� ����
		int sum = x + y;
		// int�� �������� sum�� ȣ���ؼ� �ֿܼ� ���
		System.out.println("sum >>> : " + sum);

		System.out.println("\nExData_4.add_1() �Լ� �� >>> : ");
	}

	// �������� �ְ� : �������� int��, ����ƽ Ű���� ����, �Ű����� 2���ִ� �Լ�
	public int add_2(int x, int y){
		System.out.println("ExData_4.add_2() �Լ� ���� >>> : \n");
		System.out.println("�Ű����� �������� int x �� �ƱԸ�Ʈ x�� �Ѿ�� ���� ���� int x = x >>> : " + x);
		System.out.println("�Ű����� �������� int y �� �ƱԸ�Ʈ y�� �Ѿ�� ���� ���� int y = y >>> : " + y);
	
		// �Ű����� �������� int x �� add_2() �Լ� ������ ���
		// �Ű����� �������� int y �� add_2() �Լ� ������ ���
		
		// x + y ���� ����� ������ ������� �ʰ� return ���� ȣ���� ������ ���� �ѱ� 
		
		System.out.println("\nExData_4.add_2() �Լ� �� >>> : ");
		return x + y;
	}

	// �������� �ְ� : �������� int��, ����ƽ Ű���� ����, �Ű����� 2���ִ� �Լ�
	public int add_3(int x, int y){
		System.out.println("ExData_4.add_3() �Լ� ���� >>> : \n");
		System.out.println("�Ű����� �������� int x �� �ƱԸ�Ʈ x�� �Ѿ�� ���� ���� int x = x >>> : " + x);
		System.out.println("�Ű����� �������� int y �� �ƱԸ�Ʈ y�� �Ѿ�� ���� ���� int y = y >>> : " + y);
		
		// �Ű����� �������� int x �� add_2() �Լ� ������ ���
		// �Ű����� �������� int y �� add_2() �Լ� ������ ���
		// x + y ���� ����� int�� �������� sum �� ����
		int sum = x + y;
		
		// int�� �������� sum�� ȣ���ؼ� �ֿܼ� ���
		System.out.println("sum >>> : " + sum);

		System.out.println("\nExData_4.add_2() �Լ� �� >>> : ");
		
		// int�� �������� sum�� ȣ���ؼ� return value �� ȣ���� ������ ���� �ѱ� 
		return sum;
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExData_4.main() �Լ� ���� >>> : \n");

		// �ֿܼ� 1 + 1 ���ϱ� ��� 
		System.out.println(1 + 1);
		System.out.println("1+1=" + 1 + 1); // ���� ����
		System.out.println("1+1=" + (1 + 1)); // ���� ����

		// int i = 0;
		// �Լ� ������ int i = 0  ���� ���ο��� 
		// �Լ� ȣ���� ��� ��, ������ ��� ���� �� ����� �� �ʱ�ȭ �ؼ� ����Ѵ�.

		// int�� �������� x ���� �� ��(���ͷ�) 1 �� �ʱ�ȭ 
		int x = 1;
		// int�� �������� y ���� �� ��(���ͷ�) 1 �� �ʱ�ȭ 
		int y = 1;

		// �������� x, y ȣ���� �� x+y ���� ��� �ֿܼ� ��� 
		System.out.println(x + y);

		// �������� x, y ȣ���� ��, x + y ���� ��� ���� 
		// int�� �������� sum �� ����
		int sum = x + y;
		// �������� sum�� ȣ���ؼ� sum�� ��� ���� �ֿܼ� ��� 
		System.out.println(sum);

		// �������� ���
		// ExData_4  Ŭ���� ���� 
		// ed4 �������� ����
		// = : ���Կ����� ����
		// new Ű���� ����
		// ExData_4() ������ ���� 
		ExData_4 ed4 = new ExData_4();

		// �������� ed4 �� add_0() �Լ� ȣ��
		// �Լ� �ƱԸ�Ʈ 2�� ����
		// ù��° �ƱԸ�Ʈ ��Ʈ�� x �������� �� ����
		// �ι�° �ƱԸ�Ʈ int�� y �������� �� ����
		ed4.add_0(x, y);

		// �������� ed4 �� add_1() �Լ� ȣ��
		// �Լ� �ƱԸ�Ʈ 2�� ����
		// ù��° �ƱԸ�Ʈ ��Ʈ�� x �������� �� ����
		// �ι�° �ƱԸ�Ʈ int�� y �������� �� ����
		ed4.add_1(x, y);

		// �������� ed4 �� add_2() �Լ� ȣ��
		// �Լ� �ƱԸ�Ʈ 2�� ����
		// ù��° �ƱԸ�Ʈ ��Ʈ�� x �������� �� ����
		// �ι�° �ƱԸ�Ʈ int�� y �������� �� ����
		// �Լ��� ��� �� (return value)�� int�� sum2 ���������� ����
		int sum2 = ed4.add_2(x, y);
		// �������� sum2�� ȣ���ؼ� sum2�� ��� ���� �ֿܼ� ��� 
		System.out.println(sum2);

		// �������� ed4 �� add_3() �Լ� ȣ��
		// �Լ� �ƱԸ�Ʈ 2�� ����
		// ù��° �ƱԸ�Ʈ ��Ʈ�� x �������� �� ����
		// �ι�° �ƱԸ�Ʈ int�� y �������� �� ����
		// �Լ��� ��� �� (return value)�� int�� sum3 ���������� ����
		int sum3 = ed4.add_3(x, y);
		// �������� sum3�� ȣ���ؼ� sum3�� ��� ���� �ֿܼ� ��� 
		System.out.println(sum3);

		System.out.println("\nExData_4.main() �Լ� ���� >>> : ");
	}
}
