/*
1. ��Ģ���� ���α׷� ����� 
2. ��Ģ ������ : +, -, *, /
3. ���� : main�Լ� �������� int x, int y �ʱ�ȭ�� 20, 10 ���� �Ѵ�.
4. ���ϱ� �Լ� : public int addM(int x, int y)
5. ���� �Լ� : public int subM(int x, int y)
6. ���ϱ� �Լ� : public int mulM(int x, int y)
7. ������ �Լ� : public int divM(int x, int y)
8. �� ������ �Լ� ������ �ϰ� ����� int sum ���� �޴´�.
9. �� ������ �Լ� ������ ������ �������� int sum ���� �Ѵ�.
10. main() �Լ� �� ������ �Լ��� ȣ���ؼ�  ��� ���� 
    �ϱ� ���������� �޾Ƽ� �ֿܼ� ����Ѵ�.
    int addV, int subV, int mulV, int divV
	�� ������ �Լ� ȣ���� ���������� �̿��Ѵ�. 
11. ��Ű���� a.b.c.ch3; ���� �Ѵ�. 
*/
// package
package a.b.c.ch3;

// import


public class ExData_6 
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	// ���ϱ�
	public int addM(int x, int y) {
		System.out.println("\nExData_6.addM() �Լ� ���� >>> : \n");
		System.out.println("ExData_6.addM() x >>> : " + x);
		System.out.println("ExData_6.addM() y >>> : " + y);

		int sum = x + y;
		System.out.println("ExData_6.addM() >>> : " + x + " + " + y +" = " + sum);

		System.out.println("\nExData_6.addM() �Լ� �� >>> : \n");
		
		return sum;
	}

	// ����
	public int subM(int x, int y)  {
		System.out.println("\nExData_6.subM() �Լ� ���� >>> : \n");
		System.out.println("ExData_6.subM() x >>> : " + x);
		System.out.println("ExData_6.subM() y >>> : " + y);

		int sum = x - y;
		System.out.println("ExData_6.subM() >>> : " + x + " - " + y +" = " + sum);

		System.out.println("\nExData_6.subM() �Լ� �� >>> : \n");
		
		return sum;
	}

	// ���ϱ�
	public int mulM(int x, int y)  {
		System.out.println("\nExData_6.mulM() �Լ� ���� >>> : \n");
		System.out.println("ExData_6.mulM() x >>> : " + x);
		System.out.println("ExData_6.mulM() y >>> : " + y);

		int sum = x * y;
		System.out.println("ExData_6.mulM() >>> : " + x + " * " + y +" = " + sum);

		System.out.println("\nExData_6.mulM() �Լ� �� >>> : \n");
		
		return sum;
	}

	// ������
	public int divM(int x, int y)  {
		System.out.println("\nExData_6.divM() �Լ� ���� >>> : \n");
		System.out.println("ExData_6.divM() x >>> : " + x);
		System.out.println("ExData_6.divM() y >>> : " + y);

		int sum = x / y;
		System.out.println("ExData_6.divM() >>> : " + x + " / " + y +" = " + sum);

		System.out.println("\nExData_6.divM() �Լ� �� >>> : \n");
		
		return sum;
	}
	
	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExData_6.main() �Լ� ���� >>> : \n");

		// �������� �ʱ�ȭ 
		int x = 20;
		int y = 10;

		// �������� ����
		ExData_6 ed6 = new ExData_6();
		System.out.println("ed6 �ּҰ� >>> : " + ed6);

		/*
		ExData_6 ed6_1 = new ExData_6();
		System.out.println("ed6_1 �ּҰ� >>> : " + ed6_1);

		ExData_6 ed6_2 = new ExData_6();
		System.out.println("ed6_2 �ּҰ� >>> : " + ed6_2);
		*/

		// ���ϱ� ����� ���ϱ� 
		int addV = ed6.addM(x, y);
		System.out.println("ExData_6.main() : addV >>> : " + addV);

		// ���� ����� ���ϱ�
		int subV = ed6.subM(x, y);
		System.out.println("ExData_6.main() : subV >>> : " + subV);

		// ���ϱ� ����� ���ϱ�
		int mulV = ed6.mulM(x, y);
		System.out.println("ExData_6.main() : mulV >>> : " + mulV);

		// ������ ����� ���ϱ�
		int divV = ed6.divM(x, y);
		System.out.println("ExData_6.main() : divV >>> : " + divV);

		System.out.println("\nExData_6.main() �Լ� �� >>> : \n");
	}
}
